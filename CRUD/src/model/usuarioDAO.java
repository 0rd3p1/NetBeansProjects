/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Pedro
 */
public class usuarioDAO {

    private static ArrayList<usuario> usuario = new ArrayList<>();
    private static int ultimoId = 1;

    public void add(String nome, String username, String senha) {
        usuario u = new usuario(ultimoId++, nome, username, senha);
        usuario.add(u);
    }

    public ArrayList<usuario> getAll() {
        return usuario;
    }

    public Optional<usuario> getById(int id) {
        return usuario.stream().filter(u -> u.getId() == id).findFirst();
    }

    public ArrayList<usuario> getByName(String nome) {
        ArrayList<usuario> res = new ArrayList<>();
        for (usuario u : usuario) {
            if (u.getNome().equalsIgnoreCase(nome)) {
                res.add(u);
            }
        }
        return res;
    }

    public boolean delete(int id) {
        return usuario.removeIf(u -> u.getId() == id);
    }

    public boolean update(int id, String nome, String username, String senha) {
        Optional<usuario> item = getById(id);

        if (item.isPresent()) {
            usuario user = item.get();
            user.setNome(nome);
            user.setUsername(username);
            user.setSenha(senha);
            return true;
        }
        return false;
    }

}
