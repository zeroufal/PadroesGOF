package br.gof.criacionais.abstractfactory;

public class Goblin implements Monstro {

	@Override
	public Dificuldade getTipo() {
		return Dificuldade.FACIL;
	}

}
