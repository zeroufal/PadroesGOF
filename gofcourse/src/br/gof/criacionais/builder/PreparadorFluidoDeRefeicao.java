package br.gof.criacionais.builder;

public interface PreparadorFluidoDeRefeicao {
	PreparadorFluidoDeRefeicao adicionarEntrada(String entrada);
	
	PreparadorFluidoDeRefeicao adicionarPratoPrincipal(String pratoPrincipal);
	
	PreparadorFluidoDeRefeicao adicionarAcompanhamento(String acompanhamento);
	
	PreparadorFluidoDeRefeicao adicionarSobremesa(String sobremesa);
	
	PreparadorFluidoDeRefeicao adicionarBebida(String bebida);
	
	Refeicao preparar(String nome);
}
