package br.gof.estruturais.flyweight;

public class Cliente {
    public static void main(String[] args) {
        Personagem ryu = new Personagem(FabricaDePersonagemLeve.getInstance().getJogador("Ryu"));
        Personagem ken = new Personagem(FabricaDePersonagemLeve.getInstance().getJogador("Ken"));

        Combate combate1 = new Combate(ryu, ken);
        combate1.definirVencedor(true);

        Combate combate2 = new Combate(ryu, ken);
        combate1.definirVencedor(false);

        Combate combate3 = new Combate(ryu, ken);
        combate1.definirVencedor(true);

        Fliperama fliperama = new Fliperama();
        fliperama.criarCombate(combate1);
        fliperama.criarCombate(combate2);
        fliperama.criarCombate(combate3);
        fliperama.gerarRelatorio();

        ryu = new Personagem(FabricaDePersonagemLeve.getInstance().getJogador("Ryu"));
        ken = new Personagem(FabricaDePersonagemLeve.getInstance().getJogador("Ken"));
        Personagem guile = new Personagem(FabricaDePersonagemLeve.getInstance().getJogador("Guile"));

        Combate combate4 = new Combate(ryu, ken);
        combate1.definirVencedor(true);

        Combate combate5 = new Combate(ryu, ken);
        combate1.definirVencedor(true);

        Combate combate6 = new Combate(guile, ken);
        combate1.definirVencedor(false);

        Combate combate7= new Combate(guile, ken);
        combate1.definirVencedor(false);

        Fliperama fliperama2 = new Fliperama();
        fliperama2.criarCombate(combate4);
        fliperama2.criarCombate(combate5);
        fliperama2.criarCombate(combate6);
        fliperama2.criarCombate(combate7);
        fliperama2.gerarRelatorio();
    }
}
