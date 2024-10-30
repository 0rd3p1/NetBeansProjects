/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.Optional;
import model.usuarioDAO;
import model.usuario;

/**
 *
 * @author Pedro
 */
public class usuarioController {
    
    private usuarioDAO usuarioDAO;
    
    public usuarioController(usuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }
    
    public void add(String nome, String username, String senha) {
        usuarioDAO.add(nome, username, senha);
    }
    
    public ArrayList<usuario> getAll() {
        return usuarioDAO.getAll();
    }
    
    public Optional<usuario> getById(int id) {
        return usuarioDAO.getById(id);
    }
    
    public ArrayList<usuario> getByName(String nome) {
        return usuarioDAO.getByName(nome);
    }
    
    public boolean delete(int id) {
        return usuarioDAO.delete(id);
    }
    
    public boolean update(int id, String nome, String username, String senha) {
        return usuarioDAO.update(id, nome, username, senha);
    }
    
}
