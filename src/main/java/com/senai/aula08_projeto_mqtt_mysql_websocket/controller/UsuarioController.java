package com.senai.aula08_projeto_mqtt_mysql_websocket.controller;



import com.senai.aula08_projeto_mqtt_mysql_websocket.model.Aluno;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.Professor;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.dao.mysql.AlunoDAO;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.dao.mysql.ProfessorDAO;

import java.util.List;

public class UsuarioController {
    private final AlunoDAO alunoDAO = new AlunoDAO();
    private final ProfessorDAO professorDAO = new ProfessorDAO();

    public String cadastrarUsuario(String tipo, String nome, String dadoExtra) {
        if (tipo.equals("1")) {
            alunoDAO.inserir(new Aluno(0, nome, dadoExtra));
            return "Aluno cadastrado com sucesso.";
        } else if (tipo.equals("2")) {
            professorDAO.inserir(new Professor(0, nome, dadoExtra));
            return "Professor cadastrado com sucesso.";
        } else {
            return "Tipo inválido.";
        }
    }

    public String atualizarUsuario(String tipo, int id, String nome, String dadoExtra) {
        if (tipo.equals("1")) {
            alunoDAO.atualizar(new Aluno(id, nome, dadoExtra));
            return "Aluno atualizado.";
        } else if (tipo.equals("2")) {
            professorDAO.atualizar(new Professor(id, nome, dadoExtra));
            return "Professor atualizado.";
        } else {
            return "Tipo inválido.";
        }
    }

    public String removerUsuario(String tipo, int id) {
        if (tipo.equals("1")) {
            alunoDAO.remover(id);
            return "Aluno removido.";
        } else if (tipo.equals("2")) {
            professorDAO.remover(id);
            return "Professor removido.";
        } else {
            return "Tipo inválido.";
        }
    }

    public List<Aluno> listarAlunos() {
        return alunoDAO.listarTodos();
    }

    public List<Professor> listarProfessores() {
        return professorDAO.listarTodos();
    }

    public String atribuirRfid(int id, String rfid) {
        return alunoDAO.buscarPorId(id).map(aluno -> {
            aluno.setIdCartaoRfid(rfid);
            alunoDAO.atualizar(aluno);
            return "RFID atribuído com sucesso.";
        }).orElse("Aluno não encontrado.");
    }
}

