package br.com.dio.java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class ClienteIteracoes {
    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4};



        Stream.of(numeros).map(numero->numero*2).forEach(System.out::println);
        Stream.of(numeros).filter(numero -> numero % 2 == 0).map(numero->numero*2).forEach(System.out::println);
    }
}
