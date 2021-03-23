package br.gof.criacionais.abstractfactory;

public class MagiaInfernal implements Magia {

	@Override
	public ForcaMagica getForcaMagica() {
		return ForcaMagica.FRACA;
	}

}
