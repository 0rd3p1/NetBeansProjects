 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.sun.jdi.connect.spi.Connection;
import Controller.Conexao;

/**
 *
 * @author Aluno
 */
public class DB {
    
    private static Connection connection = null;
    
    public static void main(String[] args) {
        try {
            connection = Conexao.getConn().abrirConexao();
            System.out.println("Base criada com sucesso");
            Conexao.getConn().fecharConexao();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
    
}
