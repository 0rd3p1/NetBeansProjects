/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.fornecedor;
import control.fornecedorController;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class fornecedorView {

    private fornecedorController fornecedorController;

    public fornecedorView(fornecedorController fornecedorController) {
        this.fornecedorController = fornecedorController;
    }

    public void add() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Razao Social: ");
        String rS = sc.nextLine();

        System.out.print("Nome Fantasia: ");
        String nF = sc.nextLine();

        System.out.print("CNPJ: ");
        int cnpj = sc.nextInt();
        sc.skip("\\R");

        fornecedorController.add(rS, nF, cnpj);
        System.out.println("Usuario salvo!");
    }

    public void getAll() {
        for (fornecedor f : fornecedorController.getAll()) {
            System.out.print("ID: ");
            System.out.println(f.getId() + "\t");
            System.out.print("Razao Social: ");
            System.out.println(f.getRs() + "\t");
            System.out.print("Nome Fantasia: ");
            System.out.println(f.getNf() + "\t");
            System.out.print("CNPJ: ");
            System.out.println(f.getCnpj() + "\t");
        }
    }

    public void getById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        Optional<fornecedor> f = fornecedorController.getById(id);
        f.ifPresentOrElse(fo -> System.out.println("ID: " + fo.getId() + "\tRazao Social: " + fo.getRs() + "\tNome Fantasia: " + fo.getNf() + "\tCNPJ: " + fo.getCnpj()), () -> System.out.println("Nao encontrado!"));
    }

    public void getByRs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Razao Social: ");
        String rS = sc.nextLine();
        ArrayList<fornecedor> res = fornecedorController.getByRs(rS);
        if (res.isEmpty()) {
            System.out.println("Nao foi encontrado nenhum fornecedor!");
        } else {
            for (fornecedor f : res) {
                System.out.print("ID: ");
                System.out.print(f.getId() + "\t");
                System.out.print("Razao Social: ");
                System.out.print(f.getRs() + "\t");
                System.out.print("Nome Fantasia: ");
                System.out.print(f.getNf() + "\t");
                System.out.print("CNPJ: ");
                System.out.println(f.getCnpj() + "\t");
            }
        }
    }

    public void getByCnpj() {
        Scanner sc = new Scanner(System.in);
        System.out.print("CNPJ: ");
        int cnpj = sc.nextInt();
        Optional<fornecedor> f = fornecedorController.getByCnpj(cnpj);
        f.ifPresentOrElse(fo -> System.out.println("ID: " + fo.getId() + "\tRazao Social: " + fo.getRs() + "\tNome Fantasia: " + fo.getNf() + "\tCNPJ: " + fo.getCnpj()), () -> System.out.println("Nao encontrado!"));
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.skip("\\R");
        System.out.print("\nRazao Social: ");
        String rS = sc.nextLine();
        System.out.print("\nNome Fantasia: ");
        String nF = sc.nextLine();
        sc.skip("\\R");
        System.out.print("\nCNPJ: ");
        int cnpj = sc.nextInt();
        if (fornecedorController.update(id, rS, nF, cnpj)) {
            System.out.println("Fornecedor atualizado!");
        } else {
            System.out.println("Fornecedor nao encontrado!");
        }
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        if (fornecedorController.delete(id)) {
            System.out.println("Fornecedor excluido!");
        } else {
            System.out.println("Fornecedor nao encontrado!");
        }
    }

    public void showMenuF() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n\nGestao de Fornecedores\n");
            System.out.println("1.Adicionar Fornecedor");
            System.out.println("2.Listar Todos os Fornecedores");
            System.out.println("3.Localizar Fornecedor por Codigo");
            System.out.println("4.Localizar Fornecedor por Razao Social");
            System.out.println("5.Localizar Fornecedor por CNPJ");
            System.out.println("6.Alterar Dados do Fornecedor");
            System.out.println("7.Exlcuir Fornecedor");
            System.out.println("8.Sair");
            System.out.print("Opcao: ");
            int op = sc.nextInt();
            switch (op) {
                case 1 ->
                    add();
                case 2 ->
                    getAll();
                case 3 ->
                    getById();
                case 4 ->
                    getByRs();
                case 5 ->
                    getByCnpj();
                case 6 ->
                    update();
                case 7 ->
                    delete();
                case 8 ->
                    System.exit(0);
                default ->
                    System.out.println("Opcao invalida!");
            }
        }
    }

}
