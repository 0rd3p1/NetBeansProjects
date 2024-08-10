
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
public class ExecHash22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        Collections.addAll(num, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        num.removeIf(n -> (n % 2 == 0));

        System.out.println("A lista resultante ficou: " + num);
    }

}
