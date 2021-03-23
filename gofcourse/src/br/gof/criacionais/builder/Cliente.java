package br.gof.criacionais.builder;

public class Cliente {

	public static void main(String[] args) {
		PreparadorDeRefeicao preparador = new PrepadorRefeicaoCompleta();

		Refeicao refeicaoCompleta = preparador.preparar();

		System.out.println(refeicaoCompleta);

		PreparadorFluidoDeRefeicao preparadorFluido = new PreparadorRefeicaoCustomizada();
		Refeicao refeicaoSimples = preparadorFluido.adicionarPratoPrincipal("Frango, arroz e batata frita")
				.adicionarBebida("Coca-cola").preparar("A la Minuta");
		System.out.println(refeicaoSimples);
	}

}
