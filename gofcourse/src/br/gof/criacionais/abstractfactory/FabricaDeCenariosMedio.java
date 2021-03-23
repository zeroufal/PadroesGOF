package br.gof.criacionais.abstractfactory;

public class FabricaDeCenariosMedio implements FabricaDeCenarios {

	@Override
	public Monstro fabricarMonstro() {
		return new Guerreiro();
	}

	@Override
	public Magia fabricarMagia() {
		return new MagiaArcana();
	}

}
