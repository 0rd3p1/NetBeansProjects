/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Pedro
 */
public class produtoSQL {
    
    public void add(String n, float v) {
        String sql = "INSERT INTO produto (nome, valor) VALUES(?,?)";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, n);
            stmt.setFloat(2, v);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<produto> getAll() {
        ArrayList<produto> produtos = new ArrayList<>();
        String sql = "SELECT id, nome, valor FROM produto";
        try (Connection conn = DAO.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                produto ps = new produto(rs.getInt("id"), rs.getString("nome"),
                rs.getFloat("valor"));
                produtos.add(ps);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return produtos;
    }

    public Optional<produto> getById(int id) {
        String sql = "SELECT id, nome, valor FROM produto WHERE id = ?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                produto p = new produto(rs.getInt("id"), rs.getString("nome"),
                rs.getFloat("valor"));
                return Optional.of(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }

    public ArrayList<produto> getByName(String n) {
        ArrayList<produto> produtos = new ArrayList<>();
        String sql = "SELECT id, nome, valor FROM produto WHERE nome like(?)";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, n + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                produto p = new produto(rs.getInt("id"), rs.getString("nome"),
                rs.getFloat("valor"));
                produtos.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return produtos;
    }
    
    public boolean update(int id, String n, float v) {
        String sql = "UPDATE produto SET nome = ?, valor = ? WHERE id = ?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, n);
            stmt.setFloat(2, v);
            stmt.setInt(3, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean delete(int id) {
        String sql = "DELETE FROM produto WHERE id = ?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public ArrayList<produto> getByMin(float v1) {
        String sql = "SELECT MIN(?) FROM produto";
        ArrayList<produto> produtos = new ArrayList<>();
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setFloat(1, v1);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                produto p = new produto(rs.getInt("id"), rs.getString("nome"),
                rs.getFloat("valor"));
                produtos.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return produtos;
    }
    
    public ArrayList<produto> getByMax(float v1) {
        String sql = "SELECT MAX(?) FROM produto";
        ArrayList<produto> produtos = new ArrayList<>();
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setFloat(1, v1);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                produto p = new produto(rs.getInt("id"), rs.getString("nome"),
                rs.getFloat("valor"));
                produtos.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return produtos;
    }
    
    public ArrayList<produto> getByBet(float v1, float v2) {
        String sql = "SELECT * FROM produto WHERE valor BETWEEN ? AND ?";
        ArrayList<produto> produtos = new ArrayList<>();
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setFloat(1, v1);
            stmt.setFloat(2, v2);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                produto p = new produto(rs.getInt("id"), rs.getString("nome"),
                rs.getFloat("valor"));
                produtos.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return produtos;
    }
    
}
