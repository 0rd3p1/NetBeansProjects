/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.Optional;
import model.produto;
import model.produtoSQL;

/**
 *
 * @author Pedro
 */
public class produtoController {
    
    //private produtoDAO produtoDAO;   // trocar o SQL por DAO + import model.prdotuoDAO
    private produtoSQL produtoSQL;    // trocar o DAO por SQL + import model.produtoSQL
    
    public produtoController(produtoSQL produtoSQL) {
        this.produtoSQL = produtoSQL;
    }
    
    public void add(String n, float v) {
        this.produtoSQL.add(n, v);
    }
    
    public ArrayList<produto> getAll() {
        return this.produtoSQL.getAll();
    }
    
    public Optional<produto> getById(int id) {
        return this.produtoSQL.getById(id);
    }
    
    public Optional<produto> getByName(String n) {
        return this.produtoSQL.getByName(n);
    }
    
    public boolean update(int id, String n, float v) {
        return this.produtoSQL.update(id, n, v);
    }
    
    public boolean delete(int id) {
        return this.produtoSQL.delete(id);
    }
    
    public ArrayList<produto> getByMin(float v1) {
        return this.produtoSQL.getByMin(v1);
    }
    
    public ArrayList<produto> getByMax(float v1) {
        return this.produtoSQL.getByMax(v1);
    }
    
    public ArrayList<produto> getByBet(float v1, float v2) {
        return this.produtoSQL.getByBet(v1, v2);
    }
    
}
