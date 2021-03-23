package br.com.dio.basico.streams;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClienteHashSet {
    public static void main(String[] args) {
        //exercicioFinal();

        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(4);
        numeros.add(2);
        numeros.add(23);
        numeros.add(14);
        numeros.add(55);

        System.out.println(numeros);

        numeros.add(44);

        System.out.println(numeros);

        System.out.println(numeros);
    }

    public static void exercicioFinal() {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        for(Integer numero : numeros) {
            System.out.println("navengado: " + numero);
        }

        numeros.remove(3);
        numeros.add(23);

        System.out.println("tamanho: " + numeros.size());
        System.out.println("varios? " + numeros.isEmpty());
    }

    public static void exemplo() {
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.0);
        notasAlunos.add(4.0);

        Iterator<Double> iteratorNotasAlunos = notasAlunos.iterator();

        while(iteratorNotasAlunos.hasNext()) {
            System.out.println("Iterator: " + iteratorNotasAlunos.next());
        }

        for (Double nota : notasAlunos) {
            System.out.println("Foreach: " +  nota);
        }

        notasAlunos.remove(5.8);

        System.out.println(notasAlunos);
    }
}
