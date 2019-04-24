package co.overlead.auth;

import co.overlead.database.IRedis;
import co.overlead.gRPC.AuthGrpc;
import co.overlead.gRPC.SignInReq;
import co.overlead.gRPC.SignInRes;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class AuthService  {

    private Server server;

    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 9090;
        server = ServerBuilder.forPort(port)
                .addService(new AuthImpl())
                .build()
                .start();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                AuthService.this.stop();
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
        final AuthService server = new AuthService();
        server.start();
        server.blockUntilShutdown();
    }
    //service Auth{
    //    rpc SignIn(SignInReq) returns (SignInRes){}
    //    rpc SignUp(SignUpReq) returns (SignInRes){}
    //    rpc ResetPassword(ResetReq) returns (ResetRes){}
    //}
    public static class AuthImpl extends AuthGrpc.AuthImplBase{
        @Override
        public void signIn(SignInReq req, StreamObserver<SignInRes> responseObserver) {

            SignInRes reply =null;


            if (IRedis.USER_SYNC_COMMAND.get(req.getUsername())==null){
                IRedis.USER_SYNC_COMMAND.set(req.getUsername(),"0");
                reply= SignInRes.newBuilder().setStatus("Success").build();
                System.out.println("Success created user" +req.getUsername());
            } else{
                reply= SignInRes.newBuilder().setStatus("Failed").build();
                System.out.println("Failed: Exist user " +req.getUsername());
            }

            responseObserver.onNext(reply);
            responseObserver.onCompleted();

        }
    }
}
