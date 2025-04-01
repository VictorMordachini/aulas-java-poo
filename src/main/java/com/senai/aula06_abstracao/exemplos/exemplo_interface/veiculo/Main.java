package com.senai.aula06_abstracao.exemplos.exemplo_interface.veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();

        carro.buzinar();
        carro.acelerar();
    }
}
