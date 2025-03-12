package com.senai.aula04_heranca.exemplos.sistema_de_cadastro_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Pedro", 1500);
        Gerente gerente1 = new Gerente("Victor", 8000, 3000);

        funcionario1.exibirDados();
        gerente1.exibirDados();

    }
}
