package br.gof.estruturais.bridge;

public class RepositorioJPA implements Repositorio {
    @Override
    public void inserirDado(String dado) {
        System.out.println("Inserido utilizando JPA: " + dado);
    }
}
