package br.gof.comportamentais.command;

public class LampadaFlorescente implements Lampada {
    private LampadaStatus status;

    @Override
    public void ligar() {
        System.out.println("Emitindo luz branca florescente");

        status = LampadaStatus.LIGADO;
    }

    @Override
    public void desligar() {
        System.out.println("Emitindo estalo de desligamento");

        status = LampadaStatus.DESLIGADO;
    }

    @Override
    public LampadaStatus getStatus() {
        return status;
    }
}
