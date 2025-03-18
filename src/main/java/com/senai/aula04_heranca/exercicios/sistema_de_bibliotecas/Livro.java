package com.senai.aula04_heranca.exercicios.sistema_de_bibliotecas;

public class Livro {
    protected String titulo;
    protected String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostrarLivro() {
        System.out.println("Tipo: \n" + "Título do Livro: " + titulo + "\nAutor do livro: " + autor);
    }
}
