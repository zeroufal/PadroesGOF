package br.gof.comportamentais.chain;

public class Cliente {
    public static void main(String[] args) {
        Validador validaNulo = new ValidadorNuloOuVazio();
        Validador validaTamanho = new ValidadorTamanho();
        Validador validaNumeros = new ValidadorTemNumeros();

        validaNulo.setProximoValidador(validaTamanho);
        validaTamanho.setProximoValidador(validaNumeros);

        validaNulo.executarValidacao("   ");

        System.out.println("Valido");
    }
}
