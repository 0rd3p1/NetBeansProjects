/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class Exec2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declarando o ArrayList
        ArrayList<Integer> n = new ArrayList<>();

        // Declarando o valor do ArrayList
        Collections.addAll(n, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Removendo valores pares
        n.removeIf(x -> x % 2 == 0);
        
        // Printando o resultado
        System.out.println("Lista sem numeros pares -> " + n);
    }
}