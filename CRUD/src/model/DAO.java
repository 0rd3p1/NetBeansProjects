package model;

import java.sql.*;

public class DAO {
    
    private static final String URL = "jdbc:mysql://localhost:3306/crud";
    private static final String USER = "root";
    private static final String PSWD = "root";

    public static Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL, USER, PSWD);
        }catch(SQLException e){
            System.out.println("Problemas ao conectar: "+ e.getMessage());
        }
        return connection;
    }

}
