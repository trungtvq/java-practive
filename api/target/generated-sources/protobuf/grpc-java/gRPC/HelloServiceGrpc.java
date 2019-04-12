package gRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: HelloServices.proto")
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "gRPC.HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gRPC.HelloServices.HelloRequest,
      gRPC.HelloServices.HelloResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greet",
      requestType = gRPC.HelloServices.HelloRequest.class,
      responseType = gRPC.HelloServices.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPC.HelloServices.HelloRequest,
      gRPC.HelloServices.HelloResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<gRPC.HelloServices.HelloRequest, gRPC.HelloServices.HelloResponse> getGreetMethod;
    if ((getGreetMethod = HelloServiceGrpc.getGreetMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGreetMethod = HelloServiceGrpc.getGreetMethod) == null) {
          HelloServiceGrpc.getGreetMethod = getGreetMethod = 
              io.grpc.MethodDescriptor.<gRPC.HelloServices.HelloRequest, gRPC.HelloServices.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.HelloService", "greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.HelloServices.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.HelloServices.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("greet"))
                  .build();
          }
        }
     }
     return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPC.HelloServices.HelloRequest,
      gRPC.HelloServices.HelloResponse> getGreetStream1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetStream1",
      requestType = gRPC.HelloServices.HelloRequest.class,
      responseType = gRPC.HelloServices.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<gRPC.HelloServices.HelloRequest,
      gRPC.HelloServices.HelloResponse> getGreetStream1Method() {
    io.grpc.MethodDescriptor<gRPC.HelloServices.HelloRequest, gRPC.HelloServices.HelloResponse> getGreetStream1Method;
    if ((getGreetStream1Method = HelloServiceGrpc.getGreetStream1Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGreetStream1Method = HelloServiceGrpc.getGreetStream1Method) == null) {
          HelloServiceGrpc.getGreetStream1Method = getGreetStream1Method = 
              io.grpc.MethodDescriptor.<gRPC.HelloServices.HelloRequest, gRPC.HelloServices.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.HelloService", "greetStream1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.HelloServices.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.HelloServices.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("greetStream1"))
                  .build();
          }
        }
     }
     return getGreetStream1Method;
  }

  private static volatile io.grpc.MethodDescriptor<gRPC.HelloServices.HelloRequest,
      gRPC.HelloServices.HelloResponse> getGreetStream2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetStream2",
      requestType = gRPC.HelloServices.HelloRequest.class,
      responseType = gRPC.HelloServices.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<gRPC.HelloServices.HelloRequest,
      gRPC.HelloServices.HelloResponse> getGreetStream2Method() {
    io.grpc.MethodDescriptor<gRPC.HelloServices.HelloRequest, gRPC.HelloServices.HelloResponse> getGreetStream2Method;
    if ((getGreetStream2Method = HelloServiceGrpc.getGreetStream2Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGreetStream2Method = HelloServiceGrpc.getGreetStream2Method) == null) {
          HelloServiceGrpc.getGreetStream2Method = getGreetStream2Method = 
              io.grpc.MethodDescriptor.<gRPC.HelloServices.HelloRequest, gRPC.HelloServices.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.HelloService", "greetStream2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.HelloServices.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.HelloServices.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("greetStream2"))
                  .build();
          }
        }
     }
     return getGreetStream2Method;
  }

  private static volatile io.grpc.MethodDescriptor<gRPC.HelloServices.HelloRequest,
      gRPC.HelloServices.HelloResponse> getGreetStreamBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetStreamB",
      requestType = gRPC.HelloServices.HelloRequest.class,
      responseType = gRPC.HelloServices.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<gRPC.HelloServices.HelloRequest,
      gRPC.HelloServices.HelloResponse> getGreetStreamBMethod() {
    io.grpc.MethodDescriptor<gRPC.HelloServices.HelloRequest, gRPC.HelloServices.HelloResponse> getGreetStreamBMethod;
    if ((getGreetStreamBMethod = HelloServiceGrpc.getGreetStreamBMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGreetStreamBMethod = HelloServiceGrpc.getGreetStreamBMethod) == null) {
          HelloServiceGrpc.getGreetStreamBMethod = getGreetStreamBMethod = 
              io.grpc.MethodDescriptor.<gRPC.HelloServices.HelloRequest, gRPC.HelloServices.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.HelloService", "greetStreamB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.HelloServices.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.HelloServices.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("greetStreamB"))
                  .build();
          }
        }
     }
     return getGreetStreamBMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    return new HelloServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greet(gRPC.HelloServices.HelloRequest request,
        io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloRequest> greetStream1(
        io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetStream1Method(), responseObserver);
    }

    /**
     */
    public void greetStream2(gRPC.HelloServices.HelloRequest request,
        io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetStream2Method(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloRequest> greetStreamB(
        io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetStreamBMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.HelloServices.HelloRequest,
                gRPC.HelloServices.HelloResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGreetStream1Method(),
            asyncClientStreamingCall(
              new MethodHandlers<
                gRPC.HelloServices.HelloRequest,
                gRPC.HelloServices.HelloResponse>(
                  this, METHODID_GREET_STREAM1)))
          .addMethod(
            getGreetStream2Method(),
            asyncServerStreamingCall(
              new MethodHandlers<
                gRPC.HelloServices.HelloRequest,
                gRPC.HelloServices.HelloResponse>(
                  this, METHODID_GREET_STREAM2)))
          .addMethod(
            getGreetStreamBMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                gRPC.HelloServices.HelloRequest,
                gRPC.HelloServices.HelloResponse>(
                  this, METHODID_GREET_STREAM_B)))
          .build();
    }
  }

  /**
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractStub<HelloServiceStub> {
    private HelloServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void greet(gRPC.HelloServices.HelloRequest request,
        io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloRequest> greetStream1(
        io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGreetStream1Method(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void greetStream2(gRPC.HelloServices.HelloRequest request,
        io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGreetStream2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloRequest> greetStreamB(
        io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGreetStreamBMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public gRPC.HelloServices.HelloResponse greet(gRPC.HelloServices.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<gRPC.HelloServices.HelloResponse> greetStream2(
        gRPC.HelloServices.HelloRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGreetStream2Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.HelloServices.HelloResponse> greet(
        gRPC.HelloServices.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_STREAM2 = 1;
  private static final int METHODID_GREET_STREAM1 = 2;
  private static final int METHODID_GREET_STREAM_B = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((gRPC.HelloServices.HelloRequest) request,
              (io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloResponse>) responseObserver);
          break;
        case METHODID_GREET_STREAM2:
          serviceImpl.greetStream2((gRPC.HelloServices.HelloRequest) request,
              (io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET_STREAM1:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetStream1(
              (io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloResponse>) responseObserver);
        case METHODID_GREET_STREAM_B:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetStreamB(
              (io.grpc.stub.StreamObserver<gRPC.HelloServices.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gRPC.HelloServices.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .addMethod(getGreetStream1Method())
              .addMethod(getGreetStream2Method())
              .addMethod(getGreetStreamBMethod())
              .build();
        }
      }
    }
    return result;
  }
}
