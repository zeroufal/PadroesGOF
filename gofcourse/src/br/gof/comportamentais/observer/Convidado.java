package br.gof.comportamentais.observer;

public class Convidado implements Observer {
    private final String nome;

    public Convidado(String nome) {
        this.nome = nome;
    }

    @Override
    public void executarAtualizacao() {
        System.out.println(this + " - notificado.");
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
