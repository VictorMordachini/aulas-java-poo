package com.senai.aula06_abstracao.exemplos.classe_abstrata.sistema_gerenciamento_funcionarios;

public class Main {
    public static void main(String[] args) {
        pagarFuncionario(new FuncionarioEfetivo("Victor", 12000, 2000));
        pagarFuncionario(new FuncionarioTemporario("Pedro", 3000, 50, 30.0));
    }

    public static void pagarFuncionario(Funcionario funcionario) {
        System.out.println("_Pagamento funcionário(a) " + funcionario.nome + "_");
        funcionario.exibirDados();
        funcionario.aumentarSalario(15);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}
