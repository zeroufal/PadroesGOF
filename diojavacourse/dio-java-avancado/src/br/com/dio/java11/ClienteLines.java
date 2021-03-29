package br.com.dio.java11;

import java.util.stream.Collectors;

public class ClienteLines {
    public static void main(String[] args) {
        String html = "<html>\n<head>\n</head>\n</html>";
        String resultado = html.lines().filter(line -> line.contains("head")).collect(Collectors.joining());
        System.out.println(resultado);
    }
}
