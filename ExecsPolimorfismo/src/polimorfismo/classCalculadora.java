/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class classCalculadora extends classOperacoes {
    
    Scanner sc = new Scanner(System.in);
    
    int n1 = 0;
    int n2 = 0;

    @Override
    void soma() {
        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("A soma destes numeros e: " + (n1 + n2));
    }

    @Override
    void sub() {
        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("A subtracao destes numeros e: " + (n1 - n2));
    }

    @Override
    void mult() {
        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("A multiplicacao destes numeros e: " + (n1 * n2));
    }

    @Override
    void div() {
        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("A divisao destes numeros e: " + (n1 / n2));
    }
    
}
