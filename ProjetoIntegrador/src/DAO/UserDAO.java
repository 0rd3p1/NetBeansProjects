package DAO;

import Model.Users;
import java.sql.Connection;
import java.sql.*;

public class UserDAO {
    
    public Users auth(int id, String username, String passwd) {
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
                return user;
            }
        } catch (SQLException e) {
            System.out.println("Erro na autenticação: " + e.getMessage());
        }
        return null;
    }
    
}
