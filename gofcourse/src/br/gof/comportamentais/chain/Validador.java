package br.gof.comportamentais.chain;

public interface Validador {
    void executarValidacao(String senha);

    Validador adicionarValidador(Validador proximoValidador);

    void setProximoValidador(Validador proximoValidador);
}
