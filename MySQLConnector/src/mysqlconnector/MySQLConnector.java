/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mysqlconnector;

// Import de todos os pacotes
// import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pedro
 */
public class MySQLConnector {

    // Variaveis de conexao ao banco
    private static final String url = "jdbc:mysql://localhost:3306/boate";
    private static final String user = "root";
    private static final String password = "root";
    
    // Metodo principal de teste da conexao
    public static void main(String[] args) {
        
        Connection con = null;
        
        try {
            
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao estabelecida com sucesso!");
            
            String sql = "SELECT * FROM usuarios;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet res = ps.executeQuery();
            
            while (res.next()) {
                int id = res.getInt("id");
                String nome = res.getString("nome");
                String email = res.getString("email");
                System.out.println("\nID: " + id + "\nNome: " + nome + "\nEmail: " + email);
            }
            
            
            ps.close();
            res.close();
            
        } catch (SQLException e) {
            
            System.out.println("Erro na conexao com o banco de dados!");
            e.printStackTrace();
            
        } finally {
            if (con != null) {
                try {
                    
                    con.close();
                    
                } catch (SQLException e) {
                    
                    e.printStackTrace();
                    
                }
            }
        }
        
    }
    
}
