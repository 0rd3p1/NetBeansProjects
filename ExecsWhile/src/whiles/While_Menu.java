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
public class While_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Opcao 1");
            System.out.println("2. Opcao 2");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opcao: ");
            
            opcao = entrada.nextInt(); 
            
            switch (opcao) {
                case 1:
                    System.out.println("Voce escolheu a opcao 1");
                case 2: 
                    System.out.println("Voce escolheu a opcao 2");
                    break;
                case 3: 
                    System.out.println("Saindo do menu principal...");
                    break;
                default: 
                    System.out.println("Opcao invalida! Tente novamente.");
            }   
        } while (opcao != 3); 
        entrada.close();
    }
}
