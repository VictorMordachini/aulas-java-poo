package com.senai.aula05_polimorfismo.exemplos.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal meuAnimal1 = new Cachorro(); // Objeto da classe Cachorro
        Animal meuAnimal2 = new Gato(); // Objeto da classe Gato

        animal.fazersom();
        meuAnimal1.fazersom(); // Chama o método sobrescrito da classe Cachorro
        meuAnimal2.fazersom(); // Chama o método sobrescrito da classe Gato
    }
}
