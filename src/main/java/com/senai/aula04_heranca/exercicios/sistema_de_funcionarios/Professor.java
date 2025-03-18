package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

public class Professor extends Funcionario{
    private String disciplina;

    public Professor(String nomeFuncionario, double salario, String disciplina) {
        super(nomeFuncionario, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Professor\n Nome: %s, Salário: R$%,.2f, Disciplina: %s\n", nomeFuncionario, salario, disciplina);
    }
}
