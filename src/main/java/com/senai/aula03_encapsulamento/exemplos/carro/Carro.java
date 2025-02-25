package com.senai.aula03_encapsulamento.exemplos.carro;

class Carro {

    private int velocidade; //atributo privado (mudar para publico para testar main

    public Carro() { //construtor
    velocidade = 0;
    }

    public int getVelocidade(){ //método público para obter velocidade (Getter)
        return velocidade;
    }

    public void setVelocidade(int velocidade) { //método público para definir a velocidade (Setter)
        if (velocidade >= 0){
            this.velocidade = velocidade;
        } else System.out.println("Velocidade inválida!");

    }
}
