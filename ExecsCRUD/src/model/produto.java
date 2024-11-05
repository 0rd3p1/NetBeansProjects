/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pedro
 */
public class produto {
    
    private int id;
    private String nome;
    private float valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getN() {
        return nome;
    }

    public void setN(String n) {
        this.nome = n;
    }

    public float getV() {
        return valor;
    }

    public void setV(float v) {
        this.valor = v;
    }

    public produto(int id, String n, float v) {
        this.id = id;
        this.nome = n;
        this.valor = v;
    }
    
}
