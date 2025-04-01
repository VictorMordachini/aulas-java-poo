package com.senai.aula06_abstracao.exemplos.exemplo_interface.veiculo;

public interface Veiculo {
    void acelerar();

    default void buzinar(){
        System.out.println("Buzinando: Beep beep!");
    }

}
