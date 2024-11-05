/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pedro
 */
public class fornecedor {
    
    private int id;
    private String razaoSocial;
    private String nomeFantasia;
    private int cnpj;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRs() {
        return razaoSocial;
    }

    public void setRs(String rS) {
        this.razaoSocial = rS;
    }

    public String getNf() {
        return nomeFantasia;
    }

    public void setNf(String nF) {
        this.nomeFantasia = nF;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public fornecedor(int id, String rS, String nF, int cnpj) {
        this.id = id;
        this.razaoSocial = rS;
        this.nomeFantasia = nF;
        this.cnpj = cnpj;
    }
    
}
