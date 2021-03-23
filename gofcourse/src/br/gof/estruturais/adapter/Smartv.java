package br.gof.estruturais.adapter;

public class Smartv implements HDMI {
    @Override
    public void transmitirAudio(String audio) {
        System.out.println("Transmitindo audio hdmi: " + audio);
    }

    @Override
    public void transmitirVideo(String video) {
        System.out.println("Transmitindo video hdmi: " + video);

    }
}
