package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

public class PDF extends Relatorio {
    private int numPaginas;

    public PDF(double tamanhoDocumento, String nomeDocumento, int numPaginas) {
        super(tamanhoDocumento, nomeDocumento);
        this.numPaginas = numPaginas;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório PDF gerado com sucesso!"+
                "\nNome do arquivo: "+getNomeDocumento()+
                "\nTamanho do arquivo: "+getTamanhoDocumento()+"KB"+
                "\nNúmero de páginas: "+numPaginas+"\n");
    }
}
