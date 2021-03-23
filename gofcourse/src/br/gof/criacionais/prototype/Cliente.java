package br.gof.criacionais.prototype;

public class Cliente {
	public static void main(String[] args) throws CloneNotSupportedException {
		Monstro gnomo = new Monstro("Gnomo", 1);
		Monstro mago = new Monstro("Mago", 1);
		
		Cenario cenarioFacil = new Cenario("Cenario facil", 1);
		cenarioFacil.adicionarNovoMonstro(gnomo);
		cenarioFacil.adicionarNovoMonstro(mago);
		cenarioFacil.prepararCenario();
		
		Cenario cenarioMedio = (Cenario) cenarioFacil.clone();
		cenarioMedio.setNome("Cenario medio");
		cenarioMedio.setDificuldade(2);
		cenarioMedio.prepararCenario();
		
		System.out.println(cenarioFacil);
		System.out.println(cenarioMedio);
	}
}
