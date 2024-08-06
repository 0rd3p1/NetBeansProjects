/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashsetexecs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class HashSetExecs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();

        frutas.add("Maca");
        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Melancia");

        System.out.println(frutas);

        for (String i : frutas) {
            System.out.println(i);
        }

        if (frutas.contains("Pera")) {
            System.out.println("Pera encontrada!");
        }
    }
}