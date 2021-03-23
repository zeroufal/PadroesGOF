package br.gof.comportamentais.chain;

public class ValidadorTemNumeros implements Validador {
    private Validador proximoValidador;

    @Override
    public void executarValidacao(final String senha) {
        if (!senha.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Senha invalida: precisa possuir ao menos um digito.");
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
