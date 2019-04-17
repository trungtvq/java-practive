package co.overlead.database;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisStringCommands;

import java.sql.Connection;

public abstract class Database<T> {


    private static String link;


    public void setLINK(String link) {
        Database.link = link;
    }

    private T instance;
}
