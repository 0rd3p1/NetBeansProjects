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
    private boolean esta_tampada;
    
    public canetaConstrutor(String m, String c, double p) {
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    
    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Esta tampada? " + this.esta_tampada);
    }
    
    public String getModelo() {
        return this.modelo;
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
    
    public void tampar() {
        this.esta_tampada = true;
    }
    
    public void destampar() {
        this.esta_tampada = false;
    }
    
}
