package com.senai.aula01_introducaoPOO.exemplos.pessoa;

public class Pessoa {
    String nome;
    int idade;
    float altura;
    String endereco;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public void falar(String frase) {
        System.out.println("A pessoa falou: " + frase);
    }

    public void comer(String alimento) {
        System.out.println("A pessoa comeu: " + alimento);
    }
}
