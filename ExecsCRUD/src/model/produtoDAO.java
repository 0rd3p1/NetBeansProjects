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
public class produtoDAO {
    
    private static final ArrayList<produto> produto = new ArrayList<>();
    private static int ultId = 1;
    
    public void add(String n, float v) {
        produto p = new produto(ultId++, n, v);
        produto.add(p);
    }
    
    public ArrayList<produto> getAll() {
        return produto;
    }
    
    public Optional<produto> getById(int id) {
        return produto.stream().filter(p -> p.getId() == id).findFirst();
    }
    
    public ArrayList<produto> getByName(String n) {
        ArrayList<produto> res = new ArrayList<>();
        for (produto p : produto) {
            if (p.getN().equalsIgnoreCase(n)) {
                res.add(p);
            }
        }
        return res;
    }
    
    public boolean update(int id, String n, float v) {
        Optional<produto> item = getById(id);

        if (item.isPresent()) {
            produto p = item.get();
            p.setN(n);
            p.setV(v);
            return true;
        }
        return false;
    }
    
    public boolean delete(int id) {
        return produto.removeIf(p -> p.getId() == id);
    }
    
    public ArrayList<produto> getByMin(float v1) {
        ArrayList<produto> res = new ArrayList<>();
        for (produto p : produto) {
            if (p.getV() >= v1) {
                res.add(p);
            }
        }
        return res;
    }
    
    public ArrayList<produto> getByMax(float v1) {
        ArrayList<produto> res = new ArrayList<>();
        for (produto p : produto) {
            if (p.getV() <= v1) {
                res.add(p);
            }
        }
        return res;
    }
    
    public ArrayList<produto> getByBet(float v1, float v2) {
        ArrayList<produto> res = new ArrayList<>();
        for (produto p : produto) {
            if (v1 < p.getV() && p.getV() < v2) {
                res.add(p);
            }
        }
        return res;
    }
    
    /*
    public ArrayList<produto> getByVal() {
        ArrayList<produto> res = new ArrayList<>();
        
    }
    */
    
}
