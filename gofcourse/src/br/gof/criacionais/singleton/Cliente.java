package br.gof.criacionais.singleton;

public class Cliente {
    public static void main(String[] args) {
        ServicoSimples servicoSimples = ServicoSimples.getInstance();
        servicoSimples.imprimirServico();

        ServicoSimples servicoPosterior = ServicoSimples.getInstance();
        servicoPosterior.imprimirServico();
    }
}
