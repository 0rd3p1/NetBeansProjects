/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.Optional;
import model.usuarioSQL;
import model.usuario;

/**
 *
 * @author Pedro
 */
public class usuarioController {
    
    private usuarioSQL usuarioSQL;
    
    public usuarioController(usuarioSQL usuarioSQL) {
        this.usuarioSQL = usuarioSQL;
    }
    
    public void add(String nome, String username, String senha) {
        usuarioSQL.add(nome, username, senha);
    }
    
    public ArrayList<usuario> getAll() {
        return usuarioSQL.getAll();
    }
    
    public Optional<usuario> getById(int id) {
        return usuarioSQL.getById(id);
    }
    
    public ArrayList<usuario> getByName(String nome) {
        return usuarioSQL.getByName(nome);
    }
    
    public boolean delete(int id) {
        return usuarioSQL.delete(id);
    }
    
    public boolean update(int id, String nome, String username, String senha) {
        return usuarioSQL.update(id, nome, username, senha);
    }
    
}
