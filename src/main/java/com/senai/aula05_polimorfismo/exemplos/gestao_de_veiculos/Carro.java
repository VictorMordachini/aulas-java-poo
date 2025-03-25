package com.senai.aula05_polimorfismo.exemplos.gestao_de_veiculos;

public class Carro extends Veiculo {
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção preventiva realizada para o carro " + getModelo());
    }
}
