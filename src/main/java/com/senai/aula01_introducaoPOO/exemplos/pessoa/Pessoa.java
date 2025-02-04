package com.senai.aula01_introducaoPOO.exemplos.pessoa;

//criando objeto pessoa
public class Pessoa {
    String nome;
    int idade;
    float altura;
    Endereco endereco;

    //construtor preenchendo todos os atributos
    public Pessoa(String nome, int idade, float altura, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.endereco = endereco;
    }

    //construtor simples preenchendo apenas 2 atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    //criando ações para o objeto
    public void falar(String frase) {
        System.out.println(nome + " falou: " + frase);
    }

    public void comer(String alimento) {
        System.out.println(nome + " comeu " + alimento);
    }

    //sobreecrevendo to string para exibir objeto(padrão herdado do object pai exibe apenas endereço de memória)
    @Override
    public String toString() {
        return "O nome da pessoa é " + this.nome + ", tem " + this.idade +
                " anos, " + this.altura + " de altura e mora no endereço " + this.endereco;
    }
}
