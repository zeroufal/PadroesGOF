package br.gof.criacionais.abstractfactory;

public class MagiaDivina implements Magia {

	@Override
	public ForcaMagica getForcaMagica() {
		return ForcaMagica.FORTE;
	}

}
