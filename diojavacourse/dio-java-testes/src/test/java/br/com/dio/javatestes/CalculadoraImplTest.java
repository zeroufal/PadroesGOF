package br.com.dio.javatestes;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculadoraImplTest {

    @Test
    public void calcularEntradaValidaDoisValoresMockito() {
        CalculadoraImpl calculadora = mock(CalculadoraImpl.class);
        double resultado = calculadora.calcular("1+1");

        assertTrue(2.0 == resultado);
    }

    @Test
    public void calcularEntradaValidaDoisValores() {
        CalculadoraImpl calculadora = new CalculadoraImpl();
        double resultado = calculadora.calcular("1+1");

        assertTrue(2.0 == resultado);
    }

    @Test
    public void calcularEntradaValidaTresValores() {
        CalculadoraImpl calculadora = new CalculadoraImpl();
        double resultado = calculadora.calcular("1+1");

        assertTrue(2.0 == resultado);
    }

    @Test(expected = NullPointerException.class)
    public void calcularEntradaInvalidaNula() {
        CalculadoraImpl calculadora = new CalculadoraImpl();
        calculadora.calcular(null);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void calcularEntradaInvalidaVazia() {
        CalculadoraImpl calculadora = new CalculadoraImpl();

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Entrada is blank");

        calculadora.calcular("");
    }

    @Test
    public void calcularEntradaInvalidaSemOperacao() {
        CalculadoraImpl calculadora = new CalculadoraImpl();

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Entrada incompativel");

        calculadora.calcular("1 1 3");
    }
}