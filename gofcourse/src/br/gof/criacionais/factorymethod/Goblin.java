package br.gof.criacionais.factorymethod;

public class Goblin implements Monstro {

	@Override
	public Dificuldade getTipo() {
		return Dificuldade.FACIL;
	}

}
