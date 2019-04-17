package co.overlead.main;

import examples.gRPC.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CounterClientMain {
    private static final Logger logger = Logger.getLogger(CounterClientMain.class.getName());

    private final ManagedChannel channel;
    private final CounterServiceGrpc.CounterServiceBlockingStub blockingStub;

    /** Construct client connecting to HelloWorld server at {@code host:port}. */
    public CounterClientMain(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build());
    }

    /** Construct client for accessing HelloWorld server using the existing channel. */
    CounterClientMain(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = CounterServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
//rpc CreateUser(UserReq) returns (Result){}
//    rpc GetBalance(UserReq) returns (GetBalanceReply){}
//    rpc SetBalance(SetBalanceReq) returns (GetBalanceReply){}
    /** Say hello to server. */
    public void createUser(String name) {
        logger.info("Creating user: " + name + " ...");
        UserReq request = UserReq.newBuilder().setUsername(name).build();
        Result response;
        try {
            response = blockingStub.createUser(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Result: " + response.getResult());
    }


    public void getBalance(String name) {
        logger.info("Get balance of user: " + name + " ...");
        UserReq request = UserReq.newBuilder().setUsername(name).build();
        GetBalanceReply response;
        try {
            response = blockingStub.getBalance(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("balance: " + response.getBalance());
    }

    public void setBalance(String name,Long value) {
        logger.info("Set balance of user: " + name + " ...");
        SetBalanceReq request = SetBalanceReq.newBuilder().setUsername(name).setBalanceChange(value).build();
        GetBalanceReply response;
        try {
            response = blockingStub.setBalance(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("new balance: " + response.getBalance());
    }
    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting.
     */
    public static void main(String[] args) throws Exception {
        CounterClientMain client = new CounterClientMain("localhost", 9090);
        try {
            /* Access a service running on the local machine on port 50051 */
            String user = "qqtest123";
            if (args.length > 0) {
                user = args[0]; /* Use the arg as the name to greet if provided */
            }

            client.createUser(user);
            //client.getBalance(user);
           client.setBalance(user,-2000L);
            //client.getBalance(user);

        } finally {
            client.shutdown();
        }
    }
}
