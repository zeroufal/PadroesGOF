package br.com.dio.basico.exceptions;

public class ClienteExcecao {
    public static void main(String[] args) {
        testeBlocoFinally();
    }

    public static void testeBlocoFinally() {
        System.out.println(0);
        try {
            System.out.println(1);
        } finally {
            System.out.println(2);
        }
        System.out.println(3);
    }
}
