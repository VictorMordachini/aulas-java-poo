package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

public class JSON extends Relatorio{
    private int numChaves;

    public JSON(double tamanhoDocumento, String nomeDocumento, int numChaves) {
        super(tamanhoDocumento, nomeDocumento);
        this.numChaves = numChaves;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório JSON gerado com sucesso!"+
                "\n Tamanho do arquivo: "+getTamanhoDocumento()+"KB"+
                "\nNome do arquivo: "+getNomeDocumento()+
                "Número de chaves: "+numChaves);
    }
}
