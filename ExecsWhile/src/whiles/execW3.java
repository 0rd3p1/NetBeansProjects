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
public class execW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int id = 0;
        double m = 0;
        int s = 0;
        int cont = 1;
        
        do {
            System.out.printf("Digite a idade do " + cont + "* aluno (digite 999 para sair): ");
            id = teclado.nextInt();
            if (id != 999)
                s += id;
            cont++;
        } while (id != 999);
        m = s / cont;
        System.out.println("Em uma turma de " + (cont - 2) + " alunos, a média de idade é: " + m);
    }
}