package DAO;

import java.sql.*;

public class DB {
    
    private static final String URL = "jdbc:mysql://localhost:3306/db";
    private static final String USER = "root";
    private static final String PSWD = "root";

    public static Connection getConnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(URL, USER, PSWD);
        }catch(SQLException e){
            System.out.println("Problemas ao conectar: "+ e.getMessage());
        }
        return conn;
    }
    
}
