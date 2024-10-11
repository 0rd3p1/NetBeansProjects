package hashSet;


import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Aluno
 */
public class ExecHash10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> anima = new HashSet<>();
        
        Collections.addAll(anima, "Macaco", "Cachorro", "Gato", "Elefante");
        
        for (String i : anima) {
            System.out.println(i);
        }
    }
}