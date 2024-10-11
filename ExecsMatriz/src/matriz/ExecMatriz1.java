/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author Aluno
 */
public class ExecMatriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int soma = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j]);
                soma += mat[i][j];
            }
            System.out.println("");
        }
        System.out.println(soma);
        
    }

}
