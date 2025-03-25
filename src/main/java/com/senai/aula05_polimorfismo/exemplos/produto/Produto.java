package com.senai.aula05_polimorfismo.exemplos.produto;

public class Produto {
    private String nome;
    private double preco;
    private int qtd;

    // Sobrecarga de construtor: Diferentes construtores para possibilitar a construção de diferentes formas.
    public Produto(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto() {

    }

    @Override
    public String toString() {
        return "Produto: " +
                "\nNome: " + nome +
                "\nPreco: R$" + preco +
                "\nQuantidade: " + qtd + "\n";
    }
}
