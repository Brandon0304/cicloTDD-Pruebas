package com.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculadora = new Calculator();

    // SUMA
    @Test
    void testSuma_DosNumeros() {
        // RED: Este test FALLA porque suma() no existe en Calculator
        assertEquals(5, calculadora.suma(2, 3));
    }
    // RESTA
    @Test
    void testResta_DosNumeros() {
        // RED: Este test FALLA porque resta() no existe en Calculator
        assertEquals(2, calculadora.resta(5, 3));
    }
    // MULTIPLICACIÓN
    @Test
    void testMultiplicacion_DosNumeros() {
        // RED: Este test FALLA porque multiplicacion() no existe en Calculator
        assertEquals(20, calculadora.multiplicacion(4, 5));
    }
    // DIVISIÓN
    @Test
    void testDivision_DosNumeros() {
        // RED: Este test FALLA porque division() no existe en Calculator
        assertEquals(5.0, calculadora.division(10, 2), 0.0001);
    }
}