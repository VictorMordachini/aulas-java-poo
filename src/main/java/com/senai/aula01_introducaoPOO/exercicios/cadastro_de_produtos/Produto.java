package com.senai.aula01_introducaoPOO.exercicios.cadastro_de_produtos;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDetalhes() {
        System.out.printf("%d | Produto:  %s | Preço: R$%.2f | Quantidade em estoque: %d\n", id, nome, preco, quantidade);
    }

    public void atualizaEstoque(int novaQuantidade) {
        if (novaQuantidade > -1) {
            setQuantidade(novaQuantidade);
        } else System.out.println("Valor inválido. O valor deve ser igual ou maior que 0.");
    }

    public void calcularValorEstoque() {
        double valorTotal = preco * quantidade;
        System.out.printf("O valor total do produto %s em estoque é de R$%.2f\n", nome, valorTotal);
    }



}
