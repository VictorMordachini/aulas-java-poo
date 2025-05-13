package com.senai.aula07_mvc.crud_usuario.view;

import com.senai.aula07_mvc.crud_usuario.controller.OperadorController;
import com.senai.aula07_mvc.crud_usuario.controller.SupervisorController;
import com.senai.aula07_mvc.crud_usuario.model.Operador;
import com.senai.aula07_mvc.crud_usuario.model.Supervisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController opController = new OperadorController();
        SupervisorController supController = new SupervisorController();

        String menu =
                """
                        Menu
                            1 - Cadastrar Usuario
                            2 - Deletar Usuario
                            3 - Atualizar Usuario
                            4 - Exibir Usuarios
                            5 - Ligar máquina
                            6 - Demitir Operador
                            7 - Sair""";

        int opcao = 0;
        int escolhaTipo = 0;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao != 7) {
                System.out.println("Qual tipo de usuário? ");
                System.out.println("1 - Operador");
                System.out.println("2 - Supervisor");
                escolhaTipo = scanner.nextInt();
                scanner.nextLine();
            }
            switch (opcao) {
                case 1:
                    System.out.println("Preencha os dados a seguir: ");
                    System.out.print("Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    if (escolhaTipo == 1) {
                        System.out.print("Setor:");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        if (opController.cadastrarOperador(operador)){
                            System.out.println("Cadastro efetuado com sucesso!");
                        }else System.out.println("Não foi possível cadastrar!");

                    } else if (escolhaTipo == 2) {
                        System.out.print("Área: ");
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        if (supController.cadastrarSupervisor(supervisor)){
                            System.out.println("Cadastro efetuado com sucesso!");
                        }else System.out.println("Não foi possível cadastrar!");
                    }
                    break;

                case 2:
                    if (escolhaTipo == 1){
                        opController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2){
                        supController.listarSupervisores().forEach(System.out::println);
                    }
                    System.out.println("Escolha um usuário para deletar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaTipo == 1){
                        if (opController.deletarOperador(id)){
                            System.out.println("Delete efetuado com sucesso!");
                        } else System.out.println("Não foi possível deletar");

                    } else if (escolhaTipo == 2){
                        if (supController.deletarSupervisor(id)){
                            System.out.println("Delete efetuado com sucesso!");
                        } else System.out.println("Não foi possível deletar");
                    }
                    break;

                case 3:
                    if (escolhaTipo == 1){
                        opController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2){
                        supController.listarSupervisores().forEach(System.out::println);
                    }

                    System.out.println("Escolha um usuário para validar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Atualize as seguintes informações: ");
                    System.out.print("Nome:");
                    nome = scanner.nextLine();

                    if (escolhaTipo == 1){
                        System.out.print("Setor:");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        opController.atualizarOperador(operador);
                    }
                        else if (escolhaTipo == 2) {
                        System.out.print("Área:");
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        supController.atualizarSupervisor(supervisor);
                    }
                    System.out.println("Usuário Atualizado com Sucesso!");
                    break;

                case 4:
                    if (escolhaTipo == 1){
                        opController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2){
                        supController.listarSupervisores().forEach(System.out::println);
                    }
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    System.out.println("Saindo do Sistema!");
                    scanner.close();
                    break;

                default:
            }


        } while (opcao != 7);


    }
}
