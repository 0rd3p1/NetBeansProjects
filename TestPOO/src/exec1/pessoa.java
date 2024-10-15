/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec1;

/**
 *
 * @author Aluno
 */
public class pessoa {
    
    private String nome;
    private int idade;
    private double altura;

    public pessoa(String n, int i, double a) {
        this.nome = n;
        this.idade = i;
        this.altura = a;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double a) {
        this.altura = a;
    }
    
}
