package br.gof.criacionais.factorymethod;

public class GoblinFactory implements MonstroFactory {

	@Override
	public Monstro fabricar() {
		return new Goblin();
	}

}
