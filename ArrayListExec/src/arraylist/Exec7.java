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
public class Exec7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarando o ArrayList
        ArrayList<Integer> num = new ArrayList<>();
        
        // Definindo os valores da lista
        Collections.addAll(num, 1, 3, 2, 6, 7, 8, 4, 10, 5, 9);
        
        // Ordenando em ordem crescente a lista
        Collections.sort(num);
        
        // Printando o resultado
        System.out.println("Os valores ordenados ficam " + num);
    }
}