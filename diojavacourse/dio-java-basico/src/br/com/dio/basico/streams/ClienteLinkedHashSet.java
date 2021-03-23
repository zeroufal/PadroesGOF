package br.com.dio.basico.streams;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ClienteLinkedHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new LinkedHashSet<>();
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
