/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


/**
 *
 * @author Aluno
 */
public class Conexao {
    
    private static final String url = "jbdc:mysql://localhost:3306/bdclientes";
    private static final String user = "root";
    private static final String password = "root";
    
    private static Connection conexao;
    private static Conexao conn;
    
    public static Conexao getConn(){
        if(conn == null){
            conn = new Conexao();
        }
        return conn;
    }
    
    public Connection abrirConexao(){
        try{
            //Carregar o driver JDBC para MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = (Connection) DriverManager.getConnection(url, user, password);
            conexao.setAutoCommit(false);
        }catch(SQLException | ClassNotFoundException e){
            System.out.println("Erro ao conectar o banco de dados" + e.getMessage());
        }
        return null;
    }
    
    public void fecharConexao(){
        try {
            if (conexao != null && !conexao.close()) {
                conexao.close();
            }
        } catch(SQLException e) {
            System.out.println("Erro ao fechar a conexão" +e.get.Message());
        } finally {
            conexao = null;
        }
    }
    
}
