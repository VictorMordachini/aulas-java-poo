package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Relatorio> relatorios = new ArrayList<>();
        relatorios.add(new PDF(1000,"relatórioPDF",70));
        relatorios.add(new CSV(478, "RelatórioCSV"));
        relatorios.add(new JSON(1500, "RelatórioJSON", 15));

        relatorios.forEach(Relatorio::gerarRelatorio);
    }
}
