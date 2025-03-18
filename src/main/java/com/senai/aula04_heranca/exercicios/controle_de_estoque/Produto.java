package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Produto {
    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void atualizaEstoque(int quantidade){
        this.quantidade = quantidade;
    }

    public void exibirDados(){
        System.out.printf("Produto: %s, Preco: R$%,.2f, Quantidade em estoque: %d\n", nome, preco, quantidade);
    }
}
