package com.senai.aula06_abstracao.exemplos.classe_abstrata.conta_bancaria;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo -= 20.0;
    }
}
