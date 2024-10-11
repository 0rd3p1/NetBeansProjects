/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class Exec1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarando o ArrayList
        ArrayList<String> cidade = new ArrayList<>();
        
        // Definindo o valor do ArrayList
        Collections.addAll(cidade, "tramandai", "goias", "imbe", "sao paulo", "cidreira");
        
        // Printando as cidades
        System.out.println("As cidades sao: " + cidade);
    }
    
}
