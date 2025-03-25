package com.senai.aula05_polimorfismo.exemplos.gestao_de_veiculos;

public class Caminhao extends Veiculo {
    public Caminhao(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Verificação dos freios realizada para o caminhão " + getModelo());
    }
}
