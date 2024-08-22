/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execsmetodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExecMetodo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        
        if (parImpar(num) == true) {
            System.out.println("Este numero e par!");
        } else {
            System.out.println("Este numero e impar!");
        }
        
        /*boolean resultado = parImpar(num);
        System.out.println("O numero é par? " + resultado);*/
    }
    
    public static boolean parImpar(int num) {
        return num % 2 == 0;
    }
}
