package br.gof.estruturais.flyweight;

public class Personagem {
    private PersonagemLeve jogador;
    private int numeroDeVitorias;
    private int quantidadeDeUtilizacoes;

    public Personagem(PersonagemLeve jogador) {
        this.jogador = jogador;
    }

    public void incrementarVitoria() {
        numeroDeVitorias++;
    }

    public void incrementarUtilizacao() {
        quantidadeDeUtilizacoes++;
    }

    public PersonagemLeve getJogador() {
        return jogador;
    }

    public int getNumeroDeVitorias() {
        return numeroDeVitorias;
    }

    public int getQuantidadeDeUtilizacoes() {
        return quantidadeDeUtilizacoes;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "jogador=" + jogador +
                ", numeroDeVitorias=" + numeroDeVitorias +
                ", quantidadeDeUtilizacoes=" + quantidadeDeUtilizacoes +
                '}';
    }
}
