package com.senai.aula01_introducaoPOO.exercicios.gerenciamento_de_alunos;

public class Aluno {
    String nome;
    int idade;
    double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do aluno: " + nome + "\nIdade do Aluno: " + idade + "\nNota do Aluno: " + nota);
    }

    public void atualizaNota(int novaNota) {
        nota = novaNota;
        System.out.println("A nota do aluno " + nome + " atualizada é: " + nota);
    }

    public boolean verificarAprovacao() {
        return nota >= 6;
    }
}
