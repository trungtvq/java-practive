package gRPC;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 *
 * :=  created by:  Shuza
 * :=  create date:  28-Jun-18
 * :=  (C) CopyRight Shuza
 * :=  www.shuza.ninja
 * :=  shuza.sa@gmail.com
 * :=  Fun  :  Coffee  :  Code
 *
 **/

public class MygRPCServer {

    public static void main(String[] arg) {
        try {
            Server server = ServerBuilder.forPort(8080)
                   .addService (new HelloServicesImpl())
//                    .addService((BindableService) new SignUpServiceImp())
//                    .addService((BindableService) new LoginServiceImp())
                    .build();
            System.out.println("Starting Server......");
            server.start();
            System.out.println("Server has started ========");

            server.awaitTermination();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
