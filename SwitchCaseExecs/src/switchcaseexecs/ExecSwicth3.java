/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcaseexecs;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class ExecSwicth3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        int est;
        
        
        est = ran.nextInt(11);
        
        switch (est) {
            case 0 -> System.out.println("Inverno");
            case 1 -> System.out.println("Inverno");
            case 2 -> System.out.println("Inverno");
            case 3 -> System.out.println("Primavera");
            case 4 -> System.out.println("Primavera");
            case 5 -> System.out.println("Primavera");
            case 6 -> System.out.println("Verao");
            case 7 -> System.out.println("Verao");
            case 8 -> System.out.println("Verao");
            case 9 -> System.out.println("Outono");
            case 10 -> System.out.println("Outono");
            case 11 -> System.out.println("Outono");
        }
    }
    
}
