package br.gof.estruturais.flyweight;

import java.util.*;

public class Fliperama {
    private List<Combate> combates;

    public Fliperama() {
        combates = new ArrayList<>();
    }

    public void criarCombate(Combate combate) {
        combates.add(combate);
    }

    public void gerarRelatorio() {
        System.out.println("Quantidade de combates: " + combates.size());

        Set<Personagem> personagensUtilizados = new HashSet<>();
        Map<PersonagemLeve, Integer> personagemLevesUtilizados = new HashMap<>();

        for( Combate combate : combates) {
            personagensUtilizados.add(combate.getP1());
            personagensUtilizados.add(combate.getP2());
        }

        System.out.println("Personagens utilizados: ");
        for(Personagem personagem : personagensUtilizados ) {
            System.out.println(personagem);
        }
    }
}
