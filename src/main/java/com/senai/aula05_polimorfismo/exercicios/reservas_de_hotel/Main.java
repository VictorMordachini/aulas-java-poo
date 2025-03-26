package com.senai.aula05_polimorfismo.exercicios.reservas_de_hotel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Reserva> reservas = new ArrayList<>();
        reservas.add(new ReservaSimples("Pedro", 8, 14,599));
        reservas.add(new ReservaVip("Samuel", 5, 54,1200, 599));

        reservas.forEach(Reserva::exibirReserva);
    }
}
