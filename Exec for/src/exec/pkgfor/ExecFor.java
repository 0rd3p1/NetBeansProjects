/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exec.pkgfor;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ExecFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ran = new Random();
        int num1;
        int result =  ran.nextInt(10);
        for (int i = 0; i < 4; i++){
            System.out.print("Chute um numero: ");
            num1 = teclado.nextInt();
            if (result == num1) {
                System.out.println("Voce acertou!");
                break;
            } 
        }
        System.out.println("Nao foi dessa vez");
        System.out.println("O numero era: " + result);
    }
    
}
