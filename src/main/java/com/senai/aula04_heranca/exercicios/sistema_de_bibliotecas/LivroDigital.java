package com.senai.aula04_heranca.exercicios.sistema_de_bibliotecas;

public class LivroDigital extends Livro {
    private double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        super(titulo, autor);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void mostrarLivro() {
        System.out.println("Tipo: Digital \n" + "Título do Livro: " + titulo + "\nAutor do livro: " + autor + "\nTamanho do arquivo: " + tamanhoArquivo + "MB");
    }
}
