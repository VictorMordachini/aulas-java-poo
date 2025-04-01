package com.senai.aula06_abstracao.exemplos.classe_abstrata.animal;

abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    void dormir(){
        System.out.println(nome + " está dormindo.");
    }

    abstract void fazerSom();
}

