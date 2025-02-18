package com.senai.aula02_colecoes.exercicios.gerenciadorDeTarefas;

public class Tarefa {
    String tarefa;
    Boolean conclusao = false;

    public Tarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public void tarefaConcluida() {
        conclusao = true;
    }

    @Override
    public String toString() {
        if (conclusao) {
            return "\n" + " - " + tarefa + " [Concluído]";
        } else return "\n" + " - " + tarefa + " [Pendente]";
    }
}

