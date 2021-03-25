package br.com.dio.basico.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ClienteStreamAPI {
    public static void main(String[] args) {
        exercicioFinal();
    }

    public static void exemplo() {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        System.out.println(estudantes.stream().count());
        System.out.println(estudantes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println(estudantes.stream().min(Comparator.comparingInt(String::length)));
        System.out.println(estudantes.stream().filter(
                (estudante)->estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
    }

    public static void exercicioFinal() {
        Estudante marcos = new Estudante("Marcos", 37);
        Estudante douglas = new Estudante("Douglas", 26);
        Estudante andre = new Estudante("Andre", 43);
        Estudante brenda = new Estudante("Brenda", 17);

        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(marcos);
        estudantes.add(douglas);
        estudantes.add(andre);
        estudantes.add(brenda);

        System.out.println(estudantes.stream().map((estudante)->estudante.getNome()).collect(Collectors.toList()));
        System.out.println(estudantes.stream().count());
        System.out.println(estudantes.stream().filter(
                (estudante)->estudante.getIdade() >= 18).collect((Collectors.toList())));
        System.out.println(estudantes.stream().filter(
                (estudante)->estudante.getNome().toLowerCase().contains("b")).collect(Collectors.toList()));
        System.out.println(estudantes.stream().anyMatch((estudante)->estudante.getNome().toLowerCase().contains("d")));
        System.out.println(estudantes.stream().max(Comparator.comparingInt((estudante)->estudante.getIdade())));
        System.out.println(estudantes.stream().min(Comparator.comparingInt((estudante)->estudante.getIdade())));
    }
}

class Estudante {
    private final String nome;
    private final int idade;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
