package br.gof.criacionais.factorymethod;

public class LoboChefe implements Monstro {
	@Override
	public Dificuldade getTipo() {
		return Dificuldade.DIFICIL;
	}
}
