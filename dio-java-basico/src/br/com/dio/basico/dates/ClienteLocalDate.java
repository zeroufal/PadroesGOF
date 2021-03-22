package br.com.dio.basico.dates;

import java.time.LocalDate;

public class ClienteLocalDate {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);
    }
}
