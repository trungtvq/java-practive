package co.overlead.main;

import co.overlead.database.IRedis;
import com.example.grpc.CounterServiceGrpc;
import com.example.grpc.Counterservice;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class CounterSeviceServer {
    private static final Logger logger = LogManager.getLogger(CounterSeviceServer.class.getName());

    private Server server;

    private void start() throws IOException {
        /* The port on which the server should run */

        logger.trace("tracing... ...");
        logger.debug("debuging ... ...");

        logger.info("info ... ... ");
        logger.warn("warning .... ... ");
        logger.error("error ... ... ");
        logger.fatal("fatal ... ...");

        int port = 9090;
        server = ServerBuilder.forPort(port)
                .addService(new CounterServiceImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                // IRedis.USER_SYNC_COMMAND.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                CounterSeviceServer.this.stop();
                System.err.println("*** server shut down");

            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    //service CounterService{
    //    rpc SetBalance(UserReq) returns (BalanceRes);
    //    rpc GetBalance(UserReq) returns (BalanceRes);
    //    rpc IncreaseBalance(UserReq) returns (BalanceRes);
    //    rpc DecreaseBalance(UserReq) returns (BalanceRes);
    //}
    //
    //message UserReq{
    //    string userId = 1;
    //    int64 balance = 2;
    //}
    //
    //message BalanceRes{
    //    int64 balance = 1;
    //}
    /** Say hello to server. */
    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final CounterSeviceServer server = new CounterSeviceServer();
        server.start();
        server.blockUntilShutdown();
    }

    static class CounterServiceImpl extends CounterServiceGrpc.CounterServiceImplBase {


        @Override
        public void getBalance(Counterservice.UserReq req, StreamObserver<Counterservice.BalanceRes> responseObserver){

            Long value=0L;
            if (IRedis.USER_SYNC_COMMAND.get(req.getUserId())==null){
                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(0).build();

                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            } else{
                value=Long.parseLong(IRedis.USER_SYNC_COMMAND.get(req.getUserId()).toString());
                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(value).build();

                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            }

        }


        @Override
        public void increaseBalance(Counterservice.UserReq req, StreamObserver<Counterservice.BalanceRes> responseObserver){

            if (IRedis.USER_SYNC_COMMAND.get(req.getUserId())==null){
                Long value=req.getBalance();
                IRedis.USER_SYNC_COMMAND.set(req.getUserId(),value.toString());
                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(req.getBalance()).build();
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            } else{

                Long value= (Long) req.getBalance();

                // IRedis.USER_SYNC_COMMAND.set(req.getUserId(),newVal.toString());
                IRedis.USER_SYNC_COMMAND.incrby(req.getUserId(),value);
                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(value).build();
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            }
        }

        @Override
        public void decreaseBalance(Counterservice.UserReq req, StreamObserver<Counterservice.BalanceRes> responseObserver){

            if (IRedis.USER_SYNC_COMMAND.get(req.getUserId())==null){
                Long value=-req.getBalance();
                IRedis.USER_SYNC_COMMAND.set(req.getUserId(),value.toString());

                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(req.getBalance()).build();
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            } else{


                Long value=req.getBalance();

                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(value).build();
                IRedis.USER_SYNC_COMMAND.decrby(req.getUserId(),value);
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            }
        }

        @Override
        public void setBalance(Counterservice.UserReq req, StreamObserver<Counterservice.BalanceRes> responseObserver){
            Long value=0L;
            if (IRedis.USER_SYNC_COMMAND.get(req.getUserId())==null){

                Long val=req.getBalance();
                IRedis.USER_SYNC_COMMAND.set(req.getUserId(),val.toString());

                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(req.getBalance()).build();

                responseObserver.onNext(reply);
                responseObserver.onCompleted();

            } else{
                Long newVal=req.getBalance();
                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(newVal).build();
                IRedis.USER_SYNC_COMMAND.set(req.getUserId(),newVal.toString());
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            }
        }
    }
}