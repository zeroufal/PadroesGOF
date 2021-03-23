package br.gof.comportamentais.chain;

public class ValidadorNuloOuVazio implements Validador {
    private Validador proximoValidador;

    @Override
    public void executarValidacao(final String senha) {
        if (senha == null || senha.isBlank() || senha.isEmpty()) {
            throw new IllegalArgumentException("Senha invalida: nao pode ser vazio ou nulo.");
        }

        if (proximoValidador != null)
            proximoValidador.executarValidacao(senha);
    }

    @Override
    public Validador adicionarValidador(Validador proximoValidador) {
        this.proximoValidador = proximoValidador;
        return this;
    }

    @Override
    public void setProximoValidador(Validador proximoValidador) {
        this.proximoValidador = proximoValidador;
    }
}
