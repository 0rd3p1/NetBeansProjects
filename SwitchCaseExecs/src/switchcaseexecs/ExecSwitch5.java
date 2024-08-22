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
public class ExecSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int op;
        
        do {
            System.out.println("Calculadora");
            System.out.println("1. Adicao");
            System.out.println("2. Subtracao");
            System.out.println("3. Divisao");
            System.out.println("4. Multiplicacao");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");
            
            op = entrada.nextInt(); 
            
            switch (op) {
                case 1:
                    entrada.close();
                    System.out.print("Digite o primeiro numero: ");
                    double n1 = entrada.nextDouble();
                    entrada.close();
                    System.out.print("Digite o segundo numero: ");
                    double n2 = entrada.nextDouble();
                    entrada.close();
                    double soma = n1 + n2;
                    System.out.println("A soma dos dois numeros e igual a " + soma);
                    break;
                case 2: 
                    entrada.close();
                    System.out.print("Digite o primeiro numero: ");
                    double N1 = entrada.nextDouble();
                    entrada.close();
                    System.out.print("Digite o segundo numero: ");
                    double N2 = entrada.nextDouble();
                    entrada.close();
                    double sub = N1 - N2;
                    System.out.println("A subtracao dos dois numeros e igual a " + sub);
                    break;
                case 3: 
                    entrada.close();
                    System.out.print("Digite o primeiro numero: ");
                    double nu1 = entrada.nextDouble();
                    entrada.close();
                    System.out.print("Digite o segundo numero: ");
                    double nu2 = entrada.nextDouble();
                    entrada.close();
                    double div = nu1 / nu2;
                    System.out.println("A divisao dos dois numeros e igual a " + div);
                    break;
                case 4: 
                    entrada.close();
                    System.out.print("Digite o primeiro numero: ");
                    double Nu1 = entrada.nextDouble();
                    entrada.close();
                    System.out.print("Digite o segundo numero: ");
                    double Nu2 = entrada.nextDouble();
                    entrada.close();
                    double mult = Nu1 * Nu2;
                    System.out.println("A multiplicacao dos dois numeros e igual a " + mult);
                    break;
                case 5 :
                    System.out.println("Saindo...");
                    break;
                default: 
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }   
        } while (op != 5); 
        entrada.close();
    }
    
}
