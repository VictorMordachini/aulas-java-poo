package com.senai.aula02_colecoes.exercicios.controle_de_estoque_de_produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public static void main(String[] args) {
        String menu = """
                \nSelecione a opção desejada:
                1 - Cadastrar novo produto
                2 - Listar produtos
                3 - Atualizar quantidade de um produto
                4 - Remover produto do estoque
                5 - Buscar produto pelo nome
                6 - Sair""";
        int opcao;


        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Good Bye");
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }

        }
        while (opcao != 6);

    }

}

