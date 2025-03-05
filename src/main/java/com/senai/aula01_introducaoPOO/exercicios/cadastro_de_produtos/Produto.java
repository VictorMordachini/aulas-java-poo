package com.senai.aula01_introducaoPOO.exercicios.cadastro_de_produtos;

public class Produto {
    String nome;
    Double preco;
    int quantidade;

    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade);

    }

    public void atualizaEstoque(int quantidadeProdutos) {
        quantidade += quantidadeProdutos;
        System.out.println("A quantidade de " + nome + " atualizada é de: " + quantidade);
    }

    public void calcularValorEstoque() {
        double valorEstoque = (quantidade * preco);
        System.out.println("O valor do estoque de " + nome + " é igual a: R$" + valorEstoque);

    }
}
