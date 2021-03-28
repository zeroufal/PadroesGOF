package br.com.dio;

import java.util.function.*;

public class ClienteFuncional {
    public static void main(String[] args) {
        UnaryOperator<Integer> retornaDobro = valor -> valor * 2;
        System.out.println(retornaDobro.apply(10));

        BiPredicate<Integer, Integer> comparaSeMaior = (a, b) -> a > b;
        System.out.println(comparaSeMaior.test(1,2));
        System.out.println(comparaSeMaior.test(2,1));

        UnaryOperator<Integer> retornaTriplo = valor -> {
            final int novoValor = valor;
            return novoValor * 3;
        };
        System.out.println(retornaTriplo.apply(10));

        Function<String, String> reverso = string -> new StringBuilder(string).reverse().toString();
        System.out.println(reverso.apply("Marcos"));

        Function<String, Integer> converteParaInteiro = Integer::valueOf;
        System.out.println(converteParaInteiro.apply("20"));

        Predicate<String> testaVazio = valor -> { return (valor == null || valor.isEmpty() || valor.isBlank());};
        System.out.println(testaVazio.test("ABC"));
        System.out.println(testaVazio.test(""));
        System.out.println(testaVazio.test(null));

        Supplier<Pessoa> instanciaDePessoa = () -> new Pessoa();
        System.out.println(instanciaDePessoa.get());

        Consumer<String> consumidor = System.out::println;

        consumidor.accept("Marcos");
    }


}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        nome = "Marcos";
        idade = 37;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Idade: %d", nome, idade);
    }
}
