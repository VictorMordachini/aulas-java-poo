package com.senai.aula08_projeto_mqtt_mysql_websocket.model;

import java.time.LocalTime;

public class Aluno extends Usuario {
    private String idCartaoRfid;


    public Aluno(int id, String nome, String idCartaoRfid) {
        super(id, nome);
        this.idCartaoRfid = idCartaoRfid;
    }

    public String getIdCartaoRfid() {
        return idCartaoRfid;
    }

    public void setIdCartaoRfid(String idCartaoRfid) {
        this.idCartaoRfid = idCartaoRfid;
    }

    public boolean estaAtrasado(LocalTime horarioEntrada) {
        return LocalTime.now().isAfter(horarioEntrada.plusMinutes(5));
    }
}

