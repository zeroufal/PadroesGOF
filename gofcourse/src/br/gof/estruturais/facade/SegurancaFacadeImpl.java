package br.gof.estruturais.facade;

public class SegurancaFacadeImpl implements SegurancaFacade {
    @Override
    public void inserirUsuario(String nome, String senha) {
        Pessoa pessoa = Repositorio.pessoas.get(nome);

        if (pessoa == null) {
            throw new IllegalArgumentException("Nao foi possivel criar Usuario, Pessoa nao encontrada com o nome indicado.");
        }

        Repositorio.usuarios.put(nome, new Usuario(nome, senha));
    }

    @Override
    public void removerUsuario(String nome) {
        Repositorio.usuarios.remove(nome);
    }

    @Override
    public void alterarSenhaUsuario(String nome, String novaSenha) {
        Repositorio.usuarios.put(nome, new Usuario(nome, novaSenha));
    }

    @Override
    public boolean login(String nome, String senha) {
        Usuario usuario = Repositorio.usuarios.get(nome);

        if (usuario == null) {
            return false;
        }

        if (!usuario.getSenha().equals(senha)) {
            return false;
        }

        return true;
    }
}
