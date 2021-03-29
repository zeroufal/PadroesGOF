package br.com.dio.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteHttpRequest {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("http://www.uol.com.br")).build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.headers());
        System.out.println(httpResponse.body());
    }
}
