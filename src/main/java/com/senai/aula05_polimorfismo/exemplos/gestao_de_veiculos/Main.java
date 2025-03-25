package com.senai.aula05_polimorfismo.exemplos.gestao_de_veiculos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      realizarManutencao(new Carro("Honda Civic"));
      realizarManutencao(new Moto("CB1000"));
      realizarManutencao(new Caminhao("Scania 113"));
    }
    private static void realizarManutencao(Veiculo veiculo){
        veiculo.realizarManutencao();
    }
}
