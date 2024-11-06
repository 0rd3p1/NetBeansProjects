/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import control.usuarioController;
import model.usuarioSQL;
import view.usuarioView;

/**
 *
 * @author Pedro
 */
public class main {
    
    public static void main(String[] args) {
        
        usuarioSQL usuarioSQL = new usuarioSQL();
        usuarioController usuarioController = new usuarioController(usuarioSQL);
        usuarioView usuarioView = new usuarioView(usuarioController);
        
        usuarioView.showMenu();
        
    }
    
}
