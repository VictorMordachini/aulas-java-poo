package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

public class Funcionario {
    protected String nomeFuncionario;
    protected double salario;

    public Funcionario(String nomeFuncionario, double salario) {
        this.nomeFuncionario = nomeFuncionario;
        this.salario = salario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirDados(){
            System.out.printf("Funcionário\n Nome: %s, Salário: R$%,.2f\n", nomeFuncionario, salario);
    }
}
