package br.gof.criacionais.factorymethod;

public class GuerreiroFactory implements MonstroFactory {

	@Override
	public Monstro fabricar() {
		return new Guerreiro();
	}

}
