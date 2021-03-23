package br.gof.criacionais.abstractfactory;

public class Cliente {

	public static void main(String[] args) {
		FabricaDeCenarios fabricaDeCenarios = new FabricaDeCenariosFacil();

		Monstro monstro = fabricaDeCenarios.fabricarMonstro();
		Magia magia = fabricaDeCenarios.fabricarMagia();

		System.out.println(monstro.getTipo());
		System.out.println(magia.getForcaMagica());

		fabricaDeCenarios = new FabricaDeCenariosDificil();

		monstro = fabricaDeCenarios.fabricarMonstro();
		magia = fabricaDeCenarios.fabricarMagia();

		System.out.println(monstro.getTipo());
		System.out.println(magia.getForcaMagica());

	}

}
