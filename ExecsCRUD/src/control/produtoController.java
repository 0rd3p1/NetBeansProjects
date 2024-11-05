/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.Optional;
import model.produto;
import model.produtoDAO;

/**
 *
 * @author Pedro
 */
public class produtoController {
    
    private produtoDAO produtoDAO;
    
    public void add(String n, float v) {
        this.produtoDAO.add(n, v);
    }
    
    public ArrayList<produto> getAll() {
        return this.produtoDAO.getAll();
    }
    
    public Optional<produto> getById(int id) {
        return this.produtoDAO.getById(id);
    }
    
    public ArrayList<produto> getByName(String n) {
        return this.produtoDAO.getByName(n);
    }
    
    public boolean update(int id, String n, float v) {
        return this.produtoDAO.update(id, n, v);
    }
    
    public boolean delete(int id) {
        return this.produtoDAO.delete(id);
    }
    
    public ArrayList<produto> getByMin(float v1) {
        return this.produtoDAO.getByMin(v1);
    }
    
    public ArrayList<produto> getByMax(float v1) {
        return this.produtoDAO.getByMax(v1);
    }
    
    public ArrayList<produto> getByBet(float v1, float v2) {
        return this.produtoDAO.getByBet(v1, v2);
    }
    
}
