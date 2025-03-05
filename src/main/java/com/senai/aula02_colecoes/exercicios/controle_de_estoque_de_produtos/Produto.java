package com.senai.aula02_colecoes.exercicios.controle_de_estoque_de_produtos;

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
