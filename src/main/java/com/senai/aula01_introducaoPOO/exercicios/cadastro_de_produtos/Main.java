package com.senai.aula01_introducaoPOO.exercicios.cadastro_de_produtos;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Abacaxi",
                15.00,
                23
        );

        Produto produto2 = new Produto(
                "Toddy",
                7.00,
                89
        );


        produto2.atualizaEstoque(-33);

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();

        produto1.calcularValorEstoque();
        produto2.calcularValorEstoque();


    }

}
