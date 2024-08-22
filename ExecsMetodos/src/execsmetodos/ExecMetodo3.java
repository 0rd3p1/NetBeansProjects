package execsmetodos;

import java.util.Scanner;

public class ExecMetodo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = fatNum(num2, num1);
        
        System.out.println("O fatorial do numero e: " + res);
    }
    
    public static int fatNum(int numl, int numk) {
        int res = 1;
        for (int i = 1; i <= numl; i++) {
            res *= i;
        }
        return res;
    }
}
