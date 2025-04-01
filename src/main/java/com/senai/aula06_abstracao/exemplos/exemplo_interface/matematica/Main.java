package com.senai.aula06_abstracao.exemplos.exemplo_interface.matematica;

public class Main {
    public static void main(String[] args) {
        int soma = Matematica.somar(10, 30);
        System.out.println("Resultado da soma entre 10 e 30: " + soma);
        System.out.println("O valor de pi é: " + Matematica.PI);

    }
}

