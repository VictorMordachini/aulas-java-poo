package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

public abstract class Relatorio {
    private double tamanhoDocumento;
    private String nomeDocumento;

    public Relatorio(double tamanhoDocumento, String nomeDocumento) {
        this.tamanhoDocumento = tamanhoDocumento;
        this.nomeDocumento = nomeDocumento;
    }

    public double getTamanhoDocumento() {
        return tamanhoDocumento;
    }

    public String getNomeDocumento() {
        return nomeDocumento;
    }

    public void gerarRelatorio(){
        System.out.println("Relatório gerado com sucesso!"+
                "\nNome do arquivo: "+nomeDocumento+
                "\nTamanho do arquivo: "+tamanhoDocumento+"KB");
    }
}



