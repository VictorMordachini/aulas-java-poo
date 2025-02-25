package com.senai.aula03_encapsulamento.exercicios.gerenciamentoDeFuncionarios;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario() {
        nome = "Funcionario";
        salario = 1320.00;
        cargo = "Pendente";
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido!");
        } else this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCargo(int cargo){
        switch (cargo){
            case 1:
                this.cargo = "Gerente";
                break;
            case 2:
                this.cargo = "Analista";
                break;
            case 3:
                this.cargo = "Programador";
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public String getCargo(){
        return cargo;
    }

    public void setSalario(double salario) {
        if (salario > 1320.00){
            this.salario = salario;
        } else System.out.println("Valor abaixo do salário minímo!");
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome do funcionário: " + nome +
                "Salário: " + salario +
                "Cargo: " + cargo;
    }
}
