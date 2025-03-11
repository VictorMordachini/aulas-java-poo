package com.senai.aula04_heranca.exemplos.veiculo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet Corsa", 2010, 4);
        Moto moto = new Moto("Honda Titan 160", 2023, true);

        carro.exibirDetalhes();
        moto.exibirDetalhes();

    }
}
