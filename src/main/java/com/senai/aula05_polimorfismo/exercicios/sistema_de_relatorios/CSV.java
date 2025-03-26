package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

public class CSV extends Relatorio {
    public CSV(double tamanhoDocumento, String nomeDocumento) {
        super(tamanhoDocumento, nomeDocumento);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório CSV gerado com sucesso!"+
                "\n Tamanho do arquivo: "+getTamanhoDocumento()+"KB"+
                "\nNome do arquivo: "+getNomeDocumento());
    }
}
