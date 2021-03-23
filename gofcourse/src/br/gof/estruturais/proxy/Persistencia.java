package br.gof.estruturais.proxy;

public interface Persistencia {
    void save(String valor);

    void remove(String valor);

    void get(String id);
}
