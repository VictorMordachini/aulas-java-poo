package com.senai.aula05_polimorfismo.exercicios.reservas_de_hotel;

public class ReservaVip extends Reserva{
    private double taxaVip;

    public ReservaVip(String nomeCliente, int numDiarias, int numApto, double valorDiaria, double taxaVip) {
        super(nomeCliente, numDiarias, numApto, valorDiaria);
        this.taxaVip = taxaVip;
    }

    @Override
    public double calcularCusto() {
        return (getValorDiaria()*getNumDiarias())+taxaVip;
    }

    @Override
    public void exibirReserva() {
        System.out.printf("""
                
                Reserva Vip
                Nome do cliente: %s
                Número do apartamento: %d
                Número de diárias: %d
                Valor da diária: %.2f
                Taxa reserva vip: %.2f
                Custo total: R$%,.2f
                
                """, getNomeCliente(), getNumApto(), getNumDiarias(), getValorDiaria(), taxaVip,calcularCusto());
    }
}
