package br.com.dio.basico.streams;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ClienteOptional {
    public static void main(String[] args) {
        exercicioFinal();
    }

    public static void exemplo1(){
        Optional<String> optionalString = Optional.of("Exemplo de optional");

        System.out.println(optionalString);

        Optional<PessoaOptional> optionalPessoa = Optional.empty();

        System.out.println(optionalPessoa);

        PessoaOptional pessoaOptionalNula = null;

        Optional<PessoaOptional> optionalPessoaNula = Optional.ofNullable(pessoaOptionalNula);

        System.out.println(optionalPessoaNula);

        pessoaOptionalNula = new PessoaOptional("Marcos");

        System.out.println(optionalPessoaNula);
    }

    public static void exemplo2() {
        OptionalInt optionalInt = OptionalInt.empty();
        System.out.println(optionalInt);
        System.out.println(optionalInt.isEmpty());
        System.out.println(optionalInt.isPresent());
        optionalInt = OptionalInt.of(12);
        System.out.println(optionalInt);
        System.out.println(optionalInt.isEmpty());
        System.out.println(optionalInt.isPresent());

        OptionalLong optionalLong = OptionalLong.of(1000L);
        System.out.println(optionalLong);
    }

    public static void exemplo3() {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional);

        System.out.println(optional.isEmpty());

        if (!optional.isEmpty()) {
            String valor = optional.get();

            System.out.println(valor);
        }

        optional.ifPresent(System.out::println);

        optional.ifPresentOrElse(System.out::println, ()-> System.out.println("nao esta presente"));
    }

    public static void exemplo4() {
        Optional<String> optional = Optional.ofNullable(null);

        System.out.println(optional.orElseThrow(IllegalStateException::new));
    }

    public static void exercicioFinal() {
        Optional<String> optionalPresente = Optional.of("Teste");
        Optional<String> optionalVazia = Optional.empty();
        Optional<String> optionalNulavel = Optional.ofNullable(null);

        optionalPresente.ifPresentOrElse(
                (presente)-> System.out.println(presente.concat("****")), ()-> System.out.println("Esta vasio"));
        optionalVazia.ifPresentOrElse(
                (presente)-> System.out.println(presente.concat("****")), ()-> System.out.println("Esta vasio"));
        optionalNulavel.ifPresentOrElse(
                (presente)-> System.out.println(presente.concat("****")), ()-> System.out.println("Esta vasio"));

        Optional<String> novoOptional = optionalPresente.map((valor)->valor.concat("k"));

        System.out.println(novoOptional.get());

        Optional<String> teset = Optional.of(null);

        System.out.println(teset);
    }
}

class PessoaOptional {
    private final String nome;

    public PessoaOptional(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
