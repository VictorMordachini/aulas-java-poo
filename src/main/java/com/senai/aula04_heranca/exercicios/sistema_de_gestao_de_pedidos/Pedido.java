package com.senai.aula04_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class Pedido {
    protected int numPedido;
    protected double valorTotal;

    public Pedido(int numPedido, double valorTotal) {
        this.numPedido = numPedido;
        this.valorTotal = valorTotal;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void exibirPedido(){
        System.out.printf("Número do pedido: %d, Valor total do pedido: %,.2f", numPedido, valorTotal );
    }
}
