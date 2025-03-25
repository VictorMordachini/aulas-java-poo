package com.senai.aula05_polimorfismo.exemplos.calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somar(2,3);
        calculadora.somar(2,3,5);
        calculadora.somar(3.5,4.3);
        calculadora.somar(5,6.9);
        calculadora.somar(6.9,4);
    }
}
