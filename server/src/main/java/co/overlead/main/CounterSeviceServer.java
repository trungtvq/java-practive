package co.overlead.main;

import co.overlead.database.IRedis;
import com.example.grpc.CounterServiceGrpc;
import com.example.grpc.Counterservice;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

public class CounterSeviceServer {
    private static final Logger logger = Logger.getLogger(CounterServer.class.getName());

    private Server server;

    private void start() throws IOException {
        /* The port on which the server should run */
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
            System.out.println("get:"+IRedis.SYNC_COMMAND.get(req.getUserId()));
            Long value=0L;
            if (IRedis.SYNC_COMMAND.get(req.getUserId())==null){
                System.out.println("NOT existed user" +req.getUserId());

            } else{
                value=Long.parseLong(IRedis.SYNC_COMMAND.get(req.getUserId()).toString());
                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(value).build();

                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            }

        }


        @Override
        public void increaseBalance(Counterservice.UserReq req, StreamObserver<Counterservice.BalanceRes> responseObserver){
            Long value=0L;
            System.out.println("increase:"+IRedis.SYNC_COMMAND.get(req.getUserId()));

            if (IRedis.SYNC_COMMAND.get(req.getUserId())==null){
                System.out.println("NOT existed user" +req.getUserId());
                System.out.println("Creating" +req.getUserId());
                IRedis.SYNC_COMMAND.set(req.getUserId(),req.getBalance());
                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(req.getBalance()).build();
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            } else{

                System.out.println(value);
                value=Long.parseLong(IRedis.SYNC_COMMAND.get(req.getUserId()).toString());
                Long newVal=value+ req.getBalance();

                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(newVal).build();
                IRedis.SYNC_COMMAND.set(req.getUserId(),newVal.toString());
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            }
        }

        @Override
        public void decreaseBalance(Counterservice.UserReq req, StreamObserver<Counterservice.BalanceRes> responseObserver){
            Long value=0L;
            System.out.println("decrease:"+IRedis.SYNC_COMMAND.get(req.getUserId()));
            if (IRedis.SYNC_COMMAND.get(req.getUserId())==null){
                System.out.println("NOT existed user" +req.getUserId());
                System.out.println("Creating" +req.getUserId());
                IRedis.SYNC_COMMAND.set(req.getUserId(),-req.getBalance());

                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(req.getBalance()).build();
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            } else{

                value=Long.parseLong(IRedis.SYNC_COMMAND.get(req.getUserId()).toString());

                System.out.println(value);
                Long newVal=value-req.getBalance();

                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(newVal).build();
                IRedis.SYNC_COMMAND.set(req.getUserId(),newVal.toString());
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            }
        }

        @Override
        public void setBalance(Counterservice.UserReq req, StreamObserver<Counterservice.BalanceRes> responseObserver){
            Long value=0L;
            System.out.println("set:"+IRedis.SYNC_COMMAND.get(req.getUserId()));
            if (IRedis.SYNC_COMMAND.get(req.getUserId())==null){
                System.out.println("NOT existed user" +req.getUserId());
                System.out.println("Creating" +req.getUserId());
                IRedis.SYNC_COMMAND.set(req.getUserId(),req.getBalance());
                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(req.getBalance()).build();
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            } else{
                Long newVal=req.getBalance();
                Counterservice.BalanceRes reply= Counterservice.BalanceRes.newBuilder().setBalance(newVal).build();
                IRedis.SYNC_COMMAND.set(req.getUserId(),newVal.toString());
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            }
        }
    }
}
