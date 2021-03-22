package br.com.dio.basico.dates;

import java.util.Calendar;
import java.util.Date;

public class ClienteCalendar {
    public static void main(String[] args) {
        Calendar dataVencimento = Calendar.getInstance();
        dataVencimento.add(Calendar.DATE, 2);

        int dias = exercicioFinal(dataVencimento);

        dataVencimento.add(Calendar.DATE, dias);

        System.out.println("Prazo maximo: " + dias);
        System.out.println("Data de vencimento : " + dataVencimento.getTime());
    }

    public static void exemplo1() {
        Calendar agora = Calendar.getInstance();
        System.out.println("Agora: " + agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.println("!5 dias atras: " + agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
    }

    public static void exemplo2() {
        Calendar agora = Calendar.getInstance();
        System.out.printf("%tc\n", agora.getTime());
        System.out.printf("%tF\n", agora.getTime());
        System.out.printf("%tD\n", agora.getTime());
        System.out.printf("%tr\n", agora.getTime());
        System.out.printf("%tT\n", agora.getTime());
    }

    public static int exercicioFinal(final Calendar datavencimento) {
        int diasParaPagar = 10;

        Calendar dataMaximaParaPagar = Calendar.getInstance();
        dataMaximaParaPagar.setTimeInMillis(datavencimento.getTimeInMillis());

        dataMaximaParaPagar.add(Calendar.DATE, 10);

        if (dataMaximaParaPagar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            diasParaPagar++;
        }

        if (dataMaximaParaPagar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            diasParaPagar += 2;
        }

        return diasParaPagar;
    }
}
