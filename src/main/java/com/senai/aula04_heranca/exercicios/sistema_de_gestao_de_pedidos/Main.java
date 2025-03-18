package com.senai.aula04_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class Main {
    public static void main(String[] args) {

        Pedido pedido1 =  new Pedido(1, 2700);
        pedido1.exibirPedido();

        PedidoOnline pedidoOnline1 = new PedidoOnline(2, 2800, 24.90);
        pedidoOnline1.exibirPedido();

        PedidoPresencial pedidoPresencial1 = new PedidoPresencial(3, 3000, 5);
        pedidoPresencial1.exibirPedido();

    }
}
