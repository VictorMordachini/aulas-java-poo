package com.senai.aula01_introducaoPOO.exercicios.gerenciamento_de_alunos;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int opcao;
        int x = 0;
        Aluno[] alunos = new Aluno[x];
        String menu = """
                _________________________________________________________
                |   Escolha uma opção:                                  |
                |       1- Exibir informações                           |
                |       2- Cadastrar alunos                             |
                |       3- Alterar nota de um aluno                     |
                |       3- Sair                                         |
                _________________________________________________________
                """;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    //iterando sobre a matriz para exibir informações e verificar aprovação
                    for (
                            int i = 0;
                            i < alunos.length; i++) {
                        alunos[i].exibirInformacoes();
                        if (alunos[i].verificarAprovacao()) {
                            System.out.println("Aluno aprovado!!!\n");
                        } else System.out.println("Aluno reprovado!\n");
                    }
                    break;
                case 2:
                    System.out.println("Quantos alunos você quer cadastrar?");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();

                    Aluno[] criandoAlunos = new Aluno[qtd];
                    String informacoes[] = {"Nome: ", "Idade: ", "Nota: "}; //cabeçalho com as informaçoes do aluno
                    String dados[] = new String[3]; //matriz para armazenar as informações recebidas

                    for (int j = 0; j < criandoAlunos.length; j++) {
                        System.out.println("Preencha as informações a seguir:");
                        for (int i = 0; i < informacoes.length; i++) { //iteração para preenchimento dos dados
                            System.out.print(informacoes[i]); //exibindo cabeçalho
                            dados[i] = scanner.nextLine(); //armazenando respostas
                        }
                        criandoAlunos[j] = new Aluno(dados[0], Integer.parseInt(dados[1]), Double.parseDouble(dados[2])); //criando cada aluno
                    }
                    alunos = criandoAlunos;

                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Tchau");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);


    }
}
