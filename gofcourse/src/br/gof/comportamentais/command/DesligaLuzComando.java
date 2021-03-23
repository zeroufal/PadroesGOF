package br.gof.comportamentais.command;

import java.util.List;

public class DesligaLuzComando implements Interruptor {

    private final List<Lampada> lampadas;

    public DesligaLuzComando(List<Lampada> lampadas) {
        this.lampadas = lampadas;
    }

    @Override
    public void executarComando() {
        for (Lampada lampada : lampadas) {
            lampada.desligar();
        }
    }
}
