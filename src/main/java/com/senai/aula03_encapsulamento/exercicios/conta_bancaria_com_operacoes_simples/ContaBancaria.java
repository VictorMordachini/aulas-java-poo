package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_com_operacoes_simples;

public class ContaBancaria {
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        if (saldo > 0) {
            this.saldo = saldo;
        } else System.out.println("Saldo inválido! Valor atribuido será de R$0,00");
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor){
        if (valor > 0){
            saldo += valor;
            mensagemDeSucesso("Depositar", this);
            return true;
        }else {
            System.out.println("Valor inválido!");
            return false;
        }

    }

    public boolean sacar(double valor){
        if (valor <= saldo && valor > 0){
            saldo -= valor;
            mensagemDeSucesso("Sacar", this);
            return true;
        }else {
            System.out.println("Saldo insuficiente!");
        } return false;
    }

    public static void mensagemDeSucesso(String operacao, ContaBancaria minhaConta){
        System.out.println(operacao+" na conta do "+ minhaConta.nomeTitular+" realizado com sucesso:");
        System.out.println("saldo atual R$"+minhaConta.saldo);

    }


    public void transferir(double valor, ContaBancaria contaDestino){
        if (this.sacar(valor)){
            contaDestino.depositar(valor);
        }
    }

}
