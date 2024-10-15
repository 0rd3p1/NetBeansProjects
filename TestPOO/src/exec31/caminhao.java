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
public class caminhao extends veiculo {
    
    Scanner sc = new Scanner(System.in);
    
    private int carga;
    private double seguroV;

    public caminhao(String ma, String mo, int a, int c) {
        super(ma, mo, a);
        this.carga = c;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public double getsV() {
        return seguroV;
    }

    public void setsV(double sV) {
        this.seguroV = sV;
    }
    
    @Override
    public void addSeguro() {
        double pS = 7.5;
        
        System.out.print("Digite o valor do veiculo: ");
        double pV = sc.nextDouble();
        
        this.seguroV = (pS * pV) / 100;
    }

    @Override
    public void apresentar() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Carga: " + this.getCarga() + " Toneladas");
        if (this.getsV() == 0) {
            System.out.println("Veiculo sem seguro");
        } else {
            System.out.println("Valor do Seguro: " + this.getsV());
        }
    }

}
