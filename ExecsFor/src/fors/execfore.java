/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fors;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class execfore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double val = 0;
        double men = 0;
        double mai = 0;
        for (double pro = 0; pro < 8; pro++) {
            System.out.print("Digite o valor do produto: ");
            val = teclado.nextDouble();
            if (men == 0) {
                men = val;
            } else if (men < val) {
                men = val;
            }
            if (mai == 0) {
                mai = val;
            } else if (mai > val) {
                mai = val;
            }
        }
        System.out.println("O maior valor foi: " + mai);
        System.out.println("O menor valor foi: " + men);
    }
}
