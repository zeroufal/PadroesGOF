package br.gof.estruturais.adapter;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Exemplo ligando tv hdmi.");
        Computador computador = new Computador();
        computador.conectarCabo(new Smartv());
        computador.iniciarTransmissao("reporter falando", "reporter te olhando");

        System.out.println("Exemplo ligando tv de tubo vga.");
        computador.conectarCabo(new HDMItoVGAAdapter(new TvTubo()));
        computador.iniciarTransmissao("reporter falando", "reporter te olhando");
    }
}
