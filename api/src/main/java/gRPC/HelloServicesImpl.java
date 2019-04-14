package gRPC;

import io.grpc.stub.StreamObserver;
import io.grpc.stub.StreamObservers;

import java.util.LinkedHashSet;

public class HelloServicesImpl //extends HelloServiceGrpc.HelloServiceImplBase
 {
//    private static LinkedHashSet<StreamObserver<HelloServices.HelloResponse>> observers=new LinkedHashSet<StreamObserver<HelloServices.HelloResponse>>();
//    @Override
//    public StreamObserver<HelloServices.HelloRequest> greetStreamB(final StreamObserver<HelloServices.HelloResponse> responseStreamObservers){
//        observers.add(responseStreamObservers);
//        return new StreamObserver<HelloServices.HelloRequest>() {
//            public void onNext(HelloServices.HelloRequest helloRequest) {
//                for (StreamObserver<HelloServices.HelloResponse> observer : observers) {
//                    observer.onNext(HelloServices.HelloResponse
//                            .newBuilder()
//                            .setGreeting(helloRequest.getName()).setGreeting(helloRequest.getName()).build());
//                }
//
//            }
//
//            public void onError(Throwable throwable) {
//                    observers.remove(responseStreamObservers);
//            }
//
//            public void onCompleted() {
//                observers.remove(responseStreamObservers);
//            }
//        };
//    }
}
