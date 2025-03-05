package com.senai.aula03_encapsulamento.exercicios.cadastro_de_produto_simples;

import java.util.Objects;

public class Produto {

    private String nome;
    private double preco;

    public Produto(){
        preco = 0;
        nome = null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }

    @Override
    public String toString() {
        return  nome + " " + preco;
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




}
