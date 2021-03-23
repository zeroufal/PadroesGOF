package br.gof.estruturais.adapter;

public class HDMItoVGAAdapter implements HDMI {
    private VGA vga;

    public HDMItoVGAAdapter(VGA vga) {
        System.out.println("Conectando adaptador VGA/HDMI...");
        this.vga = vga;
    }

    @Override
    public void transmitirAudio(String audio) {
        System.out.println("Nao consigo transmitir audio!");
    }

    @Override
    public void transmitirVideo(String video) {
        vga.transmitirImagem(video);
    }
}
