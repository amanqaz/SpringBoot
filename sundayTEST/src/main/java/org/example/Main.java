package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    private static final String url ="https://jsonplaceholder.typicode.com/albums";
    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)).build();
        HttpResponse<String> response =  client.send(request, HttpResponse.BodyHandlers());
        client .sendAsync(request,HttpResponse.BodyHandler.ofString());
        System.out.println(response.body());
    }
}