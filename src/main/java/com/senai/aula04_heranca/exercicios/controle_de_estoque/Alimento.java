package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Alimento extends Produto{
    private String dataValidade;

    public Alimento(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Produto: %s, Preco: R$%,.2f, Quantidade em estoque: %d, Data de Validade: %s\n", nome, preco, quantidade, dataValidade);
    }
}
