/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec5;

/**
 *
 * @author Aluno
 */
public abstract class funcionario {
    
    private String nome;
    private double salario;
    private double bonus;
    
    public funcionario(String n, double s, double b) {
        this.nome = n;
        this.salario = s;
        this.bonus = b;
    }
    
    public abstract double bonus();

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double s) {
        this.salario = s;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
