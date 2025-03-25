package com.senai.aula05_polimorfismo.exemplos.produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Café");
        Produto produto2 = new Produto("Arroz", 24.99);
        Produto produto3 = new Produto("Feijão", 9.99, 80);
        Produto produto4 = new Produto();

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);

    }
}
