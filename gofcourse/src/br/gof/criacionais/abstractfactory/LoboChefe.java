package br.gof.criacionais.abstractfactory;

public class LoboChefe implements Monstro {
	@Override
	public Dificuldade getTipo() {
		return Dificuldade.DIFICIL;
	}
}
