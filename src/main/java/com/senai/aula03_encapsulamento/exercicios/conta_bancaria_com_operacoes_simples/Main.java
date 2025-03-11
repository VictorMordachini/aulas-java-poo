package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_com_operacoes_simples;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Victor", 80000);
        ContaBancaria contaBancaria2 = new ContaBancaria("Laura", 200);

        System.out.println("------------------------ Teste sacar ---------------------");
        contaBancaria1.sacar(-10);
        contaBancaria2.sacar(10);
        contaBancaria1.sacar(81000);

        System.out.println("------------------------ Teste depositar ---------------------");
        contaBancaria1.depositar(-200);
        contaBancaria2.depositar(200);

        System.out.println("------------------------ Teste transferir ---------------------");
        contaBancaria1.transferir(2000, contaBancaria2);
    }
}
