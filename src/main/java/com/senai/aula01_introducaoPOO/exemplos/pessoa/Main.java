package com.senai.aula01_introducaoPOO.exemplos.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Victor", 19);

        System.out.println(pessoa1.nome + ", " + pessoa1.idade + ", " + pessoa1.altura + ", " +
                pessoa1.endereco);
    }
}
