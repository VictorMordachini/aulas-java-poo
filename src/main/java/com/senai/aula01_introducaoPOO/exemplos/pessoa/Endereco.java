package com.senai.aula01_introducaoPOO.exemplos.pessoa;

//criando objeto endereço para preencher objeto pessoa
public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String estado;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "rua " + rua + ", " + numero + ", " + bairro + ", " + cidade + " - " + estado;
    }
}
