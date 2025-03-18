package com.senai.aula04_heranca.exercicios.sistema_de_atendimento_medico;

public class Main {
    public static void main(String[] args) {
        PacienteParticular pacienteParticular = new PacienteParticular("Pedro", 17, 250);
        pacienteParticular.exibirDados();

        PacienteConvenio pacienteConvenio = new PacienteConvenio("Victor", 20, 300, 50);
        pacienteConvenio.exibirDados();
    }
}
