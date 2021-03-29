package br.com.dio.java8;

import java.util.stream.IntStream;

public class ClienteParallel {
    public static void main(String[] args) {
        long c1 = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(num -> fatorial(num));

        long c2 = System.currentTimeMillis();

        IntStream.range(1,100000).parallel().forEach(num -> fatorial(num));

        long c3 = System.currentTimeMillis();

        System.out.println("Serial: " + (c2 - c1));
        System.out.println("Parallel: " + (c3 - c2));
    }

    public static long fatorial(long numero) {
        if (numero == 1) {
            return numero;
        }

        long resultado = numero;
        int i = 1;

        do {
            resultado *= (numero - i);
            i++;
        } while (i < numero);

        return resultado;
    }
}

