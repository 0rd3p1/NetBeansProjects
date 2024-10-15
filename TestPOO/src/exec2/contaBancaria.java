/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class contaBancaria {
    
    Scanner sc = new Scanner(System.in);
    
    private int numConta;
    private String titular;
    private double saldo;
    
    public void depositar() {
        System.out.println("Qual valor voce deseja depositar? ");
        saldo = sc.nextDouble();
        System.out.println("Valor depositado!");
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numC) {
        this.numConta = numC;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String t) {
        this.titular = t;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }
    
    
    
}
