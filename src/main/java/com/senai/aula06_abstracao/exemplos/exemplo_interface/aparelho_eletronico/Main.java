package com.senai.aula06_abstracao.exemplos.exemplo_interface.aparelho_eletronico;

public class Main {
    public static void main(String[] args) {
        testeAperelho(new Televisao());
        testeAperelho(new Computador());
    }

    private static void testeAperelho(AparelhoEletronico aparelhoEletronico) {
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}
