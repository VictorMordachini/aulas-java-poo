package com.senai.aula06_abstracao.exemplos.classe_abstrata.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testarContas(new ContaCorrente("Pedro", 440));
        testarContas(new ContaPoupanca("Rafael", 12000));
    }
    public static void testarContas(ContaBancaria contaBancaria){
        contaBancaria.exibirSaldo();
        contaBancaria.aplicarTaxaMensal();
        contaBancaria.exibirSaldo();
    }

}
