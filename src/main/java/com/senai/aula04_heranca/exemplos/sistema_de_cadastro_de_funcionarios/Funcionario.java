package com.senai.aula04_heranca.exemplos.sistema_de_cadastro_de_funcionarios;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.printf("Funcionário\n Nome: %s, Salário: R$%,.2f\n", nome, salario);
    }

}
