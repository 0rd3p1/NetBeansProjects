package DAO;

import java.sql.*;
import Model.Calculator;
import java.util.ArrayList;

public class CalculatorDAO {
    
    public ArrayList<Calculator> somHist(double val1, String username) {
        ArrayList<Calculator> hist = new ArrayList<>();
        String sql = "INSERT INTO historico (id, som, idUser) VALUES (DEFAULT, ?, ?)";
        try (Connection conn = DB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, val1);
            stmt.setString(2, username);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
