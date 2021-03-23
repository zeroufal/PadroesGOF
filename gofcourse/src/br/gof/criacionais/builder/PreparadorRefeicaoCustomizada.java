package br.gof.criacionais.builder;

public class PreparadorRefeicaoCustomizada implements PreparadorFluidoDeRefeicao {

	private String entrada;
	private String pratoPrincipal;
	private String acompanhamento;
	private String sobremesa;
	private String bebida;
	
	@Override
	public PreparadorFluidoDeRefeicao adicionarEntrada(String entrada) {
		this.entrada = entrada;
		return this;
	}

	@Override
	public PreparadorFluidoDeRefeicao adicionarPratoPrincipal(String pratoPrincipal) {
		this.pratoPrincipal = pratoPrincipal;
		return this;
	}

	@Override
	public PreparadorFluidoDeRefeicao adicionarAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
		return this;
	}

	@Override
	public PreparadorFluidoDeRefeicao adicionarSobremesa(String sobremesa) {
		this.sobremesa = sobremesa;
		return this;
	}

	@Override
	public PreparadorFluidoDeRefeicao adicionarBebida(String bebida) {
		this.bebida = bebida;
		return this;
	}

	@Override
	public Refeicao preparar(String nome) {
		return new Refeicao(nome, pratoPrincipal, sobremesa, acompanhamento, bebida);
	}

}
