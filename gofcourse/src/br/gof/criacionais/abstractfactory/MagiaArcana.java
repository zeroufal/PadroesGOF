package br.gof.criacionais.abstractfactory;

public class MagiaArcana implements Magia {

	@Override
	public ForcaMagica getForcaMagica() {
		return ForcaMagica.MEDIA;
	}

}
