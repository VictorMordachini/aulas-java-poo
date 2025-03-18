package com.senai.aula04_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class PedidoPresencial extends Pedido{
    private double desconto;

    public PedidoPresencial(int numPedido, double valorTotal, double desconto) {
        super(numPedido, valorTotal);
        this.desconto = desconto/100;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto/100;
    }

    @Override
    public void exibirPedido() {
        System.out.printf("Pedido Presencial\n\tNúmero do pedido: %d, Valor total do pedido: %,.2f, Desconto para pagamento á vista: %.2f", numPedido, valorTotal, desconto);
    }
}
