package br.com.dio.basico.streams;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ClienteTreeSet {
    public static void main(String[] args) {
        exemplo2();
    }

    public static void exemplo1() {
        TreeSet<String> capitais = new TreeSet<>();
        capitais.add("Porto Alegre");
        capitais.add("Florianopolis");
        capitais.add("Cuririba");
        capitais.add("Sao Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Belo Horizonte");

        System.out.println(capitais);
        System.out.println("First: " + capitais.first());
        System.out.println("Last: " + capitais.last());
        System.out.println("Higher Belo Horizonte: " + capitais.higher("Florianopolis"));
        System.out.println("Lower Sao Paulo: " + capitais.lower("Sao Paulo"));

        for (String capital : capitais) {
            System.out.println("Foreach: " +  capital);
        }

        capitais.remove("Belo Horizonte");
    }

    public static void exemplo2() {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);

        System.out.println(numeros);
        System.out.println("First: " + numeros.first());
        System.out.println("Last: " + numeros.last());
        System.out.println("Higher: " + numeros.higher(3));
        System.out.println("Lower: " + numeros.lower(2));
    }
}
