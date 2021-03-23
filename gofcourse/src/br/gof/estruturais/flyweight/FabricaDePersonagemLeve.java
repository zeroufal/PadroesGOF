package br.gof.estruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDePersonagemLeve {
    private static FabricaDePersonagemLeve instance;
    private Map<String, PersonagemLeve> jogadores;

    private FabricaDePersonagemLeve() {
        jogadores = new HashMap<>();
    }

    public static FabricaDePersonagemLeve getInstance() {
        if (instance == null) {
            instance = new FabricaDePersonagemLeve();
        }

        return instance;
    }

    public PersonagemLeve getJogador(String nome) {
        PersonagemLeve resultado = jogadores.get(nome);

        if (resultado == null) {
            resultado = new PersonagemLeve(nome);
            jogadores.put(nome, resultado);
        }

        return resultado;
    }
}
