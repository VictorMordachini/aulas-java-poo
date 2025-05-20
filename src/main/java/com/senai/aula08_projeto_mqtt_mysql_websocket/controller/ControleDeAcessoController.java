package com.senai.aula08_projeto_mqtt_mysql_websocket.controller;



import com.senai.aula08_projeto_mqtt_mysql_websocket.model.Aluno;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.Horario;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.Professor;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.dao.json.AlunoDAO;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.dao.json.HorarioDAO;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.dao.json.ProfessorDAO;
import com.senai.aula08_projeto_mqtt_mysql_websocket.websocket.WebSocketSender;

import java.util.Optional;

public class ControleDeAcessoController {
    private final AlunoDAO alunoDAO = new AlunoDAO();
    private final HorarioDAO horarioDAO = new HorarioDAO();
    private final ProfessorDAO professorDAO = new ProfessorDAO();

    public String processarEntrada(String rfid) {
        Optional<Aluno> alunoOpt = alunoDAO.buscarPorRfid(rfid);
        if (alunoOpt.isEmpty()) {
            return "[ACESSO NEGADO] Aluno não encontrado para RFID: " + rfid;
        }

        Aluno aluno = alunoOpt.get();
        Optional<Horario> horarioOpt = horarioDAO.buscarHorarioDoAluno(aluno.getId());

        if (horarioOpt.isEmpty()) {
            return "[ACESSO] Aluno: " + aluno.getNome() + " - Nenhum horário atribuído.";
        }

        Horario horario = horarioOpt.get();
        boolean atrasado = aluno.estaAtrasado(horario.getHoraInicio());

        if (atrasado) {
            Optional<Professor> professorOpt = professorDAO.buscarPorId(horario.getIdProfessor());
            professorOpt.ifPresent(professor -> {
                String msg = "[ATRASO] Aluno " + aluno.getNome() + " chegou atrasado.";
                WebSocketSender.enviarMensagem(msg);
            });
            return "[ATRASO DETECTADO] Aluno: " + aluno.getNome();
        }

        return "[ENTRADA AUTORIZADA] Aluno: " + aluno.getNome();
    }
}

