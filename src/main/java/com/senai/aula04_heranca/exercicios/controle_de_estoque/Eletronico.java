package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Eletronico extends Produto{
    private String tensao;

    public Eletronico(String nome, double preco, int quantidade, String tensao) {
        super(nome, preco, quantidade);
        this.tensao = tensao;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Produto: %s, Preco: R$%,.2f, Quantidade em estoque: %d, Tensão: %s\n", nome, preco, quantidade, tensao);
    }
}
