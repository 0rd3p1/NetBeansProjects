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
public class Exec3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarando o ArrayList
        ArrayList<Double> num = new ArrayList<>();
        
        // Definindo os valores
        Collections.addAll(num, 1.2, 2.1, 3.5, 4.9, 5.0);
        
        // Printando o terceiro numero
        System.out.println("O terceiro numero e: " + num.get(2));
    }
    
}
