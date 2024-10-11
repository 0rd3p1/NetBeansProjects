/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whiles;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class execW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n = 0;
        int s = 0;
        
        
        do {
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();
            if (n != 1111) {
                s += n;
            }
        } while (n != 1111);
        System.out.println("A soma de todos os valores e: " + s);
    }
    
}
