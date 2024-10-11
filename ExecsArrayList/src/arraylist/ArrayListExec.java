package arraylist;

import java.util.ArrayList;

public class ArrayListExec {

    public static void main(String[] args) {

        // Declarando o ArrayList
        ArrayList<String> listaDeNomes = new ArrayList<>();

        // Adicionando nomes no ArrayList
        listaDeNomes.add("Lukas");
        listaDeNomes.add("Carlos");
        listaDeNomes.add("Julio");
        listaDeNomes.add("Joao");
        listaDeNomes.add("Caio");
        listaDeNomes.add("Wallyson");

        // Mostrando o terceiro nome da lista: Caio
        System.out.println("Quarto Nome da Lista: " + listaDeNomes.get(4));

        // Remover elemento
        listaDeNomes.remove("Pedro");
        listaDeNomes.remove(1);

        // Mostrando o tamanho da lista
        System.out.println("Tamanha da Lista: " + listaDeNomes.size());

        // Verficar se a lista contem o elemento desejado
        System.out.println("Existe Caio na lista? " + listaDeNomes.contains("Caio"));

        // Limpando a lista de nomes
        listaDeNomes.clear();

        // Verificar se a lista esta vazia
        System.out.println("A lista esta vazia? " + listaDeNomes.isEmpty());

        // Printando todos os nomes 
        for (String nomes : listaDeNomes) {
            System.out.println(nomes);
        }
    }
}