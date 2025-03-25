package com.senai.aula05_polimorfismo.exemplos.animal;

public class Cachorro extends Animal{
    // Sobrescrita de métodos
    @Override
    void fazersom() {
        System.out.println("O cachorro late: Au, au!");
    }
}
