/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosEspeciais;

/**
 *
 * @author Aluno
 */
public class classCaneta {
    
    public String modelo;
    private String cor;
    private double ponta;
    private double carga;
    private boolean esta_tampada;
    
    public classCaneta(String m, String co, double p, double ca) {
        this.modelo = m;
        this.cor = co;
        this.ponta = p;
        this.carga = ca;
        this.tampar();
    }
    
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Esta tampada? " + this.esta_tampada);
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String c) {
        this.cor = c;
    }
    
    public double getPonta() {
        return this.ponta;
    }
    
    public void setPonta(double p) {
        this.ponta = p;
    }
    
    public double getCarga() {
        return this.carga;
    }
    
    public void setCarga(double ca) {
        this.carga = ca;
    }
    
    public void tampar() {
        this.esta_tampada = true;
    }
    
    public void destampar() {
        this.esta_tampada = false;
    }
    
}
