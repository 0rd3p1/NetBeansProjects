package DAO;

import Model.Users;
import java.sql.*;

public class UserDAO {
    
    public Users auth(int id, String username, String passwd) {
        String sql = "SELECT * FROM users WHERE username = '?' AND passwd = '?'";
        try (Connection conn = DB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, passwd);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Users user = new Users(id, username, passwd);
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPasswd(rs.getString("passwd"));
                return user;
            }
        } catch (SQLException e) {
            System.out.println("Erro na autenticacao: " + e.getMessage());
        }
        return null;
    }
    
    public Users add(String username, String passwd) {
        String sql = "INSERT INTO users VALUES (DEFAULT, '?', '?')";
        try (Connection conn = DB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, passwd);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
        return null;
    }
    
    public Users del(String username, String passwd) {
        String sql = "DELETE FROM usuers WHERE username = '?' AND passwd = '?'";
        try (Connection conn = DB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, passwd);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public void hist(int id, String username, String passwd) {
        String sql = "SELECT * FROM operations WHERE idUser = ?";
        try (Connection conn = DB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println(rs);
            }
        } catch (SQLException e) {
            System.out.println("Erro no historico: " + e.getMessage());
        }
    }
    
}
