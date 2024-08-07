
import java.util.Random;
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
public class ExecHash21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        Set<Integer> num = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            num.add(ran.nextInt(10));
        }
        System.out.println("Este HashSet contem " + num.size() + " numeros");
    }
    
}
