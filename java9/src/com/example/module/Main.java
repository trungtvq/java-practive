package com.example.module;
import chrome.ListDownload;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpResponse;
import jdk.incubator.http.HttpRequest;
import running.IProcess;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    interface MyInterface {

        void normalInterfaceMethod();

        default void interfaceMethodWithDefault() {  init(); }

        default void anotherDefaultMethod() { init(); }

        // This method is not part of the public API exposed by MyInterface
        private void init() { System.out.println("Initializing"); }
    }


    class MyClass implements  MyInterface{

        @Override
        public void normalInterfaceMethod() {

        }
    }

    abstract static class MyHandler<T> {

        private T content;

        public MyHandler(T content) {
            this.content = content;
            System.out.println("constructor for MyHandler with content: " + content.toString());
        }

        public T getContent() {
            return content;
        }

        public void setContent(T content) {
            this.content = content;
        }

        abstract void handle();
    }
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        //Module system
        IProcess checkProcessRunning=ListDownload.download;

        checkProcessRunning.addDownload("anhkhongdoiqua");
        checkProcessRunning.addDownload("lamvoanhnhe");

        System.out.println(checkProcessRunning.getRunning());

//        //HTTP2
//        System.out.println("HTTP/2--------------------------------------");
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest req =
//                HttpRequest.newBuilder(URI.create("http://www.google.com"))
//                        .header("User-Agent","Java")
//                        .GET()
//                        .build();
//        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandler.asString());
//        System.out.println(resp.body());



//        //StreamAPI
//        System.out.println("StreamAPI--------------------------------------");
//        IntStream.iterate(2,t->t < 10, i -> i + 1).forEach(System.out::println);
//
//
//        Stream<String> stream = Stream.iterate("", ss -> ss + "s")
//                .takeWhile(ss -> ss.length() < 10);
//
//        stream.forEach(System.out::println);
//
//        Stream.of(2,199, 4, 6, 8, 9, 10, 12)
//                .dropWhile(n -> n % 2 == 0)
//                .forEach(System.out::println);

        ////DiamondOperator
        System.out.println("DiamondOperator--------------------------------------");
        MyHandler<Integer> intHandler = new MyHandler<>(1) {

            @Override
            public void handle() {
                System.out.println("handle > " + getContent());
            }
        };

        intHandler.handle();

        MyHandler<? extends Integer> intHandler1 = new MyHandler<>(10) {

            @Override
            void handle() {
                System.out.println("handle > " + getContent());
                System.out.println( getContent().getClass().getName());
            }
        };

        intHandler1.handle();

        MyHandler<?> handler = new MyHandler<>("One") {

            @Override
            void handle() {
                System.out.println("handle > " + getContent());
                System.out.println( getContent().getClass().getName());
            }
        };

        handler.handle();
    }

    }







