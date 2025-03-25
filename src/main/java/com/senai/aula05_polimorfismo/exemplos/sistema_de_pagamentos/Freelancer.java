package com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamentos;

public class Freelancer extends Pagamento{
    private double valorProjeto;

    public Freelancer(String nome, double valorProjeto) {
        super(nome);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularPagamento() {
        return valorProjeto;
    }
}
