package metodos;

import java.util.Scanner;

public class ExecsMetodos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero de alunos: ");
        int numAluno = teclado.nextInt();

        for (int i = 0; i < numAluno; i++) {
            System.out.print("Digite o numero de notas para cada aluno: ");
            int numNotas = teclado.nextInt();
            double[] notas = new double[numNotas];
            for (int j = 0; j < numNotas; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[j] = teclado.nextInt();
            }
            //double media = calcularMedia(notas);
            //System.out.println("A media do aluno " + (i + 1) + " e: " + media);
            MediaNotas mediaNotas = new MediaNotas(notas);
            double media = mediaNotas.calcularMedia();
            System.out.println("A media do aluno " + i + " e: " + media);
        }

    }
    /*public static double calcularMedia(double[] notas) {
        double soma = 0;
        
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }*/
}
