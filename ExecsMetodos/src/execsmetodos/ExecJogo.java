/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execsmetodos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExecJogo {
    
    // Método main
    public static void main(String[] args) {
        iniciarJogo();
        
        Random rd = new Random();
        int numeroSecreto = rd.nextInt(100) + 1;
        boolean venceu = false;
        
        while (!venceu) {
            int palpite = processarEntrada();
            venceu = verificadorVencedor(palpite,numeroSecreto);
        }
        
        System.out.println("Obrigado por jogar!");
    }
    
    // Método para iniciar o jogo
    public static void iniciarJogo() {
        System.out.println("Bem-Vindo ao jogo de adivinhacao");
        System.out.println("Tente adivinha no numero que estou pensando, entre 1 e 100");
    }
    
    // Método para processar a entrada do usuário
    public static int processarEntrada() {
        Scanner sc = new Scanner( System.in);
        System.out.print("Digite seu palpite: ");
        return sc.nextInt();
    }
    
    // Método para verificar o vencedor
    public static boolean verificadorVencedor(int palpite, int numeroSecreto) {
        if (palpite == numeroSecreto) {
            System.out.println("Parabens! Voce acertou o numero!");
            return true;
        } else if (palpite < numeroSecreto) {
            System.out.println("O numero e maior que " + palpite);
        } else {
            System.out.println("O numero e menor que " + palpite);
        }
        return false;
    }
    
    
    
}
