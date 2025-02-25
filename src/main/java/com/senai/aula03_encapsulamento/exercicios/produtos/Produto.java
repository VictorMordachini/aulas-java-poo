package com.senai.aula03_encapsulamento.exercicios.produtos;

public class Produto {

    private String nome;
    private double preco;

    public Produto(){
        preco = 0;
        nome = null;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0){
            this.preco = preco;
        } else System.out.println("Valor inválido");

    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return  nome + " " + preco;
    }
}
