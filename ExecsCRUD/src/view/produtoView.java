/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.produto;
import control.produtoController;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class produtoView {

    private produtoController produtoController;

    public produtoView(produtoController produtoController) {
        this.produtoController = produtoController;
    }

    public void add() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String n = sc.nextLine();
        sc.skip("\\R");

        System.out.print("Valor: ");
        int v = sc.nextInt();

        produtoController.add(n, v);
        System.out.println("Produto salvo!");
    }

    public void getAll() {
        for (produto p : produtoController.getAll()) {
            System.out.print("ID: ");
            System.out.println(p.getId() + "\t");
            System.out.print("Nome: ");
            System.out.println(p.getN() + "\t");
            System.out.print("Valor: ");
            System.out.println(p.getV() + "\t");
        }
    }

    public void getById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        Optional<produto> p = produtoController.getById(id);
        p.ifPresentOrElse(pr -> System.out.println("ID: " + pr.getId() + "\tNome: " + pr.getN() + "\tValor: " + pr.getV(), () -> System.out.println("Nao encontrado!"));
    }

    public void getByName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String n = sc.nextLine();
        ArrayList<produto> res = produtoController.getByName(n);
        if (res.isEmpty()) {
            System.out.println("Nao foi encontrado nenhum produto!");
        } else {
            for (produto p : res) {
                System.out.print("ID: ");
                System.out.print(f.getId() + "\t");
                System.out.print("Nome: ");
                System.out.print(f.getN() + "\t");
                System.out.print("Valor: ");
                System.out.print(f.getV() + "\t");
            }
        }
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.skip("\\R");
        System.out.print("\nNome: ");
        String n = sc.nextLine();
        sc.skip("\\R")
        System.out.print("\nValor: ");
        float v = sc.nextLine();
        if (produtoController.update(id, n, v)) {
            System.out.println("Produto atualizado!");
        } else {
            System.out.println("Produto nao encontrado!");
        }
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        if (produtoController.delete(id)) {
            System.out.println("Produto excluido!");
        } else {
            System.out.println("Produto nao encontrado!");
        }
    }

    public void getByMin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor: ");
        float v1 = sc.nextFloat();
        ArrayList<produto> res = produtoController.getByMin(v1);
        if (res.isEmpity()) {
            System.out.println("Produto nao encontrado!");
        } else {
            for (produto p : res) {
                System.out.print("ID: ");
                System.out.print(p.getId() + "\t");
                System.out.print("Nome: ");
                System.out.print(f.getN() + "\t");
                System.out.print("Valor: ");
                System.out.print(f.getV() + "\t");
            }
        }
    }
    
    public void getByMax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor: ");
        float v1 = sc.nextFloat();
        ArrayList<produto> res = produtoController.getByMax(v1);
        if (res.isEmpity()) {
            System.out.println("Produto nao encontrado!");
        } else {
            for (produto p : res) {
                System.out.print("ID: ");
                System.out.print(p.getId() + "\t");
                System.out.print("Nome: ");
                System.out.print(f.getN() + "\t");
                System.out.print("Valor: ");
                System.out.print(f.getV() + "\t");
            }
        }
    }
    
    public void getByBet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro Valor: ");
        float v1 = sc.nextFloat();
        System.out.println("Segundo Valor");
        float v2 = sc.nextFloat();
        ArrayList<produto> res = produtoController.getByBet(v1, v2);
        if (res.isEmpity()) {
            System.out.println("Produto nao encontrado!");
        } else {
            for (produto p : res) {
                System.out.print("ID: ");
                System.out.print(p.getId() + "\t");
                System.out.print("Nome: ");
                System.out.print(f.getN() + "\t");
                System.out.print("Valor: ");
                System.out.print(f.getV() + "\t");
            }
        }
    }
    
    public void showMenuP() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n\nGestao de Produtos\n");
            System.out.println("1.Adicionar Produto");
            System.out.println("2.Listar Todos os Produtos");
            System.out.println("3.Localizar Produto por Codigo");
            System.out.println("4.Localizar Produto por Nome");
            System.out.println("5.Localizar Produto por Valor Minimo");
            System.out.println("6.Localizar Produto por Valor Maximo");
            System.out.println("7.Localizar Produto por Valor Entre");
            System.out.println("8.Alterar Dados do Produto");
            System.out.println("9.Exlcuir Produto");
            System.out.println("10.Sair");
            System.out.print("Opcao: ");
            int op = sc.nextInt();
            switch(op) {
                case 1 -> add();
                case 2 -> getAll();
                case 3 -> getById();
                case 4 -> getByName();
                case 5 -> getByMin();
                case 6 -> getByMax();
                case 7 -> getByBet();
                case 8 -> update();
                case 9 -> delete();
                case 10 -> System.exit(0);
                default -> System.out.println("Opcao invalida!");
            }
        }
    }
    
}
