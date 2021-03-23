package br.gof.comportamentais.chain;

public class ValidadorTamanho implements Validador {
    private Validador proximoValidador;

    @Override
    public void executarValidacao(final String senha) {
        if (senha.length() > 10 || senha.length() < 6) {
            throw new IllegalArgumentException("Senha invalida: precisa estar entre 6 e 10 caracteres.");
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
