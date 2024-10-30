/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import control.usuarioController;
import model.usuarioDAO;
import view.usuarioView;

/**
 *
 * @author Pedro
 */
public class main {
    
    public static void main(String[] args) {
        
        usuarioDAO usuarioDAO = new usuarioDAO();
        usuarioController usuarioController = new usuarioController(usuarioDAO);
        usuarioView usuarioView = new usuarioView(usuarioController);
        
        usuarioView.showMenu();
        
    }
    
}
