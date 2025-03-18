package com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico;

public class PacienteParticular extends Paciente {

    public PacienteParticular(String nomePaciente, int idade, double custoConsulta) {
        super(nomePaciente, idade, custoConsulta);
    }


    @Override
    public void exibirDados() {
        System.out.printf("Paciente Particular\n Nome do Paciente: %s, Idade: %d, Valor da Consulta: %.2f\n", nomePaciente, idade, custoConsulta);
    }
}
