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
public class Exec5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declarando o ArrayList
        ArrayList<Character> lett = new ArrayList<>();

        // Definindo as letras
        Collections.addAll(lett, 'A', 'B', 'C', 'D');
        
        // Pritando o tamanho da lista
        System.out.println("Existem " + lett.size() + " caracteres na lista");
    }
}
