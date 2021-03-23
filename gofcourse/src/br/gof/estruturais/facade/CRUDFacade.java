package br.gof.estruturais.facade;

import java.util.Collection;

public interface CRUDFacade {
    void inserirPessoa(String nome);

    void removerPessoa(String nome);

    void atualizarPessoa(String nomeAntigo, String nomeNovo);

    Collection<Pessoa> listarTodasAsPessoas();
}
