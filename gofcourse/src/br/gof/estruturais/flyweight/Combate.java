package br.gof.estruturais.flyweight;

public class Combate {
    private Personagem p1;
    private Personagem p2;

    public Combate(Personagem p1, Personagem p2) {
        this.p1 = p1;
        this.p1.incrementarUtilizacao();
        this.p2 = p2;
        this.p2.incrementarUtilizacao();
    }

    public void definirVencedor(boolean p1Vencedor) {
        if(p1Vencedor) {
            this.p1.incrementarVitoria();
        } else {
            this.p2.incrementarVitoria();
        }
    }

    public Personagem getP1() {
        return p1;
    }

    public Personagem getP2() {
        return p2;
    }
}
