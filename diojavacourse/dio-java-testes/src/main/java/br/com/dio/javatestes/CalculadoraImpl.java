package br.com.dio.javatestes;

public class CalculadoraImpl implements Calculadora {
    @Override
    public double calcular(String expressao) {
        if (expressao.isBlank()) {
            throw new IllegalArgumentException("Entrada is blank");
        }

        String[] valores = expressao.split("\\+");

        if (valores.length < 2) {
            throw new IllegalArgumentException("Entrada incompativel");
        }

        double resultado = 0;

        for(String valor : valores) {
            resultado += Double.valueOf(valor);
        }

        return resultado;
    }
}
