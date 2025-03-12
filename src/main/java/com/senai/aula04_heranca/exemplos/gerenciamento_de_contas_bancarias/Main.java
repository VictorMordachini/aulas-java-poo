package com.senai.aula04_heranca.exemplos.gerenciamento_de_contas_bancarias;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente("Victor", 9000, 500);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("Victor", 4000, 4);

        System.out.println("\nExibindo saldo--------------------------------------");
        contaPoupanca1.exibirSaldo();
        contaCorrente1.exibirSaldo();

        System.out.println("\nTeste saque conta corrente--------------------------");
        contaCorrente1.sacar(10000);
        contaCorrente1.sacar(9400);

        System.out.println("\nTeste saque conta poupança--------------------------");
        contaPoupanca1.sacar(200);

        System.out.println("\nTeste rendimento conta poupança---------------------");
        contaPoupanca1.aplicarRendimento();
        contaPoupanca1.exibirSaldo();

    }
}
