package com.senai.aula01_introducaoPOO.exercicios.gerenciamentoDeAlunos;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(
                "Victor",
                20,
                10
        );
        Aluno aluno2 = new Aluno(
                "Lucas",
                18,
                5
        );
        Aluno aluno3 = new Aluno(
                "Julia",
                19,
                7
        );

        aluno3.atualizaNota(8);

        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();

        if (aluno1.verificarAprovacao()) {
            System.out.println("Aluno " + aluno1.nome + " aprovado!!!");
        } else System.out.println("Aluno " + aluno1.nome + " reprovado!");

        if (aluno2.verificarAprovacao()) {
            System.out.println("Aluno " + aluno2.nome + " aprovado!!!");
        } else System.out.println("Aluno " + aluno2.nome + " reprovado!");

        if (aluno3.verificarAprovacao()) {
            System.out.println("Aluno " + aluno3.nome + " aprovado!!!");
        } else System.out.println("Aluno " + aluno3.nome + " reprovado!");


    }


}
