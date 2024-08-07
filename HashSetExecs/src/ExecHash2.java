
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ExecHash2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        
        Collections.addAll(frutas, "Banana", "Maca", "Goiaba");
        
        frutas.remove("Maca");
        
        System.out.println("O HashSet final ficaou: " + frutas);
    }
    
}
