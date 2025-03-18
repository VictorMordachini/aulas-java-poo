package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Bicicleta", 899, 5);

        Alimento alimento1 = new Alimento("Frango", 18.99, 20, "18/09/2025");

        Eletronico eletronico1 = new Eletronico("Air Fryer", 900, 15, "110V");

        produto.exibirDados();
        alimento1.exibirDados();
        eletronico1.exibirDados();

        produto.atualizaEstoque(15);
        alimento1.atualizaEstoque(15);
        eletronico1.atualizaEstoque(1);

        produto.exibirDados();
        alimento1.exibirDados();
        eletronico1.exibirDados();

    }
}
