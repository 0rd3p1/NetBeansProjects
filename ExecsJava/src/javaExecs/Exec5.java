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
public class Exec5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Digite um numero (negativo, positivo ou zero): ");
        num = sc.nextInt();
        
        if (num == 0) {
            System.out.println("O seu numero e zero");
        } else if (num < 0) {
            System.out.println("O seu numero e negativo");
        } else {
            System.out.println("O seu numero e positivo");
        }
    }
    
}
