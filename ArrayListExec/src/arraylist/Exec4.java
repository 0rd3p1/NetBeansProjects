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
public class Exec4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarando o ArrayList
        ArrayList<String> cor = new ArrayList<>();
        
        // Definindo as cores
        Collections.addAll(cor, "Vermelho", "Verde", "Azul");
        
        // Verificando se existe amarelo na lista e printando
        System.out.println("Existe amarelo na lista? " + cor.contains("Amarelo"));
    }
    
}
