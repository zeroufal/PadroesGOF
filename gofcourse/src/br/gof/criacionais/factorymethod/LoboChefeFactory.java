package br.gof.criacionais.factorymethod;

public class LoboChefeFactory implements MonstroFactory {

	@Override
	public Monstro fabricar() {
		return new LoboChefe();
	}

}
