package com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamentos;

public class PJ extends Pagamento{
    private double horasTrabalhadas;
    private double valorPorHora;

    public PJ(String nome, double horasTrabalhadas, double valorPorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorPorHora;
    }
}
