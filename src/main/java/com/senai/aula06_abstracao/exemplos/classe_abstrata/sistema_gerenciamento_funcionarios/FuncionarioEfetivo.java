package com.senai.aula06_abstracao.exemplos.classe_abstrata.sistema_gerenciamento_funcionarios;

public class FuncionarioEfetivo extends Funcionario {
    private double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;
    }

    @Override
    public double calcularBonus() {
       return salario += bonusMensal;
    }
}
