package metodos;

import java.util.Scanner;

public class ExecMetodo1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();
        System.out.print("Digite outro numero: ");
        num2 = sc.nextInt();
        
        int Soma = soma(num1,num2);
        
        System.out.println("A soma dos numeros fica: " + Soma);
    } 
    
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }
    
}
