/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar?[S/N]: " );
            resposta = teclado.next();
        } while (resposta.equals ("S"));
        System.out.println("A soma de todos os valores e: " + s);
    }
}
