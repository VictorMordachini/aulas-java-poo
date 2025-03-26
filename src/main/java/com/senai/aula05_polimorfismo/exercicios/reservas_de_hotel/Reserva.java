package com.senai.aula05_polimorfismo.exercicios.reservas_de_hotel;

public class Reserva {
    private String nomeCliente;
    private int numDiarias;
    private int numApto;
    private double valorDiaria;

    public Reserva(String nomeCliente, int numDiarias, int numApto, double valorDiaria) {
        this.nomeCliente = nomeCliente;
        this.numDiarias = numDiarias;
        this.numApto = numApto;
        this.valorDiaria = valorDiaria;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumDiarias() {
        return numDiarias;
    }

    public int getNumApto() {
        return numApto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double calcularCusto(){
        return 0.0;
    }

    public void exibirReserva(){
        System.out.printf("""
                Reserva base
                """);
    }


}
