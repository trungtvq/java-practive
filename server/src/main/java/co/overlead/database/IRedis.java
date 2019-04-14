package co.overlead.database;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisStringCommands;

public interface IRedis {
    String Link="redis://trungtvq.ddns.net";
    RedisClient USERCLIENT = RedisClient.create(Link+"/1");

    RedisClient client2 = RedisClient.create(Link+"/1");
    RedisClient client3 = RedisClient.create(Link+"/1");
    RedisClient client4 = RedisClient.create(Link+"/1");
    RedisClient client5 = RedisClient.create(Link+"/1");
    RedisClient client6 = RedisClient.create(Link+"/1");



    StatefulRedisConnection<String, String> USERCONNECTION = USERCLIENT.connect();
    RedisStringCommands SYNC_COMMAND = USERCONNECTION.sync();

}
