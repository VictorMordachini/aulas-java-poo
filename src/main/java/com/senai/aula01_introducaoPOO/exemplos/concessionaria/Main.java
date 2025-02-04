package com.senai.aula01_introducaoPOO.exemplos.concessionaria;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "BMW",
                "X1",
                "Preto",
                2015,
                90000.00
        );

        Carro carro2 = new Carro(
                "Volkswagen",
                "Gol",
                "Cinza Azulado",
                2001,
                15000.00
        );

        System.out.println(carro1);
        System.out.println(carro2);

        carro1.testDrive();
        carro2.comprar("Victor");

        carro1.desvalorizacao();
        carro2.desvalorizacao();

    }
}
