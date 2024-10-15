/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec3;

/**
 *
 * @author Aluno
 */
public class carro extends veiculo {
    
    private int portas;
    
    public carro(String ma, String mo, int a, int p) {
        super(ma, mo, a);
        this.portas = p;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int p) {
        this.portas = p;
    }
    
}
