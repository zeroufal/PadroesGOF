package br.gof.comportamentais.templatemethod;

import java.util.Set;

public interface CalculadorDePrecoFinal {
    double calcularPrecoFinal(Set<Produto> produtos, Comprador comprador);
}
