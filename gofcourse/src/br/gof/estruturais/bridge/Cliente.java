package br.gof.estruturais.bridge;

public class Cliente {
    public static void main(String[] args) {
        Repositorio repositorioHibernate = new RepositorioHibernate();
        Repositorio repositorioJPA = new RepositorioJPA();

        Servico servicoEJB = new ServicoEJB();
        servicoEJB.setRepositorio(repositorioHibernate);
        Servico servicoRest = new ServicoRest();
        servicoRest.setRepositorio(repositorioJPA);

        servicoEJB.salvarDado("Marcos");
        servicoRest.salvarDado("Marcos");
    }
}
