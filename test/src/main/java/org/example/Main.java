package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    private static  String url ="https://jsonplaceholder.typicode.com/albums";
    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)).build();
      //  HttpResponse<String> response =  client.send(request, HttpResponse.BodyHandlers());
        client .sendAsync(request,HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
        //  System.out.println(response.body());
    }
}