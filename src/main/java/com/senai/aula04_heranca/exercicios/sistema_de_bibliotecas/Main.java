package com.senai.aula04_heranca.exercicios.sistema_de_bibliotecas;

public class Main {
    public static void main(String[] args) {
        LivroFisico livroFisico1 = new LivroFisico("A paciente Silenciosa", "Não sei", 300);
        livroFisico1.mostrarLivro();

        LivroDigital livroDigital1 = new LivroDigital("Harry Potter e a Trufula Perdida", "Pedro", 800);
        livroDigital1.mostrarLivro();

    }
}
