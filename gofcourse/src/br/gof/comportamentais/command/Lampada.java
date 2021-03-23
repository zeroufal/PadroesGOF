package br.gof.comportamentais.command;

public interface Lampada {
    LampadaStatus getStatus();

    void ligar();

    void desligar();
}
