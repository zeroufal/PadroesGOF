package br.gof.estruturais.adapter;

public class Computador {
    private HDMI porta;

    public void conectarCabo(HDMI cabo) {
        System.out.println("Conectando cabo HDMI. ");
        porta = cabo;
    }

    public void iniciarTransmissao(String audio, String video) {
        System.out.println("Iniciando transmissao");
        porta.transmitirVideo(video);
        porta.transmitirAudio(audio);
    }
}
