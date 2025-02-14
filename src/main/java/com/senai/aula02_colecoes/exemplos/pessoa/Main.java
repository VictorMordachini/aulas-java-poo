package com.senai.aula02_colecoes.exemplos.pessoa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Samuel", 18);
        Pessoa pessoa2 = new Pessoa("Pedro", 17);
        Pessoa pessoa3 = new Pessoa("Victor", 20);

        Pessoa[] matrizPessoas = new Pessoa[3];


        matrizPessoas[0] = pessoa1;
        matrizPessoas[1] = pessoa2;
        matrizPessoas[2] = pessoa3;

        for (Pessoa matrizPessoa : matrizPessoas) {
            System.out.println(matrizPessoa);
        }

        matrizPessoas[0].falar("Oi!!!");
        System.out.println(matrizPessoas[3].nome);

        ArrayList lista = new ArrayList(); //lista genérica

        lista.add(12);
        lista.add(true);
        lista.add("teste");
        lista.add(pessoa1);

        Pessoa pessoa = (Pessoa) lista.get(3); //pegando
        pessoa.falar("teste");

        ArrayList<Pessoa> listaPessoas = new ArrayList(); //lista de pessoas
        listaPessoas.add(pessoa2);
        listaPessoas.add(new Pessoa("Ketlyn", 16));

        System.out.println("Tamanho da lista: " + listaPessoas.size());

        listar(listaPessoas);
        listaPessoas.remove(pessoa2);
        listar(listaPessoas);

        listaPessoas.set(0, pessoa1);
        listar(listaPessoas);

        listaPessoas.add(0, pessoa3);
        listar(listaPessoas);
    }

    public static void listar(ArrayList<Pessoa> lista) {
        System.out.println("");
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa);
        }
    }
}
