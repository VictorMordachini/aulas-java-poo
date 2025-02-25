package com.senai.aula03_encapsulamento.exemplos.carro;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.setVelocidade(100); //definindo velocidade para 100
        System.out.println("Velocidade atual: "+ meuCarro.getVelocidade());

        meuCarro.setVelocidade(-20); //mostrará mensagem de velocidade inválida

        //descomentar código abaixo e mudar atributo velocidade para público

        /*meuCarro.velocidade = -20;
        System.out.println("Velocidade modificada diretamente: " + meuCarro.velocidade);*/
    }
}
