package com.aprendizado;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testeSomar() { assertEquals(10, calc.somar(7, 3)); }

    @Test
    void testeSubtrair() { assertEquals(5, calc.subtrair(10, 5)); }

    @Test
    void testeMultiplicar() { assertEquals(20, calc.multiplicar(4, 5)); }

    @Test
    void testeDividir() { assertEquals(2.0, calc.dividir(10, 5)); }

    @Test
    void testeEhPositivo() { assertTrue(calc.ehPositivo(1)); }
}