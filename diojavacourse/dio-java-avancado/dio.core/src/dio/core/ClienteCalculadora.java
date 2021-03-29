package dio.core;

import dio.util.operacao.Calculadora;

public class ClienteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(1,2));
    }
}
