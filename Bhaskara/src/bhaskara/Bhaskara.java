/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bhaskara;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Bhaskara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calcule Bhaskara a seguir");
        Scanner teclado = new Scanner(System.in);
        double a;
        double b;
        double c;
        double x1;
        double x2;
        System.out.println("Digite os valores ");
        System.out.print("Valor de A: ");
        a = teclado.nextDouble();
        System.out.print("Valor de B: ");
        b = teclado.nextDouble();
        System.out.print("Valor de C: ");
        c = teclado.nextDouble();
        x1 = (-b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
        x2 = (-b-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
        System.out.println("O resultado de X1= " + x1 + " e o resultado de X2= " + x2);
    }
}