package com.senai.aula02_colecoes.exercicios.gerenciadorDeTarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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

    public void listarTarefas() {

    }

    public void adicionarTarefa() {

    }

    public void removeTarefa() {

    }

    public void concluirTarefa() {

    }
}
