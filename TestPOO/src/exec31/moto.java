/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec31;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class moto extends veiculo {
    
    Scanner sc = new Scanner(System.in);
    
    private int cilindradas;
    private double seguroV;

    public moto(String ma, String mo, int a, int c) {
        super(ma, mo, a);
        this.cilindradas = c;
    }
    
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public double getsV() {
        return seguroV;
    }

    public void setsV(double sV) {
        this.seguroV = sV;
    }
    
    @Override
    public void addSeguro() {
        double pS = 2.5;
        
        System.out.print("Digite o valor do veiculo: ");
        double pV = sc.nextDouble();
        
        this.seguroV = (pS * pV) / 100;
    }

    @Override
    public void apresentar() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Cilindradas: " + this.getCilindradas());
        if (this.getsV() == 0) {
            System.out.println("Veiculo sem seguro");
        } else {
            System.out.println("Valor do Seguro: " + this.getsV());
        }
    }
    
}
