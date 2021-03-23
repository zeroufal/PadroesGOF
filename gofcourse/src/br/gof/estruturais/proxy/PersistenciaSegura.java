package br.gof.estruturais.proxy;

public class PersistenciaSegura implements Persistencia {
    private PersistenciaPadrao persistencia;

    public PersistenciaSegura(PersistenciaPadrao persistencia) {
        this.persistencia = persistencia;
    }

    @Override
    public void save(String valor) {
        persistencia.save(valor);
    }

    @Override
    public void remove(String valor) {
        System.out.println("Por questoes de seguranca, nao podemos remove o valor");
    }

    @Override
    public void get(String id) {
        persistencia.get(id);
    }
}
