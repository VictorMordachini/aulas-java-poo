package com.senai.aula02_colecoes.exercicios.gerenciadorDeTarefas;

public class Tarefa {
    String tarefa;
    Boolean conclusao = false;
    int id;

    public Tarefa(String tarefa, int id) {
        this.tarefa = tarefa;
        this.id = id;
    }

    public void tarefaConcluida() {
        conclusao = true;
    }

    @Override
    public String toString() {
        if (conclusao) {
            return id + tarefa + "[Concluído]";
        } else return id + tarefa + "[Pendente]";
    }
}

