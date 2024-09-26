/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class classPessoas {

    String nome;
    int idade;
    double altura;

    public classPessoas(String n, int i, double a) {
        this.nome = n;
        this.idade = i;
        this.altura = a;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setNome(double a) {
        this.altura = a;
    }    
    
}
