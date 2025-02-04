package com.senai.aula01_introducaoPOO.exemplos.concessionaria;

import javax.swing.plaf.PanelUI;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int ano;
    double valor;

    public Carro(String fabricante, String modelo, String cor, int ano, double valor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }

    public void testDrive() {
        System.out.println("Vrummmm! " + modelo + " ligado");
    }

    public void comprar(String nomeCliente) {
        System.out.println("Parabéns " + nomeCliente + " você comprou o " + modelo);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", valor= R$" + valor +
                '}';
    }
}
