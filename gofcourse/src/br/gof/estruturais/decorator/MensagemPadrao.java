package br.gof.estruturais.decorator;

public class MensagemPadrao implements Mensagem {
    @Override
    public void escreverMenasgem(String valor) {
        System.out.println("Mensagem: " + valor);
    }
}
