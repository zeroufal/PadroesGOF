package br.gof.estruturais.bridge;

public interface Servico {
    void salvarDado(String dado);

    void setRepositorio(Repositorio repositorio);
}
