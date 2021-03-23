package br.gof.estruturais.proxy;

public class PersistenciaPadrao implements Persistencia {
    @Override
    public void save(String valor) {
        System.out.println("Salvando valor: " + valor);
    }

    @Override
    public void remove(String valor) {
        System.out.println("Removendo valor: " + valor);
    }

    @Override
    public void get(String id) {
        System.out.println("Buscando objeto :" + id);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Objeto recuperado:" + id);
    }
}
