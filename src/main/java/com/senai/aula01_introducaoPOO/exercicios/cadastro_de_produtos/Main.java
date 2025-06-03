package com.senai.aula01_introducaoPOO.exercicios.cadastro_de_produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Produto> produtos = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String opcao;
        String menuHorario = """
                --- MENU DE PRODUTOS ---
                
                    1. Cadastrar produto
                    2. Atualizar estoque
                    3. Exibir produtos
                    4. Calcular valor em estoque
                    0. Voltar
                
                """;
        do {
            System.out.print(menuHorario);
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> cadastrar();
                case "2" -> atualizar();
                case "3" -> exibir();
                case "4" -> calcular();
                case "0" -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("0"));
    }

    private static void cadastrar() {
        int id = produtos.stream().mapToInt(Produto::getId).max().orElse(0) + 1;
        String nome = scannerPrompt("Produto: ");
        double preco = scannerPromptDouble("Preço: ");
        int quantidade = scannerPromptInt("Quantidade: ");
        produtos.add(new Produto(id, nome, preco, quantidade));
    }

    private static void atualizar() {
        exibir();
        int id = scannerPromptInt("Qual o id do produto que deseja atualizar: ");
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                int quantidade = scannerPromptInt("Qual a quantidade: ");
                produto.atualizaEstoque(quantidade);
            } else System.out.println("Id inválido");
        }
    }

    private static void exibir() {
        produtos.forEach(Produto::exibirDetalhes);
    }

    private static void calcular() {
        exibir();
        int id = scannerPromptInt("Qual o id do produto que deseja calcular: ");
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.calcularValorEstoque();
            } else System.out.println("Id inválido");
        }
    }

    private static String scannerPrompt(String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }

    private static int scannerPromptInt(String msg) {
        System.out.print(msg);
        return Integer.parseInt(scanner.nextLine());
    }

    private static double scannerPromptDouble(String msg) {
        System.out.print(msg);
        return Double.parseDouble(scanner.nextLine());
    }


}

