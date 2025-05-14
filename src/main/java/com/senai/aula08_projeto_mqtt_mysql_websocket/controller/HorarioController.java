package com.senai.aula08_projeto_mqtt_mysql_websocket.controller;



import com.senai.aula08_projeto_mqtt_mysql_websocket.model.Horario;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.dao.mysql.HorarioDAO;

import java.time.LocalTime;
import java.util.List;

public class HorarioController {
    private final HorarioDAO horarioDAO = new HorarioDAO();

    public String cadastrarHorario(int idAluno, int idProfessor, LocalTime hora) {
        horarioDAO.inserir(new Horario(0, idAluno, idProfessor, hora));
        return "Horário cadastrado.";
    }

    public String atualizarHorario(int id, int idAluno, int idProfessor, LocalTime hora) {
        horarioDAO.atualizar(new Horario(id, idAluno, idProfessor, hora));
        return "Horário atualizado.";
    }

    public String removerHorario(int id) {
        horarioDAO.remover(id);
        return "Horário removido.";
    }

    public List<Horario> listarHorarios() {
        return horarioDAO.listarTodos();
    }
}

