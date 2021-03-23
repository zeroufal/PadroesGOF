package br.gof.comportamentais.templatemethod;

import java.util.Collections;
import java.util.Set;

public class Comprador {
    private String nome;
    private String estado;
    private Set<Produto> produtos;

    public Comprador(String nome, String estado, Set<Produto> produtos) {
        this.produtos = produtos;
        this.nome = nome;
        this.estado = estado;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Set<Produto> getProdutos() {
        return Collections.unmodifiableSet(produtos);
    }
}
