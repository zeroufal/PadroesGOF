package br.gof.comportamentais.templatemethod;

public class Produto {
    private final String nome;
    private final String codigoNCM;
    private final double preco;

    public Produto(String nome, String codigoNCM, double preco) {
        this.nome = nome;
        this.codigoNCM = codigoNCM;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoNCM() {
        return codigoNCM;
    }

    public double getPreco() {
        return preco;
    }
}
