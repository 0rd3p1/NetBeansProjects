package hashSet;


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
public class ExecHash24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> pais = new HashSet<>();
        Collections.addAll(pais, "Angola", "Brazil", "EUA", "Franca", "Mongolia");
        
        Set<String> p = new HashSet<>();
        Collections.addAll(p, "Brazil", "Angola", "Espanha", "Croacia", "Lituania");
        
        System.out.println("A primeira lista contem tudo que a segunda lista? " + pais.equals(p));
    }
    
}
