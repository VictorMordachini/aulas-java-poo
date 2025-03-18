package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Alberto", 1500);

        Professor professor1 = new Professor("Rafael", 11000, "Back-End");

        Coordenador coordenador1 = new Coordenador("Denise", 18000, 2);

        funcionario1.exibirDados();
        professor1.exibirDados();
        coordenador1.exibirDados();
    }
}
