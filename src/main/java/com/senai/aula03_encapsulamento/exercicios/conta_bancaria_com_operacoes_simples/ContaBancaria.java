package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_com_operacoes_simples;

public class ContaBancaria {
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(){
        nomeTitular = null;
        saldo = 0;
    }

    public void depositar(double valor){
        if (valor >= 0){
            saldo += valor;
            System.out.println("Valor depositado com sucesso! Novo saldo: " + getSaldo());
        }else System.out.println("Valor inválido!");

    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Valor sacado com sucesso! Novo saldo: " + getSaldo());
        }else System.out.println("Saldo insuficiente!");
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setSaldo(double saldo) {
        if (saldo >=0){
            this.saldo = saldo;
        }else System.out.println("Valor inválido!");

    }

    public double getSaldo() {
        return saldo;
    }
}
