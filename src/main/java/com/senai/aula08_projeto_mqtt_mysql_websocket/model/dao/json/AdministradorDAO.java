package com.senai.aula08_projeto_mqtt_mysql_websocket.model.dao.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.senai.aula08_projeto_mqtt_mysql_websocket.model.Administrador;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AdministradorDAO {
    private final String caminho = "administradores.json";
    private final Gson gson = new Gson();
    private final List<Administrador> administradores;

    public AdministradorDAO(){
        administradores = carregar();
    }

    private List<Administrador> carregar() {
        try (FileReader reader = new FileReader(caminho)) {
            Type listType = new TypeToken<List<Administrador>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public Optional<Administrador> buscarPorLogin(String login) {
        return administradores.stream().filter(a -> a.getLogin().equals(login)).findFirst();
    }

    public List<Administrador> listarTodos() {
        return administradores;
    }

    public void inserir(Administrador adm) {
        int novoId = administradores.stream().mapToInt(Administrador::getId).max().orElse(0) + 1;
        adm.setId(novoId);
        administradores.add(adm);
        salvar(administradores);
    }

    private void salvar(List<Administrador> lista) {
        try (FileWriter writer = new FileWriter(caminho)) {
            gson.toJson(lista, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

