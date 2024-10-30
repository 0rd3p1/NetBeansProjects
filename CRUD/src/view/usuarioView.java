/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import control.usuarioController;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import model.usuario;

/**
 *
 * @author Pedro
 */
public class usuarioView {

    private usuarioController usuarioController;

    public usuarioView(usuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

    public void add() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        usuarioController.add(nome, username, senha);
        System.out.println("Usuario salvo!");
    }

    public void getAll() {
        for (usuario u : usuarioController.getAll()) {
            System.out.print("ID: ");
            System.out.println(u.getId() + "\t");
            System.out.print("Nome: ");
            System.out.println(u.getNome() + "\t");
            System.out.print("Username: ");
            System.out.println(u.getUsername() + "\t");
            System.out.print("Senha: ");
            System.out.println(u.getSenha() + "\t");
        }
    }

    public void getById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        Optional<usuario> u = usuarioController.getById(id);
        u.ifPresentOrElse(us -> System.out.println("ID: " + us.getId() + "\tNome: " + us.getNome() + "\tUsername: " + us.getUsername() + "\tSenha: " + us.getSenha()), () -> System.out.println("Não ecnotrado!"));
    }

    public void getByName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        ArrayList<usuario> res = usuarioController.getByName(nome);
        if (res.isEmpty()) {
            System.out.println("Nao foram encontrados nenhum usuario!");
        } else {
            for (usuario u : res) {
                System.out.print("ID: ");
                System.out.print(u.getId() + "\t");
                System.out.print("Nome: ");
                System.out.print(u.getNome() + "\t");
                System.out.print("Username: ");
                System.out.print(u.getUsername() + "\t");
                System.out.print("Senha: ");
                System.out.println(u.getSenha() + "\t");
            }
        }
    }
    
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Excluir ID: ");
        int id = sc.nextInt();
        if(usuarioController.delete(id)) {   // nao precisa ter  "== true" pois ele já é um boolean
            System.out.println("Usuario excluido com sucesso!");
        } else {
            System.out.println("Usuario nao encontrado!");
        }
    }
    
    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Atualizar ID: ");
        int id = sc.nextInt();
        sc.skip("\\R");
        System.out.print("\nNome: ");
        String nome = sc.nextLine();
        System.out.print("\nUsername: ");
        String username = sc.nextLine();
        System.out.print("\nSenha: ");
        String senha = sc.nextLine();
        if(usuarioController.update(id, nome, username, senha)) {
            System.out.println("Usuario atualizado!");
        } else {
            System.out.println("Usuario nao ecnotrado!");
        }
    }
    
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n\nGestao de Usuarios\n");
            System.out.println("1.Adicionar Usuario");
            System.out.println("2.Listar Todos os Usuarios");
            System.out.println("3.Localizar Usuario por Codigo");
            System.out.println("4.Localizar Usuario por Nome");
            System.out.println("5.Alterar Dados do usuario");
            System.out.println("6.Exlcuir usuario");
            System.out.println("7.Sair");
            System.out.print("Opcao: ");
            int op = sc.nextInt();
            switch(op) {
                case 1:
                    add();
                    break;
                case 2:
                    getAll();
                    break;
                case 3:
                    getById();
                    break;
                case 4:
                    getByName();
                    break;
                case 5:
                    update();break;
                case 6:
                    delete();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
    
}
