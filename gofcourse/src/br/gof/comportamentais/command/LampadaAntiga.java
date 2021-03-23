package br.gof.comportamentais.command;

public class LampadaAntiga implements Lampada {
    private LampadaStatus status;

    @Override
    public void ligar() {
        System.out.println("Emitindo luz amarela");

        status = LampadaStatus.LIGADO;
    }

    @Override
    public void desligar() {
        System.out.println("Emitindo esmaecimento de desligamento");

        status = LampadaStatus.DESLIGADO;
    }

    @Override
    public LampadaStatus getStatus() {
        return status;
    }
}
