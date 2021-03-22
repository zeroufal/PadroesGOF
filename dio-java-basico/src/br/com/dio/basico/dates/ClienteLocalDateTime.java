package br.com.dio.basico.dates;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ClienteLocalDateTime {
    public static void main(String[] args) {
        exercicioFinalLocalDateTime();
    }

    public static void exemplos() {
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        LocalDateTime futuro = agora.plusHours(1).plusDays(2);
        System.out.println(futuro);
    }

    public static void exercicioFinalLocalDateTime() {
        LocalDateTime agora = LocalDateTime.of(2010, 05, 15, 10,0,0);
        System.out.println(agora);

        LocalDateTime futuro = agora.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(futuro);
    }
}
