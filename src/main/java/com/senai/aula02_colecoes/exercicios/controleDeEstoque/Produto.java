package com.senai.aula02_colecoes.exercicios.controleDeEstoque;

public class Produto {
    String nomeProduto;
    int qtdProdutos;

    public Produto(String nomeProduto, int qtdProdutos) {
        this.nomeProduto = nomeProduto;
        this.qtdProdutos = qtdProdutos;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto + "\nQuantidade em estoque: " + qtdProdutos;
    }
}
