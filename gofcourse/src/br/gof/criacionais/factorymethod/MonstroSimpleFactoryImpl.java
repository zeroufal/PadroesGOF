package br.gof.criacionais.factorymethod;

public class MonstroSimpleFactoryImpl implements MonstroSimpleFactory {

	@Override
	public Monstro fabricar(String tipo) {
		if ("Goblin".equals(tipo)) {
			return new Goblin();
		}
		
		if ("Guerreiro".equals(tipo)) {
			return new Guerreiro();
		}
		
		if ("LoboChefe".equals(tipo)) {
			return new LoboChefe();
		}
		
		throw new IllegalArgumentException("Tipo nao encontrado: " + tipo);
	}

}
