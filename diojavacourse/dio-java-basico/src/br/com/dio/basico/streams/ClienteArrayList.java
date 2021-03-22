package br.com.dio.basico.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ClienteArrayList {
    public static void main(String[] args) {
        exercicioFinalArrayList();
    }

    public static void exemplo() {


        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("Joao");

        Collections.sort(nomes);

        System.out.println(nomes);

        for(String nome: nomes) {
            System.out.println("-->" + nome);
        }

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            String nome = it.next();

            System.out.println("##" + nome);
        }
    }

    public static void exercicioFinalArrayList() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("Joao");

        for(String nome: nomes) {
            System.out.println("->" + nome);
        }

        System.out.println(nomes.get(1));

        nomes.remove(4);
        nomes.remove("Joao");

        int tamanho = nomes.size();

        System.out.println("Tamanho: " + tamanho);

        boolean julianoExiste = nomes.contains("Juliano");

        System.out.println("Existe Juliano: " + julianoExiste);

        List<String> novosNomes = new ArrayList<>();
        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");

        nomes.addAll(novosNomes);

        Collections.sort(nomes);

        boolean listaNomesVazia = nomes.isEmpty();

        System.out.println("Lista de nomes esta vazia: " + listaNomesVazia);

        System.out.println(nomes);

    }
}
