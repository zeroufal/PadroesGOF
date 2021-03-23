package br.gof.estruturais.decorator;

public class Cliente {
    public static void main(String[] args) {
        String mensagemDireta = "Bom dia!";

        Mensagem mensagem = new MensagemPadrao();
        mensagem.escreverMenasgem(mensagemDireta);

        mensagem = new MensagemDecorada(mensagem);
        mensagem.escreverMenasgem(mensagemDireta);
    }


}
