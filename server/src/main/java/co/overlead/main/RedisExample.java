package co.overlead.main;

import co.overlead.database.IRedis;
import co.overlead.module.User;
import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisStringCommands;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.persistence.Id;

public class RedisExample {
    public static void main(String[]args ) throws ParseException {
        //syncCommands.append("1234","3554");

        JSONObject user = new JSONObject();

        user.put("name", "mkyong.com");
        user.put("age", new Integer(100));

        System.out.println(user);

        IRedis.SYNC_COMMAND.set("user123","0");
        String value = (String) IRedis.SYNC_COMMAND.get("user");

        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(value);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                IRedis.USERCONNECTION.close();
                IRedis.USERCLIENT.shutdown();

                System.err.println("*** server shut down");

            }
        });


        System.out.println(json);
    }
}
