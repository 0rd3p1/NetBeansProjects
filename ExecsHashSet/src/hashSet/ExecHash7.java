package hashSet;


import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ExecHash7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> cor = new HashSet<>();
        
        Collections.addAll(cor, "Vermelho", "Verde", "Amarelo", "Azul");
        
        if (cor.contains("Vermelho")) {
            System.out.println("Este HashSet contem Vermelho!");
        }
    }
    
}
