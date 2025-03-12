package com.senai.aula04_heranca.exemplos.gerenciamento_de_contas_bancarias;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            mensagemDeSucesso("Depositar", this);
            return true;
        } else {
            System.out.println("Valor inválido!");
            return false;
        }

    }

    public boolean sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            mensagemDeSucesso("Sacar", this);
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        return false;
    }

    public static void mensagemDeSucesso(String operacao, ContaBancaria minhaConta) {
        System.out.println(operacao + " na conta do " + minhaConta.titular + " realizado com sucesso:");
        System.out.println("saldo atual R$" + minhaConta.saldo);

    }

    public void exibirSaldo(){
            System.out.printf("\nTitular: %s, Saldo: R$%,.2f\n", titular , saldo);
    }

}


