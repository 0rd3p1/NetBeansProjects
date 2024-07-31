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
public class execW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado3 = new Scanner(System.in);
        
        double salM, salF = 0;
        String f;
        double sM = 0; 
        double sF = 0;
        int op;
 
        
        do {
            System.out.println("1. Funcionários Masculinos");
            System.out.println("2. Funcionários Femininos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção (1, 2, 3): ");
            op = teclado.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("Nome do funcionário: ");
                    f = teclado2.nextLine();
                    System.out.printf("\nSalário do funcionário: ");
                    salM = teclado3.nextInt();
                    sM += salM; 
                    break;
                case 2:
                    System.out.print("Nome do funcionário: ");
                    f = teclado2.nextLine();
                    System.out.print("\nSalário do funcionário: ");
                    salF = teclado3.nextInt();
                    sF += salF;
                    break;
                case 3:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 3);
        
        System.out.println("O salario total pago aos homens foi " + sM + "R$");
        System.out.println("O salario total pago as mulheres foi " + sF + "R$");
    }
}
