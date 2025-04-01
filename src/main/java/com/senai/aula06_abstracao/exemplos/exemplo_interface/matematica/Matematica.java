package com.senai.aula06_abstracao.exemplos.exemplo_interface.matematica;

public interface Matematica {
    double PI = 3.14; //automaticamente static final

    static int somar(int a, int b){
        return a+b;
    }

}
