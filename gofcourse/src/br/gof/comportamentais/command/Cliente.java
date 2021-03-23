package br.gof.comportamentais.command;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        List<Lampada> lampadas = new ArrayList<>();

        lampadas.add(new LampadaAntiga());
        lampadas.add(new LampadaLed());
        lampadas.add(new LampadaFlorescente());

        LigarLuzComando comandoLigar = new LigarLuzComando(lampadas);
        DesligaLuzComando comandoDesligar = new DesligaLuzComando(lampadas);

        comandoLigar.executarComando();
        comandoDesligar.executarComando();

    }
}
