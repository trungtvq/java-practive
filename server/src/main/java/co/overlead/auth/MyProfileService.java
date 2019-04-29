package co.overlead.auth;

import co.overlead.database.IRedis;
import co.overlead.gRPC.*;
import co.overlead.helper.ImageResizer;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.bson.internal.Base64;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MyProfileService  {

    private Server server;

    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 9090;
        server = ServerBuilder.forPort(port)
                .addService(new MyProfileServiceImpl())
                .build()
                .start();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                MyProfileService.this.stop();
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
        final MyProfileService server = new MyProfileService();
        server.start();
        server.blockUntilShutdown();
    }
    //service Auth{
    //    rpc SignIn(SignInReq) returns (SignInRes){}
    //    rpc SignUp(SignUpReq) returns (SignInRes){}
    //    rpc ResetPassword(ResetReq) returns (ResetRes){}
    //}
    public static class MyProfileServiceImpl extends MyProfileGrpc.MyProfileImplBase {

        @Override
        public void getProfile(ProfileReq request, StreamObserver<ProfileRes> responseObserver) {


            File file = new File("./aaa.jpeg");

            BufferedImage image = null;

//        GridFS gfsPhoto = new GridFS(db, "photo");
//
//        GridFSInputFile gfsFile = gfsPhoto.createFile(file);
//        gfsFile.setFilename(newFileName);
//        gfsFile.save();
            try {
                image = ImageIO.read(file);
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                ImageIO.write(image, "png", outputStream);
                byte[] bytes= ImageResizer.resize(file);
                String encodedImage = Base64.encode(bytes);

                //String encodedImage = Base64.encode(outputStream.toByteArray());

                responseObserver.onNext(ProfileRes.newBuilder().setAvatar(encodedImage).setStatus("OK").build());
                responseObserver.onCompleted();
            } catch (IOException e) {
                e.printStackTrace();
            }



            System.out.println("done");



        }

        @Override
        public void getProfileSimple(ProfileReq request, StreamObserver<ProfileRes> responseObserver) {
        System.out.print("get");
            File file = new File("./aaa.JPG");

            BufferedImage image = null;

//        GridFS gfsPhoto = new GridFS(db, "photo");
//
//        GridFSInputFile gfsFile = gfsPhoto.createFile(file);
//        gfsFile.setFilename(newFileName);
//        gfsFile.save();
            try {
//                System.out.print("--reading");
//
//                image = ImageIO.read(file);
//                System.out.print("--readed");
//
//                System.out.print("--writing");
//                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//                ImageIO.write(image, "JPG", outputStream);
//                System.out.print("--wrote");

                System.out.print("--resizing");

                byte[] bytes= ImageResizer.resize(file);
                System.out.print("--resized");

                System.out.print("--encoding");
                String encodedImage = Base64.encode(bytes);
                System.out.print("--encoded");

                //String encodedImage = Base64.encode(outputStream.toByteArray());

                responseObserver.onNext(ProfileRes.newBuilder().setAvatar(encodedImage).setStatus("OK").build());
                responseObserver.onCompleted();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.print(e);
            }
            System.out.print("done");



        }
    }
}
