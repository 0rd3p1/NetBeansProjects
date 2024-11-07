/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

//import model.fornecedorSQL;
//import control.fornecedorController;
import control.produtoController;
import model.produtoSQL;
//import view.fornecedorView;
import view.produtoView;

public class teste1 {

    public static void main(String[] args) {
        
        //fornecedorSQL fSQL = new fornecedorSQL();
        //fornecedorController fC = new fornecedorController(fSQL);
        //fornecedorView fV = new fornecedorView(fC);
        
        produtoSQL pSQL = new produtoSQL();
        produtoController pC = new produtoController(pSQL);
        produtoView pV = new produtoView(pC);
        
        //fV.showMenuF();
        pV.showMenuP();
        
    }
    
}
