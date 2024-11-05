/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import model.fornecedorSQL;
import control.fornecedorController;
import view.fornecedorView;

public class main {

    public static void main(String[] args) {
        
        fornecedorSQL fSQL = new fornecedorSQL();
        fornecedorController fC = new fornecedorController(fSQL);
        fornecedorView fV = new fornecedorView(fC);
        
        fV.showMenuF();
        
    }
    
}
