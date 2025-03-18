package com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico;

public class Paciente {
    protected String nomePaciente;
    protected int idade;
    protected double custoConsulta;

    public Paciente(String nomePaciente, int idade, double custoConsulta) {
        this.nomePaciente = nomePaciente;
        this.idade = idade;
        this.custoConsulta = custoConsulta;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getCustoConsulta() {
        return custoConsulta;
    }

    public void setCustoConsulta(double custoConsulta) {
        this.custoConsulta = custoConsulta;
    }

    public void exibirDados() {
        System.out.printf("Paciente \n Nome do Paciente: %s, Idade: %d, Valor da Consulta: %.2f\n", nomePaciente, idade, custoConsulta);
    }
}
