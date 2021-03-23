package br.gof.estruturais.proxy;

public class PersistenciaVirtual implements Persistencia {
    private PersistenciaPadrao persistencia;

    public PersistenciaVirtual(PersistenciaPadrao persistencia) {
        this.persistencia = persistencia;
    }

    @Override
    public void save(String valor) {
        this.persistencia.save(valor);
    }

    @Override
    public void remove(String valor) {
        this.persistencia.remove(valor);
    }

    @Override
    public void get(String id) {
        System.out.println("Carregando objeto em modo lazy.");

        System.out.println("Buscando objeto :" + id);
        System.out.println("Objeto Recuperado:" + id);
    }
}
