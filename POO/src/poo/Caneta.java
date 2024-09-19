/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Caneta {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        classCaneta C1 = new classCaneta();
        
        System.out.print("Digite a marca da caneta: ");
        String marcaC1 = sc.nextLine();
        
        System.out.print("Digite a cor da caneta: ");
        String corC1 = sc.nextLine();
        
        System.out.print("Digite a espessura da caneta: ");
        double pontaC1 = sc.nextDouble();
        
        System.out.print("Digite a carga da caneta: ");
        int cargaC1 = sc.nextInt();
        
        C1.marca = marcaC1;
        C1.cor = corC1;
        C1.ponta = pontaC1;
        C1.carga = cargaC1;
        
        boolean respostaTampada = C1.perguntarTampada();
        C1.esta_tampada = respostaTampada;
        
        C1.estado_atual();
        
    }
}
