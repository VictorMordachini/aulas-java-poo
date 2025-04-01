package com.senai.aula06_abstracao.exemplos.exemplo_interface.aparelho_eletronico;

public class Computador implements AparelhoEletronico {

    @Override
    public void ligar() {
        System.out.println("Computador ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado!");
    }
}
