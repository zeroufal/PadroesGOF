package br.gof.criacionais.builder;

public class PrepadorRefeicaoCompleta implements PreparadorDeRefeicao {

	@Override
	public Refeicao preparar() {
		return new Refeicao("Completa", "Frango com Arroz", "Arroz", "Salada", "Coca-cola");
	}
	
}
