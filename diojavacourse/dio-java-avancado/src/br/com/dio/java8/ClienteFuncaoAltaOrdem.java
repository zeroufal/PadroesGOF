package br.com.dio.java8;

public class ClienteFuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculador calcularSoma = (valor1, valor2) -> valor1 + valor2;
        Calculador calcularSubtracao = (valor1, valor2) -> valor1 - valor2;
        Calculador calcularMultiplicacao = (valor1, valor2) -> valor1 * valor2;
        Calculador calcularDivisao = (valor1, valor2) -> valor1 / valor2;

        calcularSoma.demonstrarCalculo(calcularSoma, 2, 2);
        calcularSoma.demonstrarCalculo(calcularSubtracao, 4, 2);
        calcularSoma.demonstrarCalculo(calcularMultiplicacao, 2, 2);
        calcularSoma.demonstrarCalculo(calcularDivisao, 4, 2);
    }
}

@FunctionalInterface
interface Calculador {
    int calcular(int valor1, int valor2);

    default void demonstrarCalculo(Calculador calculador, int valor1, int valor2) {
        System.out.println("Resultado da operacao: " + calculador.calcular(valor1, valor2));
    }
}
