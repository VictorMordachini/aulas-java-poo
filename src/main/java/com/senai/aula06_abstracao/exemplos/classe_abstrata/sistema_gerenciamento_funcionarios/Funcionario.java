package com.senai.aula06_abstracao.exemplos.classe_abstrata.sistema_gerenciamento_funcionarios;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    public abstract double calcularBonus();

    public void exibirDados() {
        System.out.printf("%s recebe R$%,.2f \n", nome, salario);
    }
}
