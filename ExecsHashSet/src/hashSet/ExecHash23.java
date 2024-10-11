package hashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class ExecHash23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<>();
        Collections.addAll(num1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        Set <Integer> num2 = new HashSet<>();
        Collections.addAll(num2, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        
        if (num1.retainAll(num2)) {
            System.out.println("Os pontos de interseccao sao os seguintes: " + num1);
        }
    }
}