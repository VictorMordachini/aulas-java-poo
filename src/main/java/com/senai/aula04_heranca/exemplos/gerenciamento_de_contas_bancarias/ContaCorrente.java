package com.senai.aula04_heranca.exemplos.gerenciamento_de_contas_bancarias;

public class ContaCorrente extends ContaBancaria{
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limite)){
            saldo -= valor;
            mensagemDeSucesso("Saque",this);
            return true;
        }else System.out.println("Saldo e limite insuficientes");
        return false;
    }
}
