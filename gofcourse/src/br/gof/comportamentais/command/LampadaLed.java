package br.gof.comportamentais.command;

public class LampadaLed implements Lampada {
    private LampadaStatus status;

    @Override
    public void ligar() {
        System.out.println("Emitindo luz branca led.");

        status = LampadaStatus.LIGADO;
    }

    @Override
    public void desligar() {
        status = LampadaStatus.DESLIGADO;
    }

    @Override
    public LampadaStatus getStatus() {
        return status;
    }
}
