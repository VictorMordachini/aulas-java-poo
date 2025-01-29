package com.senai.aula01_introducaoPOO.exemplos.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(
                "Victor",
                20);
        pessoa1.endereco = new Endereco(
                "Leandro de Sevilha",
                369,
                "Parque Novo Lar",
                "São Paulo",
                "SP");
        pessoa1.altura = 1.66F;

        Pessoa pessoa2 = new Pessoa(
                "Laura",
                18,
                1.65F,
                new Endereco(
                        "Adalgiza Uchoa Santos Dumont",
                        32,
                        "Jardim Guapira",
                        "São Paulo",
                        "SP"));

        System.out.println(pessoa1);
        System.out.println(pessoa2);

        pessoa1.comer("Hamburguer");
        pessoa2.comer("Salada");

    }
}
