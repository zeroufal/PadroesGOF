package br.com.dio.basico.dates;

import java.time.LocalTime;

public class ClienteLocalTime {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalTime logoMais = agora.plusHours(1);
        System.out.println(logoMais);
    }
}
