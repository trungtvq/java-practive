package co.overlead.main;
import clojure.lang.ExceptionInfo;
import co.overlead.database.IRedis;
import com.sun.jersey.server.impl.model.parameter.multivalued.StringReaderProviders;
import examples.gRPC.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;
public class CounterServer {

        private static final Logger logger = Logger.getLogger(CounterServer.class.getName());

        private Server server;

        private void start() throws IOException {
            /* The port on which the server should run */
            int port = 9090;
            server = ServerBuilder.forPort(port)
                    .addService(new CounterImpl())
                    .build()
                    .start();
            logger.info("Server started, listening on " + port);

            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                    System.err.println("*** shutting down gRPC server since JVM is shutting down");
                    CounterServer.this.stop();
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

        /**
         * Main launches the server from the command line.
         */
        public static void main(String[] args) throws IOException, InterruptedException {
            final CounterServer server = new CounterServer();
            server.start();
            server.blockUntilShutdown();
        }

        static class CounterImpl extends CounterServiceGrpc.CounterServiceImplBase {

            @Override
            public void createUser(UserReq req, StreamObserver<Result> responseObserver) {

                Result reply =null;


                if (IRedis.SYNC_COMMAND.get(req.getUsername())==null){
                    IRedis.SYNC_COMMAND.set(req.getUsername(),"0");
                    reply= Result.newBuilder().setResult("Success").build();
                    System.out.println("Success created user" +req.getUsername());
                } else{
                    reply= Result.newBuilder().setResult("Failed").build();
                    System.out.println("Failed: Exist user " +req.getUsername());
                }

                responseObserver.onNext(reply);
                responseObserver.onCompleted();

            }
//rpc GetBalance(UserReq) returns (GetBalanceReply){}
//    rpc SetBalance(SetBalanceReq) returns (GetBalanceReply){}
            @Override
            public void getBalance(UserReq req, StreamObserver<GetBalanceReply> responseObserver){

                Long value=0L;
                if (IRedis.SYNC_COMMAND.get(req.getUsername())==null){
                    System.out.println("NOT existed user" +req.getUsername());

                } else{
                    value=Long.parseLong(IRedis.SYNC_COMMAND.get(req.getUsername()).toString());
                    GetBalanceReply reply=GetBalanceReply.newBuilder().setBalance(value).build();

                    responseObserver.onNext(reply);
                    responseObserver.onCompleted();
                }

            }


            @Override
            public void setBalance(SetBalanceReq req, StreamObserver<GetBalanceReply> responseObserver){
                Long value=0L;
                if (IRedis.SYNC_COMMAND.get(req.getUsername())==null){
                    System.out.println("NOT existed user" +req.getUsername());

                } else{
                    value=Long.parseLong(IRedis.SYNC_COMMAND.get(req.getUsername()).toString());
                    Long newVal=req.getBalanceChange()+value;
                    GetBalanceReply reply=GetBalanceReply.newBuilder().setBalance(newVal).build();
                    IRedis.SYNC_COMMAND.set(req.getUsername(),newVal.toString());
                    responseObserver.onNext(reply);
                    responseObserver.onCompleted();
                }
            }
        }


}
