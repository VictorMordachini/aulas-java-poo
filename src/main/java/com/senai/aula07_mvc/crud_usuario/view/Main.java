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
                            7 - Sair       
                        """;

        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Qual tipo de usuário? ");
                    System.out.println("1 - Operador");
                    System.out.println("2 - Supervisor");
                    int escolaTipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Preencha os dados a seguir: ");

                    int id = scanner.nextInt();
                    scanner.nextLine();
                    String nome = scanner.nextLine();

                    if (escolaTipo == 1) {
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        opController.cadastrarOperador(operador);

                    } else if (escolaTipo == 2) {
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        supController.cadastrarSupervisor(supervisor);
                    }

                    break;

                case 2:
                    break;
                case 3:
                    break;

                case 4:
                    opController.listarOperadores().forEach(System.out::println);
                    supController.listarSupervisores().stream().forEach(System.out::println);
                    break;

                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Saindo do Sistema! <3<3<3<3<3<3<3<3<3<3<3<3");
                    scanner.close();
                    break;
                default:
            }


        } while (opcao != 7);


    }
}
