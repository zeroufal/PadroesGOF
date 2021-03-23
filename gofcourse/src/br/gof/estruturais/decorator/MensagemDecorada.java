package br.gof.estruturais.decorator;

public class MensagemDecorada implements Mensagem {
    private Mensagem mensagem;

    public MensagemDecorada(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void escreverMenasgem(String valor) {
        mensagem.escreverMenasgem("!!!" + valor + "!!!");
    }
}
