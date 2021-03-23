package br.gof.criacionais.prototype;

public class Monstro implements Cloneable {
	private final String nome;
	private int dificuldade;

	public Monstro(String nome, int dificuldade) {
		this.nome = nome;
		this.dificuldade = dificuldade;
	}

	public String getNome() {
		return nome;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}

	@Override
	public String toString() {
		return "Monstro [nome=" + nome + ", dificuldade=" + dificuldade + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
