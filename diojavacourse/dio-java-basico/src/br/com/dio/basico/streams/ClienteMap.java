package br.com.dio.basico.streams;

import java.util.*;

public class ClienteMap {
    public static void main(String[] args) {
        exercicioFinal();
    }

    public static void exemploHashMap() {
        Map<String, Integer> campeoesMundiais = new HashMap<>();

        campeoesMundiais.put("Brasil", 5);
        campeoesMundiais.put("Alemanha", 4);
        campeoesMundiais.put("Italia", 4);
        campeoesMundiais.put("Uruguai", 2);

        System.out.println(campeoesMundiais);
        System.out.println(campeoesMundiais.get("Alemanha"));

    }

    public static void exemploTreeMap() {
        Map<String, String> capitais = new TreeMap<>();

        capitais.put("SP", "Sao Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");
        capitais.put("RS", "Porto Alegre");

        System.out.println(capitais);
        System.out.println(capitais.get("SP"));

        for (Map.Entry<String, String> entrada: capitais.entrySet()) {
            System.out.println(entrada.getKey() + "-" + entrada.getValue());
        }
    }

    public static void exercicioFinal() {
        Map<String, String> estadosBrasileiros = new HashMap<>();
        estadosBrasileiros.put("AL", "Alagoas");
        estadosBrasileiros.put("PE", "Pernambuco");
        estadosBrasileiros.put("BA", "Bahia");
        estadosBrasileiros.put("MG", "Minas Gerais");
        estadosBrasileiros.put("ES", "Espirito Santo");
        estadosBrasileiros.put("RJ", "Rio de Janeiro");
        estadosBrasileiros.put("SP", "Sao Paulo");
        estadosBrasileiros.put("TO", "Tocantins");
        estadosBrasileiros.put("GßO", "Goias");
        estadosBrasileiros.put("MS", "Mato Grosso do Sul");
        estadosBrasileiros.put("MT", "Mato Grosso");
        estadosBrasileiros.put("RS", "Rio Grande do Sul");
        estadosBrasileiros.put("SC", "Santa Catarina");
        estadosBrasileiros.put("PR", "Parana");

        System.out.println(estadosBrasileiros);

        estadosBrasileiros.remove("MG");
        estadosBrasileiros.put("DF", "Brasilia");

        System.out.println(estadosBrasileiros.size());

        Set<String> chaves = new HashSet<>();

        for (Map.Entry<String, String> entrada: estadosBrasileiros.entrySet()) {
            if ( entrada.getValue().equals("Mato Grosso do Sul")) {
                chaves.add(entrada.getKey());
            }
        }

        for(String chave : chaves) {
            estadosBrasileiros.remove(chave);
        }

        for(Map.Entry<String, String> entrada : estadosBrasileiros.entrySet()) {
            System.out.println(entrada.getValue() + " (" + entrada.getKey()+ ")");
        }
    }
}
