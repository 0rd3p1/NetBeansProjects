/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class carro extends veiculo {
    
    private int portas;
    
    protected carro(String ma, String mo, int a, int p) {
        super(ma, mo, a);
        this.portas = p;
    }

    public int getNumPortas() {
        return portas;
    }

    public void setNumPortas(int p) {
        this.portas = p;
    }
    
    public void apresentar() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Portas: " + this.portas);
    }
    
}
