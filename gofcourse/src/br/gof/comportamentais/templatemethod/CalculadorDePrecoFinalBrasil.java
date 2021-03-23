package br.gof.comportamentais.templatemethod;

import java.util.Set;

public abstract class CalculadorDePrecoFinalBrasil implements CalculadorDePrecoFinal {
    @Override
    public double calcularPrecoFinal(Set<Produto> produtos, Comprador comprador) {
        double precoTotal = 0;
        double descontoTotal = 0;

        for (Produto produto : produtos) {
            precoTotal += produto.getPreco();

            descontoTotal += produto.getPreco() * calcularDescontoProduto(produto);
        }

        precoTotal -= descontoTotal;
        precoTotal -= precoTotal * calcularDescontoComprador(comprador);

        precoTotal -= precoTotal * calcularDescontoQuantidade(produtos.size());

        return precoTotal;
    }

    protected abstract double calcularDescontoProduto(Produto produto);

    protected abstract double calcularDescontoComprador(Comprador comprador);

    protected abstract double calcularDescontoQuantidade(int quantidade);
}
