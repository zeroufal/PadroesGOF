package br.com.dio.basico.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClienteComparators {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa andre = new Pessoa(42, "Andre");
        Pessoa suzana = new Pessoa(40, "Suzana");
        Pessoa marcos = new Pessoa(37, "Marcos");
        Pessoa douglas = new Pessoa(26, "Douglas");

        pessoas.add(andre);
        pessoas.add(suzana);
        pessoas.add(marcos);
        pessoas.add(douglas);

        System.out.println("Ordem de insercao: "+ pessoas);
        pessoas.sort(new PessoaComparatorPorIdade());
        System.out.println("Ordem de idade: "+ pessoas);
        pessoas.sort(new PessoaComparatorPorNome());
        System.out.println("Ordem de nome: "+ pessoas);
        Collections.sort(pessoas);
        System.out.println("Ordem de idade da colecao: "+ pessoas);
    }
}

class Pessoa implements Comparable<Pessoa> {
    private final int idade;
    private final String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.idade - o.idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }
}

class PessoaComparatorPorNome implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

class PessoaComparatorPorIdade implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getIdade() - o2.getIdade();
    }
}