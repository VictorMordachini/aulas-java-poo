package com.senai.aula01_introducaoPOO.exemplos.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando objeto pessoa com construtor simples
        Pessoa pessoa1 = new Pessoa(
                "Victor",
                20);

        //necessário preencher lacunas separadamente
        pessoa1.endereco = new Endereco(
                "Leandro de Sevilha",
                369,
                "Parque Novo Lar",
                "São Paulo",
                "SP");
        pessoa1.altura = 1.66F;

        //criando objeto pessoa com construtor completo
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

        pessoa1.falar("lines.lines.lineslines");
        pessoa2.falar("????????");

        //Pedindo para o usuário preencher o objeto "pessoa":
        Scanner scanner = new Scanner(System.in);
        //cabeçalho (dados objeto Pessoa)
        String informacoes[] = {"Nome: ", "Idade: ", "Altura: ", "Endereço:\n\t Rua: ", "\tNúmero: ", "\tBairro: ", "\tCidade: ", "\tEstado: "};

        String dados[] = new String[8];

        System.out.println("Preencha as informações a seguir:");
        for (int i = 0; i < informacoes.length; i++) { //iteração para preenchimento dos dados
            System.out.print(informacoes[i]); //exibindo cabeçalho
            dados[i] = scanner.nextLine(); //armazenando respostas
        }

        Pessoa pessoa3 = new Pessoa(
                dados[0], //nome
                Integer.parseInt(dados[1]), //idade
                Float.parseFloat(dados[2]), //altura
                new Endereco( //Endereço é outro objeto
                        dados[3], //rua
                        Integer.parseInt(dados[4]), //numero
                        dados[5], //bairro
                        dados[6], //cidade
                        dados[7] //estado
                )
        );

        System.out.println(pessoa3);
    }
}
