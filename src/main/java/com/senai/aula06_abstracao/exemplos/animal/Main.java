package com.senai.aula06_abstracao.exemplos.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listaDeAnimal = new ArrayList<>();

        listaDeAnimal.add(new Cachorro("Hulk"));
        listaDeAnimal.add(new Gato("Garfield"));

        listaDeAnimal.forEach(animal -> {
            animal.dormir();
            animal.fazerSom();
        });

    }
}
