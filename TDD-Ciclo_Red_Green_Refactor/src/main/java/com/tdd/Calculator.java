package com.tdd;

public class Calculator {

    // CÓDIGO REFACTORIZADO CON TODOS LOS METODOS IMPLEMENTADOS

    public int suma(int primerNumero, int segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public int resta(int primerNumero, int segundoNumero) {
        return primerNumero - segundoNumero;
    }

    public int multiplicacion(int primerNumero, int segundoNumero) {
        return primerNumero * segundoNumero;
    }

    public double division(int dividendo, int divisor) {
        validarDivisor(divisor);
        return (double) dividendo / divisor;
    }

    private void validarDivisor(int divisor) {
        if (divisor == 0)
            throw new ArithmeticException("División por cero no permitida");
    }
}
