package br.gof.estruturais.flyweight;

public class PersonagemLeve {
    private String nome;

    public PersonagemLeve(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "JogadorLeve{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
