package DAO;

import Model.Users;
import java.sql.*;

public class UserDAO {
    
    // Autenticar o login
    public boolean auth(int id, String username, String passwd) {
        String sql = "SELECT * FROM users WHERE username = ? AND passwd = ?";
        try (Connection conn = DB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, passwd);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Users user = new Users(id, username, passwd);
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPasswd(rs.getString("passwd"));
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na autenticacao: " + e.getMessage());
        }
        return false;
    }
    
    // Cadastrar um login
    public boolean add(String username, String passwd) {
        String sql = "INSERT INTO users VALUES (DEFAULT, ?, ?)";
        try (Connection conn = DB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, passwd);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
        return false;
    }
    
    // Deletar a conta logada
    public boolean del(String username, String passwd) {
        String sql = "DELETE FROM users WHERE username = ? AND passwd = ?";
        try (Connection conn = DB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, passwd);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar: " + e.getMessage());
        }
        return false;
    }
    
    // Verificar se o username ja esta sendo utilizado
    public boolean exis(String username) {
        String sql = "SELECT username FROM users WHERE username = ?";
        try (Connection conn = DB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na pesquisa: " + e.getMessage());
        }
        return false;
    }
    
    // Pesquisar senha pelo username por conta do Hash de criptografia na autenticacao
    public String getPswByUser(String username) {
        String sql = "SELECT passwd FROM users WHERE username = ?";
        try (Connection conn = DB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("passwd");
            }
        } catch (SQLException e) {
            System.out.println("Erro na pesquisa: " + e.getMessage());
        }
        return null;
    }
    
}
