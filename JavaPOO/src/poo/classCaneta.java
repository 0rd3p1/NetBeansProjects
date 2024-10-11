/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class classCaneta {
    public String marca;
    public String cor;
    public double ponta;
    public int carga;
    public boolean esta_tampada;
    
    public void estado_atual() {
        System.out.println("\n#Informacoes da caneta#\n");
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ela esta tampada? " + (this.esta_tampada ? "Sim" : "Nao"));
    } 
    
    public void escrever() {
        if (this.esta_tampada == true) {
            System.out.println("Esta tampada! Nao posso escrever!");
        } else {
            System.out.println("Esta destampada! Agora posso escrever!");
        }
    }
    
    public void tampar() {
        this.esta_tampada = true;
    }
    
    public void destampar() {
        this.esta_tampada = false;
    }
    
    public boolean perguntarTampada() {
        Scanner sc2 = new Scanner(System.in);
        
        System.out.print("A caneta esta tampada? S/N ");
        String res = sc2.nextLine().toLowerCase();
        
        if (res.equals ("s")) {
            return true;
        } else if (res.equals ("n")) {
            return false;
        } else {
            System.out.println("Resposta invalida. Por favor, digite 'S' ou 'N'!");
            return perguntarTampada();
        }
        
    }
    
}
