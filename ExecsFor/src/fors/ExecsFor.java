package fors;

import java.util.Scanner;

public class ExecsFor {

    public static void main(String[] args) {

        // Declarando o input do teclado
        Scanner teclado = new Scanner(System.in);

        // Declarando as variaveis das notas
        double qtsNotas = 0;
        double soma = 0;
        double media = 0;

        // Requisitando a quantidade de notas
        System.out.print("Quantas notas voce deseja inserir? ");
        qtsNotas = teclado.nextByte();

        // Iniciando o for
        for (int i = 1; i <= qtsNotas; i++) {

            // Requisitando as notas
            System.out.print("Digite a nota " + i + ": ");
            double nota = teclado.nextDouble();

            // Somando as notas
            soma += nota;
        }

        // Calculando a média
        media = soma / qtsNotas;

        // Printando o resultado 
        System.out.println("A media do aluno e: " + media);

        // Encerrando o Scanner 
        teclado.close();
    }
}