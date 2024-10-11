/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author Aluno
 */
public class ExecsMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declarando a matriz da tabuada (tabuada do 1 ao 10)
        int[][] tab = new int[11][11];

        // Iniciando um for para adicionar os valores nas posiçoes da matriz
        for (int lin = 1; lin < 11; lin++) {
            for (int col = 1; col < 11; col++) {
                tab[lin][col] = (lin) * (col);
            }
        }
        for (int lin = 1; lin < 11; lin++) {
            for (int col = 1; col < 11; col++) {

                // Printando a matriz
                System.out.println(lin + " x " + col + " = " + tab[lin][col]);
            }
            
            // Print para linha vazia
            System.out.println("");
        }
    }

}
