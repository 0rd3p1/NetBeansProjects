/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execsmetodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExecMetodo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<String> pal = new ArrayList<>();
        
        System.out.print("Digite a palavra: ");
        pal.add(sc.nextLine());
        
        System.out.println(pal);
        
    }
    
    public static String palVer(String pal) {
        return pal;
    }
}
