package com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamentos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamento> listaPagamentos = new ArrayList<>();

        listaPagamentos.add(new CLT("Pedro", 3000));
        listaPagamentos.add(new PJ("Samuel", 300, 50));
        listaPagamentos.add(new Freelancer("Victor", 150000));

        listaPagamentos.forEach(pagamento -> System.out.printf(
                "%s recebe R$%,.2f\n", pagamento.getNome(), pagamento.calcularPagamento()
        ));
    }
}
