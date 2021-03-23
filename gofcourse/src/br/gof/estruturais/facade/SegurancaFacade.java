package br.gof.estruturais.facade;

public interface SegurancaFacade {
    void inserirUsuario(String nome, String senha);

    void removerUsuario(String nome);

    void alterarSenhaUsuario(String nome, String novaSenha);

    boolean login(String nome, String senha);
}
