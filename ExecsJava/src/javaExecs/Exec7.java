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
public class Exec7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 1;
        int soma = 0;
                
        while (num != 0) {
            System.out.print("Digite um numero (0 para sair): ");
            num = sc.nextInt();
            soma += num;
            //int som =+ num;
            //System.out.println(soma);
            //System.out.println(som);
        }
        System.out.println("A soma dos numeros digitados e igual a " + soma);
    }
    
}
