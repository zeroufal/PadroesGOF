package br.com.dio.java10;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class ClienteInferencia {
    public static void main(String[] args) throws IOException {

            System.out.println("Tentativa realizada.");
    }

    public static void exemplo2() throws IOException {
        var url = new URL("http://www.uol.com.br/");
        var connection = url.openConnection();
        var reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        System.out.println(reader.lines().collect(Collectors.joining()));
    }

    public static void exemplo1() throws IOException {
        URL url = new URL("http://www.uol.com.br/");
        URLConnection connection = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        System.out.println(reader.lines().collect(Collectors.joining()));
    }
}
