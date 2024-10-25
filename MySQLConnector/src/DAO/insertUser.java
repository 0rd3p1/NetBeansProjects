/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertUser {

    void insert(String nome, String email) {
        
        connectDb con = new connectDb();
        Connection conexao = con.conectar();
        
        if (conexao != null) {
            
            String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
            
            /*System.out.println("""
                               
                               ID: %d
                               Nome: %s
                               Email: %s
                               
                               """
            , id, nome, email);*/
            
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                
                ps.setString(1, nome);
                ps.setString(2, email);
                ps.executeUpdate();
                System.out.println("Usuario inserido com sucesso!");
                
            } catch (SQLException e) {
                System.out.println("Erro ao inserir o usuario!");
                e.printStackTrace();
            } finally {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            
        }
        
    }

}
