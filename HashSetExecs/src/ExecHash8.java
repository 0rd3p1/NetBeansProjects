/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class ExecHash8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> cid = new HashSet<>();
        
        Collections.addAll(cid, "Tramandai", "Cidreira", "Imbe", "Osorio", "Sao Paulo");
        
        cid.remove("Sao Paulo");
        
        System.out.println("O HashSet contem: " + cid);
    } 
}