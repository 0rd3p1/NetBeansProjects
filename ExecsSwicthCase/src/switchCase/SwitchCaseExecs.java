/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchCase;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class SwitchCaseExecs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        int dia;

        dia = ran.nextInt(6);
        System.out.println(dia);

        switch (dia) {
            case 0 -> System.out.println("Hoje e Domingo-feira!");
            case 1 -> System.out.println("Hoje e Segunda-feira!");
            case 2 -> System.out.println("Hoje e Terca-feira!");
            case 3 -> System.out.println("Hoje e Quarta-feira!");
            case 4 -> System.out.println("Hoje e Quinta-feira!");
            case 5 -> System.out.println("Hoje e Sexta-feira!");
            case 6 -> System.out.println("Hoje e Sabado-feira!");
        }
    }

}
