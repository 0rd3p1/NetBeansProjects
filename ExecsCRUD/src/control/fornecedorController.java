/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.Optional;
import model.fornecedor;
//import model.fornecedorDAO;
import model.fornecedorSQL;

/**
 *
 * @author Pedro
 */
public class fornecedorController {
    
    //private fornecedorDAO fornecedorDAO;   // trocar o SQL por DAO
    private fornecedorSQL fornecedorSQL;   // trocar o DAO por SQL
    
    public fornecedorController(fornecedorSQL fornecedorSQL) {
        this.fornecedorSQL = fornecedorSQL;
    }
    
    public void add(String rS, String nF, int cnpj) {
        this.fornecedorSQL.add(rS, nF, cnpj);
    }
    
    public ArrayList<fornecedor> getAll() {
        return this.fornecedorSQL.getAll();
    }
    
    public Optional<fornecedor> getById(int id) {
        return this.fornecedorSQL.getById(id);
    }
    
    public Optional<fornecedor> getByRs(String rS) {
        return this.fornecedorSQL.getByRs(rS);
    }
    
    public Optional<fornecedor> getByCnpj(int cnpj) {
        return this.fornecedorSQL.getByCnpj(cnpj);
    }
    
    public boolean update(int id, String rS, String nF, int cnpj) {
        return this.fornecedorSQL.update(id, rS, nF, cnpj);
    }
    
    public boolean delete(int id) {
        return this.fornecedorSQL.delete(id);
    }
    
}
