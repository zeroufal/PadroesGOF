package br.gof.comportamentais.templatemethod;

public class CalculadorDePrecoFinalRS extends CalculadorDePrecoFinalBrasil {
    @Override
    protected double calcularDescontoProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto nao pode ser nulo!");
        }

        if (produto.getCodigoNCM() == null) {
            return 0;
        }

        if (!produto.getCodigoNCM().startsWith("1")) {
            return 0;
        }

        return 0.01d;
    }

    @Override
    protected double calcularDescontoComprador(Comprador comprador) {
        if (comprador == null) {
            throw new IllegalArgumentException("Comprador nao pode ser nulo!");
        }

        if (comprador.getEstado() == null) {
            return 0;
        }

        if (!comprador.getEstado().equals("RS")) {
            return 0;
        }

        return 0.05d;
    }

    @Override
    protected double calcularDescontoQuantidade(int quantidade) {
        if (quantidade < 10) {
            return 0;
        }

        return 0.01d;
    }
}
