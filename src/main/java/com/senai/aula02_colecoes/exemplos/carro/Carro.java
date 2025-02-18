package com.senai.aula02_colecoes.exemplos.carro;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int ano;
    double valorInicial;

    public Carro(String fabricante, String modelo, String cor, int ano, double valor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valorInicial = valor;
    }

    public void testDrive() {
        System.out.println("Vrummmm! " + modelo + " ligado");
    }

    public void comprar(String nomeCliente) {
        System.out.println("Parabéns " + nomeCliente + " você comprou o " + modelo);
    }

    //calcular valor atual do carro com uma desvalorização de 2% ao ano
    public void desvalorizacao() {
        int tempo = 2025 - ano;
        double valorAtual = valorInicial;

        for (int i = 0; i < tempo; i++) {
            valorAtual -= (valorAtual * 0.02);
        }


        System.out.println("O valor do " + modelo + " com a desvalorização é de R$" + String.format("%,3.2f", valorAtual)); //string.format "%.2f" para somente 2 casas decimais
    }

    @Override
    public String toString() {
        return "Carro{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", valor= R$" + valorInicial +
                '}';
    }
}
