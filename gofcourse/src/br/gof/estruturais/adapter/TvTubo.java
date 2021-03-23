package br.gof.estruturais.adapter;

public class TvTubo implements VGA {
    @Override
    public void transmitirImagem(String video) {
        System.out.println("Transmitindo imagem vga: " + video);
    }
}
