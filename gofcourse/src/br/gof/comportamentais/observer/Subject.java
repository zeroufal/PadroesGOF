package br.gof.comportamentais.observer;

public interface Subject {
    void addObserver(Observer observador);

    void notificarObservers();
}
