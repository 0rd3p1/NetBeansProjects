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
public class ExecHash27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> car1 = new HashSet<>();
        Collections.addAll(car1, "Cobalt", "Gol", "Chevette", "Saveiro", "Kwid");
        
        HashSet<String> car2 = new HashSet<>();
        Collections.addAll(car2, "Uno", "Onix", "S10", "Hilux", "Strada");
        
        car1.addAll(car2);
        
        System.out.println("As duas listas juntas ficam: " + car1);
    }
    
}
