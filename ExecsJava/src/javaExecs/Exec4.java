/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaExecs;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exec4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();
        System.out.print("Digite outro numero: ");
        num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println("O primeiro numero e maior que o segundo!");
        } else {
            System.out.println("O segundo numero e maior que o primeiro!");
        }
    }
    
}
