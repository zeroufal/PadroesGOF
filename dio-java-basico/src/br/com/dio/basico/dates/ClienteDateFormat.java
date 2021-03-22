package br.com.dio.basico.dates;

import java.text.DateFormat;
import java.util.Date;

public class ClienteDateFormat {
    public static void main(String[] args) {
        Date agora = new Date();

        String dataFormato1 = DateFormat.getDateInstance().format(agora);
        System.out.println(dataFormato1);

        String dataFormatoCurto = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(agora);
        System.out.println(dataFormatoCurto);
    }
}
