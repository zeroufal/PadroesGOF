package br.gof.comportamentais.observer;

public class Cliente {
    public static void main(String[] args) {
        Subject porteiro = new Porteiro();

        Observer marcos = new Convidado("Marcos");
        Observer douglas = new Convidado("Douglas");

        porteiro.addObserver(marcos);
        porteiro.addObserver(douglas);
        porteiro.notificarObservers();
    }
}
