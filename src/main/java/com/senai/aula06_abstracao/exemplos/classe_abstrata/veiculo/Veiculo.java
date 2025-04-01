package com.senai.aula06_abstracao.exemplos.classe_abstrata.veiculo;

abstract class Veiculo {
    private int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }

    void acelerar(int incremento){
        velocidade+=incremento;
        System.out.println("Acelerando para "+ velocidade + " km/h.");
    }

    abstract void ligar();


}
