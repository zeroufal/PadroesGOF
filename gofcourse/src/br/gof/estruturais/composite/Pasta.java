package br.gof.estruturais.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pasta implements ItemArquivo {
    private final String nome;
    private final List<ItemArquivo> itens;

    public Pasta(String nome, List<ItemArquivo> itens) {
        this.nome = nome;

        this.itens = itens;
    }

    public List<ItemArquivo> getItens() {
        return Collections.unmodifiableList(itens);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void executar(String identacao) {
        identacao += "-";
        System.out.println(identacao + nome);

        for(ItemArquivo item : itens) {
            item.executar(identacao);
        }
    }
}
