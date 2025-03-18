package com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico;

public class PacienteConvenio extends Paciente{
    private double descontoConsulta;

    public PacienteConvenio(String nomePaciente, int idade, double custoConsulta, double descontoConsulta) {
        super(nomePaciente, idade, custoConsulta);
        this.descontoConsulta = descontoConsulta;
    }

    public double getDescontoConsulta() {
        return descontoConsulta;
    }

    public void setDescontoConsulta(double descontoConsulta) {
        this.descontoConsulta = descontoConsulta;
    }

    @Override
    public void exibirDados() {
        custoConsulta -= descontoConsulta;
        System.out.printf("Paciente Conveniado\n Nome do Paciente: %s, Idade: %d, Valor da Consulta: %.2f, Desconto na Consulta: %.2f\n", nomePaciente, idade, custoConsulta, descontoConsulta);
    }
}
