package br.com.dio.basico.dates;

import java.util.Date;

public class ClienteDate {
    public static void main(String[] args) {
        Date agora = new Date();

        System.out.println(agora);

        Date inicio = new Date(20000000L);

        System.out.println(inicio);
    }
}
