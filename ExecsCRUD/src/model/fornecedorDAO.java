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
public class fornecedorDAO {
    
    private static final ArrayList<fornecedor> fornecedor = new ArrayList<>();
    private static int ultId = 1;
    
    public void add(String rS, String nF, int cnpj) {
        fornecedor f = new fornecedor(ultId++, rS, nF, cnpj);
        fornecedor.add(f);
    }
    
    public ArrayList<fornecedor> getAll() {
        return fornecedor;
    }
    
    public Optional<fornecedor> getById(int id) {
        return fornecedor.stream().filter(f -> f.getId() == id).findFirst();
    }
    
    public ArrayList<fornecedor> getByRs(String rS) {
        ArrayList<fornecedor> res = new ArrayList<>();
        for (fornecedor f : fornecedor) {
            if (f.getRs().equalsIgnoreCase(rS)) {
                res.add(f);
            }
        }
        return res;
    }
    
    public Optional<fornecedor> getByCnpj(int cnpj) {
        return fornecedor.stream().filter(f -> f.getCnpj() == cnpj).findFirst();
    }
    
    public boolean update(int id, String rS, String nF, int cnpj) {
        Optional<fornecedor> item = getById(id);

        if (item.isPresent()) {
            fornecedor f = item.get();
            f.setRs(rS);
            f.setNf(nF);
            f.setCnpj(cnpj);
            return true;
        }
        return false;
    }
    
    public boolean delete(int id) {
        return fornecedor.removeIf(f -> f.getId() == id);
    }
    
}
