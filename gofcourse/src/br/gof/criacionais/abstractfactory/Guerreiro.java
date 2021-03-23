package br.gof.criacionais.abstractfactory;

public class Guerreiro implements Monstro {

	@Override
	public Dificuldade getTipo() {
		return Dificuldade.MEDIO;
	}

}
