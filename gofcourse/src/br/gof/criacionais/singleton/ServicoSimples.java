package br.gof.criacionais.singleton;

public class ServicoSimples {
    private static ServicoSimples instance;

    private ServicoSimples() {
    }

    public static final ServicoSimples getInstance() {
        if (instance == null) {
            instance = new ServicoSimples();
        }

        return instance;
    }

    public void imprimirServico() {
        System.out.println("Estou imprimindo: " + instance);
    }
}
