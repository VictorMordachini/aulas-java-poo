package com.senai.aula02_colecoes.exercicios.gerenciadorDeTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String menu = """
                Selecione a opção desejada:
                1 - Adicionar nova tarefa
                2 - Listar tarefas
                3 - marcar tarefa como concluída
                4 - Remover uma tarefa
                5 - sair""";
        int opcao;


        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    concluirTarefa();
                    break;
                case 4:
                    removeTarefa();
                    break;
                case 5:
                    System.out.println("Good Bye");
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }

        }
        while (opcao != 5);

    }

    public static void listarTarefas() {
        listaDeTarefas.forEach(System.out::println);
    }

    public static void adicionarTarefa() {
        System.out.println("Quantas tarefas deseja adicionar?");
        int qtdTarefas = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < qtdTarefas; i++) {
            System.out.println("\n Tarefa " + (i + 1) + "\n");
            System.out.print("Digite a tarefa: ");
            String tarefa = scanner.nextLine();
            listaDeTarefas.add(new Tarefa(tarefa, listaDeTarefas.size() + 1));
        }
        listarTarefas();

    }

    public static void removeTarefa() {
        listarTarefas();
        System.out.println("Qual tarefa deseja remover (número): ");
        int id = scanner.nextInt();
        scanner.nextLine();
        listaDeTarefas.remove(id - 1);

    }

    public static void concluirTarefa() {
        listarTarefas();
        System.out.println("Escolha uma tarefa para marcar como concluída (número): ");
        int id = scanner.nextInt();
        scanner.nextLine();
        listaDeTarefas.get(id - 1).tarefaConcluida();


    }
}
