package br.gof.estruturais.proxy;

public class PersistenciaComTransacao implements Persistencia {
    private PersistenciaPadrao persistenciaPadrao;

    public PersistenciaComTransacao(PersistenciaPadrao persistenciaPadrao) {
        this.persistenciaPadrao = persistenciaPadrao;
    }

    @Override
    public void save(String valor) {
        System.out.println("Iniciando servico transacional");
        this.persistenciaPadrao.save(valor);
        System.out.println("Finalizanco servico transacional");
    }

    @Override
    public void remove(String valor) {
        System.out.println("Iniciando servico transacional");
        this.persistenciaPadrao.remove(valor);
        System.out.println("Finalizanco servico transacional");
    }

    @Override
    public void get(String id) {
        System.out.println("Iniciando servico transacional");
        this.persistenciaPadrao.get(id);
        System.out.println("Finalizanco servico transacional");
    }
}
