/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcaseexecs;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExecSwitch4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Iniciar");
            System.out.println("2. Configuracoes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opcao (1, 2, 3): ");
            
            opcao = entrada.nextInt(); 
            
            switch (opcao) {
                case 1:
                    System.out.println("Iniciado (o u o)");
                case 2: 
                    System.out.println("Configurado owo");
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
