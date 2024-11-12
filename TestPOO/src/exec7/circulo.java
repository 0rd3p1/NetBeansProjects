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
public class circulo implements interGeo {

    Scanner sc = new Scanner(System.in);
    
    @Override
    public void calcularArea() {
        System.out.println("Digite o raio do circulo (cm): ");
        double r = sc.nextDouble();
        System.out.println("A area do circulo e " + (3.14 * (r * 2)) + "cm");
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("O perimetro de um circulo é 3,14");
    }
    
}
