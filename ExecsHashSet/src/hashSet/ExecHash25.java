package hashSet;


import java.util.Collections;
import java.util.HashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ExecHash25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        Collections.addAll(num, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        Integer[] A = num.toArray(new Integer[0]);
        
        for (Integer i = 0; i < 10; i++) {
            System.out.println(A[i]);
        }
    }
    
}
