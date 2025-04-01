package com.senai.aula06_abstracao.exemplos.exemplo_interface.aparelho_eletronico;

public class Televisao implements AparelhoEletronico {
    @Override
    public void ligar() {
        System.out.println("Televisão ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Televisão desligada!");
    }
}
