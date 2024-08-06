/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExecFor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarando o input do teclado
        Scanner teclado = new Scanner(System.in);
        
        // Requisitando um imput
        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();
        
        // Declarando um contador
        int contVog = 0;
        
        // Iniciando o for
        for (char letra : frase.toCharArray()) {
            
            // Iniciando if
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contVog++;
            }
        }
        // Printando o resultado
        System.out.println("A frase contem " + contVog + " vogais.");
        
        // Encerrando o Scanner
        teclado.close();
    }
}