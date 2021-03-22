package br.com.dio.basico.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClienteSimpleDateFormat {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.sss");
        String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada);
    }
}
