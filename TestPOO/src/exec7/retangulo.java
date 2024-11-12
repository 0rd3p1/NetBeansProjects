/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec7;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class retangulo implements interGeo {

    Scanner sc = new Scanner(System.in);
    
    @Override
    public void calcularArea() {
        System.out.print("Digite a altura do retangulo (cm): ");
        double c = sc.nextDouble();
        System.out.print("Digite a largura do retangulo (cm): ");
        double a = sc.nextDouble();
        System.out.println("A area do retangulo é " + (a * c) + " cm");
    }

    @Override
    public void calcularPerimetro() {
        System.out.print("Digite a altura do retangulo (cm): ");
        double c = sc.nextDouble();
        System.out.print("Digite a largura do retangulo (cm): ");
        double a = sc.nextDouble();
        System.out.println("O perimetro do retangulo é " + ((2 * a) + (2 * c)) + " cm");
    }
    
}
