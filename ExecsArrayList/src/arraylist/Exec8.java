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
public class Exec8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarando o ArrayList
        ArrayList<String> pais = new ArrayList<>();
        
        // Definindo os paises
        Collections.addAll(pais, "Angola", "Brazil", "Noruegua", "Cazaquistao", "EUA");
        
        // Printando os paises dentro do for
        for (String i : pais) {
            System.out.println("O nome do pais e: " + pais);
        }
    }
    
}
