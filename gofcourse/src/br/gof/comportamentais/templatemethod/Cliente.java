package br.gof.comportamentais.templatemethod;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    public static void main(String[] args) {
        Set<Produto> produtos = new HashSet<>();
        produtos.add(new Produto("Geladeira", "100", 1000d));
        produtos.add(new Produto("Televisor", "200", 1000d));
        Comprador comprador = new Comprador("Marcos", "RS", produtos);

        CalculadorDePrecoFinal calculadorDePrecoFinal =
                new CalculadorDePrecoFinalRS();
        double totalCalculado = calculadorDePrecoFinal.calcularPrecoFinal(comprador.getProdutos(), comprador);

        System.out.println("Comprador RS NCM 1*:");
        System.out.println("Total sem descontos: " + 2000d);
        System.out.println("Total com descontos: " + totalCalculado);

        produtos = new HashSet<>();
        produtos.add(new Produto("Geladeira", "100", 1000d));
        produtos.add(new Produto("Televisor", "200", 1000d));
        comprador = new Comprador("Marcos", "SP", produtos);

        calculadorDePrecoFinal =
                new CalculadorDePrecoFinalSP();

        totalCalculado = calculadorDePrecoFinal.calcularPrecoFinal(comprador.getProdutos(), comprador);

        System.out.println("Comprador SP NCM 1*:");
        System.out.println("Total sem descontos: " + 2000d);
        System.out.println("Total com descontos: " + totalCalculado);
    }
}
