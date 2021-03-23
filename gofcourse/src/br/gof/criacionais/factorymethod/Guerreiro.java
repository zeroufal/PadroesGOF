package br.gof.criacionais.factorymethod;

public class Guerreiro implements Monstro {

	@Override
	public Dificuldade getTipo() {
		return Dificuldade.MEDIO;
	}

}
