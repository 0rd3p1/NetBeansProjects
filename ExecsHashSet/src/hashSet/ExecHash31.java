package hashSet;


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
public class ExecHash31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> pal = new HashSet<>();
        Collections.addAll(pal, "Faz", "Fazer", "Faz", "Faco", "Fiz", "Fiz");
        
        System.out.println("A lista de plaavras unicas ficouu: " + pal);
    }
    
}
