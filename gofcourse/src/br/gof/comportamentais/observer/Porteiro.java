package br.gof.comportamentais.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Porteiro implements Subject {

    private Set<Observer> observadores;

    public Porteiro() {
        this.observadores = new HashSet<>();
    }

    @Override
    public void addObserver(Observer observador) {
        this.observadores.add(observador);
    }

    @Override
    public void notificarObservers() {
        for(Observer observador: observadores) {
            observador.executarAtualizacao();
        }
    }
}
