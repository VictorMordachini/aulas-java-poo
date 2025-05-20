package com.senai.aula08_projeto_mqtt_mysql_websocket.controller;




import com.senai.aula08_projeto_mqtt_mysql_websocket.model.Usuario;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.dao.json.AdministradorDAO;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.dao.json.AlunoDAO;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.dao.json.ProfessorDAO;

import java.util.Optional;

public class LoginController {
    private final AlunoDAO alunoDAO = new AlunoDAO();
    private final ProfessorDAO professorDAO = new ProfessorDAO();
    private final AdministradorDAO administradorDAO = new AdministradorDAO();

    public Optional<Usuario> autenticar(String login, String senha) {
        Optional<? extends Usuario> admin = administradorDAO.buscarPorLogin(login);
        if (admin.isPresent() && admin.get().getSenha().equals(senha)) return Optional.of(admin.get());

        Optional<? extends Usuario> prof = professorDAO.buscarPorLogin(login);
        if (prof.isPresent() && prof.get().getSenha().equals(senha)) return Optional.of(prof.get());

        Optional<? extends Usuario> aluno = alunoDAO.buscarPorLogin(login);
        if (aluno.isPresent() && aluno.get().getSenha().equals(senha)) return Optional.of(aluno.get());

        return Optional.empty();
    }
}
