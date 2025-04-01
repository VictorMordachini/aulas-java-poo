package com.senai.aula06_abstracao.exemplos.veiculo;

abstract class Veiculo {
    protected int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }

    void acelerar(int incremento){
        velocidade+=incremento;
        System.out.println("Acelerando para "+ velocidade + " km/h.");
    }

    abstract void ligar();


}
