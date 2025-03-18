package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

import java.util.ArrayList;

public class Coordenador extends Funcionario{
    private int equipeProfessores;

    public Coordenador(String nomeFuncionario, double salario, int equipeProfessores) {
        super(nomeFuncionario, salario);
        this.equipeProfessores = equipeProfessores;
    }

    public int getEquipeProfessores() {
        return equipeProfessores;
    }

    public void setEquipeProfessores(int equipeProfessores) {
        this.equipeProfessores = equipeProfessores;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Coordenador\n Nome: %s, Salário: R$%,.2f, Equipe: %d\n", nomeFuncionario, salario, equipeProfessores);
    }
}
