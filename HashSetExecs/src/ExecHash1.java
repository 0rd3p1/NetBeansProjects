
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
public class ExecHash1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        
        for (int i = 1; i <= 10; i++) {
            num.add(i);
        }
        if (num.contains(5)) {
            System.out.println("Este HashSet contem 5!");
        }
    }
    
}
