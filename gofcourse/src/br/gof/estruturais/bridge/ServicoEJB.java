package br.gof.estruturais.bridge;

public class ServicoEJB implements Servico {
    private Repositorio repositorio;

    @Override
    public void salvarDado(String dado) {
        System.out.println("Servico EJB acessado: " + dado);

        repositorio.inserirDado(dado);
    }

    @Override
    public void setRepositorio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }
}
