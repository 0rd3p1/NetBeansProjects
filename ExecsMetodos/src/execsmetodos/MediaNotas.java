/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execsmetodos;

/**
 *
 * @author Aluno
 */
public class MediaNotas {
    private double[] notas;
    
    // Construtor
    public MediaNotas(double[]notas) {
        this.notas = notas;
    }
    
    public double calcularMedia() {
        double soma = 0;
        
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
