/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaExecs;

/**
 *
 * @author Aluno
 */
public class Exec2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] n = new int[21];
        int s = 0;
        
        for (int i = 1; i <= 20; i++) {
            n[i] = i;
            if (n[i] % 2 == 0) {
                s += n[i];
            }
        }
        System.out.println("A soma dos numeros pares de 1 a 20 e: " + s);
    }
    
}
