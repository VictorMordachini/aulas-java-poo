package com.senai.aula06_abstracao.exemplos.exemplo_interface.smartwatch;

public class SmartWatchAvancado implements SensorCardiaco, SensorPassos, SensorSono{
    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição cardíaca: 90 bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos hoje: 5000 passos");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Qualidade do sono: 6h00 sono profundo");
    }

    void exibirInfoDispositivos(){
        System.out.println("Dispositivos conectados: ...");
    }
}
