package br.gof.estruturais.composite;

public class Arquivo implements ItemArquivo {
    private final String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void executar(String identacao) {
        identacao += "-";
        System.out.println(identacao + nome);
    }
}
