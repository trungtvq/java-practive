package co.overlead.database;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;

public class MongoDB {
   // mongodb+srv://tien:<password>@overlead0-ykr4q.gcp.mongodb.net/test?retryWrites=true
    // Creating a Mongo client
   public static MongoClient mongoClient = (MongoClient) MongoClients.create("mongodb+srv://tien:<password>@overlead0-ykr4q.gcp.mongodb.net/test?retryWrites=true");


    public static void main(String[] args) {
       MongoDatabase aa= mongoClient.getDatabase("overlead");
       MongoCollection<Document> coll = aa.getCollection("myTestCollection");
       Document document = new Document("title", "MongoDB")
               .append("id", 1)
               .append("description", "database")
               .append("likes", 100)
               .append("url", "http://www.tutorialspoint.com/mongodb/")
               .append("by", "tutorials point");
       coll.insertOne(document);
   }

}
