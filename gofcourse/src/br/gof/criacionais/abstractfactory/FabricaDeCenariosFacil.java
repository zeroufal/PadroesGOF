package br.gof.criacionais.abstractfactory;

public class FabricaDeCenariosFacil implements FabricaDeCenarios {

	@Override
	public Monstro fabricarMonstro() {
		return new Goblin();
	}

	@Override
	public Magia fabricarMagia() {
		return new MagiaInfernal();
	}

}
