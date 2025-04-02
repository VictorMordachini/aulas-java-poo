package com.senai.aula06_abstracao.exemplos.exemplo_interface.controlador_de_equipamentos_inteligentes;

public class TvSmart implements AparelhoInteligente {
    private int volume;

    public TvSmart() {
        this.volume = 0;
    }

    @Override
    public void ligar() {
        System.out.println("TV ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("TV desligada!");

    }

    public void aumentarVolume() {
        System.out.println("Volume " + (volume = ajustarNivel(volume, 1)));
    }

    public void baixarVolume() {
        System.out.println("Volume " + (volume = ajustarNivel(volume, -1)));
    }
}
