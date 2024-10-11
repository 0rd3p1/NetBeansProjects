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
public class Exec6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarando o ArrayList
        ArrayList<String> frut = new ArrayList<>();
        
        // Definindo as frutas na lista
        Collections.addAll(frut, "Maca", "Banana", "Pera", "Goiaba", "Abacaxi");
        
        // Pritnando a lista antes de substituir a terceira fruta
        System.out.println(frut);
        
        // Substituindo a terceira fruta
        frut.set(2, "Morango");
        
        // Printando a lista apos a troca
        System.out.println("Lista final: " + frut);
    }
    
}
