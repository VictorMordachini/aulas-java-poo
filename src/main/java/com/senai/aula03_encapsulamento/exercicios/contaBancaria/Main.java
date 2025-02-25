package com.senai.aula03_encapsulamento.exercicios.contaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();

        contaBancaria1.setSaldo(2000);
        contaBancaria1.setNomeTitular("Victor");
        System.out.println("O nome do titular da conta bancária é: "+contaBancaria1.getNomeTitular()+"\nO saldo da conta é: "+contaBancaria1.getSaldo());


        contaBancaria1.setSaldo(-1);
        contaBancaria1.sacar(1500);

        contaBancaria1.sacar(3000);

        contaBancaria1.depositar(-1);
        contaBancaria1.depositar(3000);

    }
}
