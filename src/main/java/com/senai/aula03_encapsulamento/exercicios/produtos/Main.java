package com.senai.aula03_encapsulamento.exercicios.produtos;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Banana");
        produto1.setPreco(2.99);

        System.out.println("O nome do produto é: "+produto1.getNome());
        System.out.println("O preço do produto é: "+produto1.getPreco());

        produto1.setPreco(-2.00);
    }
}
