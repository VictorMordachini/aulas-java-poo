package com.senai.aula05_polimorfismo.exercicios.reservas_de_hotel;

public class ReservaSimples extends Reserva {
    public ReservaSimples(String nomeCliente, int numDiarias, int numApto, double valorDiaria) {
        super(nomeCliente, numDiarias, numApto, valorDiaria);
    }

    @Override
    public double calcularCusto() {
        return getValorDiaria()*getNumDiarias();
    }

    @Override
    public void exibirReserva() {
        System.out.printf("""
                
                Reserva Simples
                Nome do cliente: %s
                Número do apartamento: %d
                Número de diárias: %d
                Valor da diária: %.2f
                Custo total: R$%,.2f
               
                """, getNomeCliente(), getNumApto(), getNumDiarias(), getValorDiaria(), calcularCusto());
    }
}




