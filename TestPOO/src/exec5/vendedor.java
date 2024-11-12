/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec5;

/**
 *
 * @author Aluno
 */
public class vendedor extends funcionario {

    public vendedor(String n, double s, double b) {
        super(n, s, b);
    }

    @Override
    public double bonus() {
        this.setBonus(this.getSalario() / 0.05);
        return this.getBonus();
    }
    
}
