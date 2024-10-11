/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExecCF {
    
    // Método Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a temperatura de Celsius: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = celsiusFahrenheit(celsius);
        
        System.out.println(celsius + "C equivale a " + fahrenheit + "F");
        sc.close();
    }
    
    // Método para converter C para F
    public static double celsiusFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
}
