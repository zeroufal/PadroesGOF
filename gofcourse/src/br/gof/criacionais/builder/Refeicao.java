package br.gof.criacionais.builder;

public class Refeicao {
	private final String nome;
	private final String principal;
	private final String sobremesa;
	private final String acompanhamento;
	private final String bebida;
	public Refeicao(
			String nome, String principal, 
			String sobremesa, String acompanhamento, 
			String bebida) {
		super();
		this.nome = nome;
		this.principal = principal;
		this.sobremesa = sobremesa;
		this.acompanhamento = acompanhamento;
		this.bebida = bebida;
	}
	public String getNome() {
		return nome;
	}
	public String getPrincipal() {
		return principal;
	}
	public String getSobremesa() {
		return sobremesa;
	}
	public String getAcompanhamento() {
		return acompanhamento;
	}
	public String getBebida() {
		return bebida;
	}
	@Override
	public String toString() {
		return "Refeicao [nome=" + nome + ", principal=" + principal + ", sobremesa=" + sobremesa + ", acompanhamento="
				+ acompanhamento + ", bebida=" + bebida + "]";
	}
	
	
}
