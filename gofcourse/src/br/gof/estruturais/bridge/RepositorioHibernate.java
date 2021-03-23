package br.gof.estruturais.bridge;

public class RepositorioHibernate implements Repositorio {
    @Override
    public void inserirDado(String dado) {
        System.out.println("Inserido utilizando hibernate: " + dado);
    }
}
