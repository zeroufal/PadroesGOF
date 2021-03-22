package br.com.dio.basico.streams;

import java.util.LinkedList;
import java.util.Queue;

public class ClienteQueue {
    public static void main(String[] args) {
        exercicioFinal();
    }

    public static void exemplo() {
        Queue<String> filaDoBanco = new LinkedList<>();
        filaDoBanco.add("Patricia");
        filaDoBanco.add("Roberto");
        filaDoBanco.add("Flavio");
        filaDoBanco.add("Pamela");
        filaDoBanco.add("Anderson");

        System.out.println(filaDoBanco);

        String proximoAtendido = filaDoBanco.poll();

        System.out.println(proximoAtendido);
        System.out.println(filaDoBanco);

        String proximoDaFila = filaDoBanco.peek();

        System.out.println(proximoDaFila);
        System.out.println(filaDoBanco);

        filaDoBanco.clear();

        System.out.println(filaDoBanco.poll());
    }

    public static void exercicioFinal() {
        Queue<String> fila = new LinkedList<>();
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("Joao");

        for(String nome : fila) {
            System.out.println(nome);
        }

        System.out.println(fila.peek());
        System.out.println(fila.poll());

        fila.add("Daniel");
        System.out.println(fila);

        System.out.println(fila.size());
        System.out.println(fila.isEmpty());
        System.out.println(fila.contains("Carlos"));
    }
}
