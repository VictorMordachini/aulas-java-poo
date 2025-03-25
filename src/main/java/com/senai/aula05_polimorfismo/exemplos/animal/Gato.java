package com.senai.aula05_polimorfismo.exemplos.animal;

public class Gato extends Animal{
    // Sobrescrita de métodos
    @Override
    void fazersom() {
        System.out.println("O gato mia: Miau, miau!");
    }
}
