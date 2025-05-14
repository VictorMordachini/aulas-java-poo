package com.senai.aula08_projeto_mqtt_mysql_websocket.model;

public class Professor extends Usuario {
    private String disciplina;

    public Professor(int id, String nome, String disciplina) {
        super(id, nome);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
