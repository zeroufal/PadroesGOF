package br.com.dio.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClienteThread {
    private static final ExecutorService pessoasParaExecutar = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        Casa casa = new Casa(new Quarto());
        casa.obterAfazeresDaCasa().forEach(
            atividade -> pessoasParaExecutar.execute(
                () -> atividade.realizar()
            )
        );

        pessoasParaExecutar.shutdown();
    }
}

class Casa {
    private List<Comodo> comodos;

    public Casa(Comodo... comodos) {
        this.comodos = Arrays.asList(comodos);
    }

    List<Atividade> obterAfazeresDaCasa() {
        return comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                }
        );
    }
}

@FunctionalInterface
interface Atividade {
    void realizar();
}

abstract class Comodo {
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo {
    @Override
    List<Atividade> obterAfazeresDoComodo() {
        return Arrays.asList(this::arrumarCama, this::arrumarCama, this::arrumarGuardaRoupa, this::varrerQuarto);
    }

    private void arrumarGuardaRoupa() {
        System.out.println("Arrumando o guarda-roupa.");
    }

    private void arrumarCama() {
        System.out.println("Arrumando a Cama");
    }

    private void varrerQuarto() {
        System.out.println("Varrendo o quarto");
    }
}