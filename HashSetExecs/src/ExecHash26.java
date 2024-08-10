
import java.util.Collections;
import java.util.HashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ExecHash26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> frut1 = new HashSet<>();
        Collections.addAll(frut1, "Banana", "Maca", "Goiaba", "Melancia", "Pera");
        
        HashSet<String> frut2 = new HashSet<>();
        Collections.addAll(frut2, "Banana", "Maca", "Kiwi", "Melancia", "Morango");
        
        if (frut1.retainAll(frut2)) {
            System.out.println("As seguintes frutas estao em ambas as listas: " + frut1);
        }
        
    }
    
}
