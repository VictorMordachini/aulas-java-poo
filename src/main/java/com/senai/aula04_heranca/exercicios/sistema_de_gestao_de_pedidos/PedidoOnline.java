package com.senai.aula04_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class PedidoOnline extends Pedido{
    private double taxaEntrega;

    public PedidoOnline(int numPedido, double valorTotal, double taxaEntrega) {
        super(numPedido, valorTotal);
        this.taxaEntrega = taxaEntrega;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public void exibirPedido() {
        System.out.printf("Pedido Online\n\tNúmero do pedido: %d, Valor total do pedido: %,.2f, Taxa de Entrega: %.2f", numPedido, valorTotal, taxaEntrega);
    }
}
