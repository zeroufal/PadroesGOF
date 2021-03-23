package br.gof.comportamentais.command;

import java.util.List;

public class LigarLuzComando implements Interruptor {
    private final List<Lampada> lampadas;

    public LigarLuzComando(List<Lampada> lampadas) {
        this.lampadas = lampadas;
    }

    @Override
    public void executarComando() {
        for (Lampada lampada : lampadas) {
            lampada.ligar();
        }
    }
}
