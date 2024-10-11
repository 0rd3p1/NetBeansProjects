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
public class ExecHash6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> anima = new HashSet<>();
        
        Collections.addAll(anima, "Leao", "Macaco", "Arara", "Elefante");
        
        if (anima.contains("Arara")) {
            System.out.println("Este HashSet contem Arara!");
        }
    }
    
}
