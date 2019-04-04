package com.example.module;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpResponse;
import notify.Error;
import jdk.incubator.http.HttpRequest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
	// write your code here
        Error.getNotify();




        //HTTP/2
        System.out.println("HTTP/2--------------------------------------");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://overlead.co/api"))
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandler.asString());
        System.out.println(response.body());
        IntStream.iterate(2,t->t < 10, i -> i + 1).forEach(System.out::println);

        Stream<Integer> s = Optional.of(1).stream();
        s.forEach(System.out::println);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req =
                HttpRequest.newBuilder(URI.create("http://www.google.com"))
                        .header("User-Agent","Java")
                        .GET()
                        .build();


        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandler.asString());
        System.out.println(resp.body());

        // Try-With-Resources​
        System.out.println("TryWithResouce--------------------------------------");
        try(FileOutputStream a=new FileOutputStream("/home/user/te.txt");FileOutputStream fileOutputStream=new FileOutputStream("/home/user/te.txt")){

        }catch (Exception E){

        }

        //StreamAPI
        System.out.println("StreamAPI--------------------------------------");
        IntStream
                .iterate(1,n->n<10, n -> n + 1)
                .forEach(System.out::println);

        Stream<String> stream = Stream.iterate("", ss -> ss + "s")
                .takeWhile(ss -> ss.length() < 10);
        stream.forEach(System.out::println);

        Stream.of(2,199, 4, 6, 8, 9, 10, 12)
                .dropWhile(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
    public class MyClass implements  MyInterface{

        @Override
        public void normalInterfaceMethod() {

        }
    }
    public interface MyInterface {

        void normalInterfaceMethod();

        default void interfaceMethodWithDefault() {  init(); }

        default void anotherDefaultMethod() { init(); }

        // This method is not part of the public API exposed by MyInterface
        private void init() { System.out.println("Initializing"); }
    }
}
