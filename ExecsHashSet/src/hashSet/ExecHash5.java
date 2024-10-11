package hashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class ExecHash5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> cor = new HashSet<>();
        
        Collections.addAll(cor, "Vermelho", "Verde", "Azul", "Amarelo");
        
        System.out.println("Existem as seguintes cores no HashSet:");
        
        for (String i : cor) {
            System.out.println(i);
        }
    }
    
}
