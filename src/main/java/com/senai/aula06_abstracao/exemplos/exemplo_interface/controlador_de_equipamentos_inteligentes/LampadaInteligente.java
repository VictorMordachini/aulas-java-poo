package com.senai.aula06_abstracao.exemplos.exemplo_interface.controlador_de_equipamentos_inteligentes;

public class LampadaInteligente implements AparelhoInteligente {
    private int brilho;

    public LampadaInteligente() {
        this.brilho = 0;
    }

    @Override
    public void ligar() {
        System.out.println("Lâmpada ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada desligada!");
    }

    public void aumentarBrilho() {
        System.out.println("Brilho " + (brilho = ajustarNivel(brilho, 1)));
    }

    public void baixarBrilho() {
        System.out.println("Brilho " + (brilho = ajustarNivel(brilho, -1)));
    }
}
