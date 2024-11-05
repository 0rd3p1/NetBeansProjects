package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;

public class usuarioSQL {

    public void add(String nome, String usuario, String senha) {
        String sql = "INSERT INTO USUARIO (nome, usuario, senha) VALUES(?,?,?)";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, usuario);
            stmt.setString(3, senha);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<usuario> getAll() {
        ArrayList<usuario> usuarios = new ArrayList<>();
        String sql = "SELECT id, nome, usuario, senha FROM usuario";
        try (Connection conn = DAO.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                usuario u = new usuario(rs.getInt("id"), rs.getString("nome"),
                rs.getString("usuario"), rs.getString("senha"));
                usuarios.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return usuarios;
    }

    public Optional<usuario> getById(int id) {
        String sql = "SELECT id, nome, usuario, senha FROM usuario WHERE id = ?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                usuario u = new usuario(rs.getInt("id"), rs.getString("nome"),
                rs.getString("usuario"), rs.getString("senha"));
                return Optional.of(u);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }

    public ArrayList<usuario> getByNome(String nome) {
        ArrayList<usuario> usuarios = new ArrayList<>();
        String sql = "SELECT id, nome, usuario, senha FROM usuario WHERE nome like(?)";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                usuario u = new usuario(rs.getInt("id"), rs.getString("nome"),
                rs.getString("usuario"), rs.getString("senha"));
                usuarios.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return usuarios;
    }

    public boolean delete(int id) {
        String sql = "DELETE FROM usuario WHERE id = ?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean update(int id, String nome, String usuario, String senha) {
        String sql = "UPDATE usuario SET nome = ?, usuario = ?, senha = ? WHERE id = ?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, usuario);
            stmt.setString(3, senha);
            stmt.setInt(4, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
