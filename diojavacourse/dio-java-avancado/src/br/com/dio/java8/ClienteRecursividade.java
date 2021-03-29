package br.com.dio.java8;

import java.util.HashMap;
import java.util.Map;

public class ClienteRecursividade {
    public static Map<Integer, Integer> pas = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(somaPA(5000));
        System.out.println(somaPA(10000));
        System.out.println(somaPA(15000));
    }

    public static int somaPA(int numero) {
        if (numero > 0) {
            Integer resultado = pas.get(numero);
            if (resultado == null) {
                resultado = numero + somaPA(--numero);
                pas.put(numero, resultado);
            }

            return resultado;
        }

        return numero;
    }
}
