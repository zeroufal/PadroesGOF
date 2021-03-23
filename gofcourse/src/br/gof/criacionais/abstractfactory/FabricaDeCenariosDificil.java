package br.gof.criacionais.abstractfactory;

public class FabricaDeCenariosDificil implements FabricaDeCenarios {

	public FabricaDeCenariosDificil() {
		
	}
	
	@Override
	public Monstro fabricarMonstro() {
		return new LoboChefe();
	}

	@Override
	public Magia fabricarMagia() {
		return new MagiaDivina();
	}

}
