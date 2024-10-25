/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDb {

    // Variaveis de conexao ao banco
    private static final String url = "jdbc:mysql://localhost:3306/boate";
    private static final String user = "root";
    private static final String password = "root";

    public Connection conectar() {

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados!");
            e.printStackTrace();
            return null;
        }

    }

}
