package com.senai.aula06_abstracao.exemplos.veiculo;

public class Main {
    public static void main(String[] args) {
        testarVeiculo(new Carro(), 50);
        testarVeiculo(new Moto(), 60);
    }
    private static void testarVeiculo(Veiculo veiculo, int incremento){
        veiculo.ligar();
        veiculo.acelerar(incremento);
    }
}
