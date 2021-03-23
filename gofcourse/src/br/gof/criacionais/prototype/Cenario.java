package br.gof.criacionais.prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cenario implements Cloneable {
	private String nome;
	private int dificuldade;
	
	private List<Monstro> monstros;

	public Cenario(String nome, int dificuldade) {
		this.nome = nome;
		this.dificuldade = dificuldade;
		
		monstros = new ArrayList<>();
	}

	public void prepararCenario() {
		for(Monstro m: monstros) {
			m.setDificuldade(dificuldade);
		}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}

	public int getDificuldade() {
		return dificuldade;
	}
	
	public void adicionarNovoMonstro(Monstro novoMonstro) {
		monstros.add(novoMonstro);
	}

	public List<Monstro> getMonstros() {
		List<Monstro> copiaNaoModificavelDeMonstros = Collections.unmodifiableList(monstros);
		
		return copiaNaoModificavelDeMonstros;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Cenario cenarioClone = (Cenario) super.clone();
		
		List<Monstro> monstrosClones = new ArrayList<>();
		
		for(Monstro m : this.monstros) {
			monstrosClones.add((Monstro) m.clone());
		}

		cenarioClone.monstros = monstrosClones;
		
		return cenarioClone;
	}

	@Override
	public String toString() {
		return "Cenario [nome=" + nome + ", dificuldade=" + dificuldade + ", monstros=" + monstros + "]";
	}
	
}
