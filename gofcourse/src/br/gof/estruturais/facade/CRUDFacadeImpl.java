package br.gof.estruturais.facade;

import java.util.Collection;

public class CRUDFacadeImpl implements CRUDFacade {
    @Override
    public void inserirPessoa(String nome) {
        Repositorio.pessoas.put(nome, new Pessoa(nome));
    }

    @Override
    public void removerPessoa(String nome) {
        Repositorio.pessoas.remove(nome, new Pessoa(nome));
    }

    @Override
    public void atualizarPessoa(String nomeAntigo, String nomeNovo) {
        Repositorio.pessoas.put(nomeAntigo, new Pessoa(nomeNovo));
    }

    @Override
    public Collection<Pessoa> listarTodasAsPessoas() {
        return Repositorio.pessoas.values();
    }
}
