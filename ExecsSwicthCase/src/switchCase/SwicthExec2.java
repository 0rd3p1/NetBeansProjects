/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchCase;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class SwicthExec2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        int nota;
        
        
        nota = ran.nextInt(9);
        
        switch (nota) {
            case 0 -> System.out.println("Sua nota e: F");
            case 1 -> System.out.println("Sua nota e: F");
            case 2 -> System.out.println("Sua nota e: D");
            case 3 -> System.out.println("Sua nota e: D");
            case 4,5 -> System.out.println("Sua nota e: C");
            case 6 -> System.out.println("Sua nota e: B");
            case 7 -> System.out.println("Sua nota e: B");
            case 8 -> System.out.println("Sua nota e: A");
            case 9 -> System.out.println("Sua nota e: A");
        }
    }
}
