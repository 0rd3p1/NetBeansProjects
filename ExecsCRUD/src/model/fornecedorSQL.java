/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Pedro
 */
public class fornecedorSQL {
    
    public void add(String rS, String nF, int cnpj) {
        String sql = "INSERT INTO fornecedor (razao_social, nome_fantasia, CNPJ) VALUES(?,?,?)";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, rS);
            stmt.setString(2, nF);
            stmt.setInt(3, cnpj);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<fornecedor> getAll() {
        ArrayList<fornecedor> fornecedores = new ArrayList<>();
        String sql = "SELECT id, razao_social, nome_fantasia, CNPJ FROM fornecedor";
        try (Connection conn = DAO.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                fornecedor f = new fornecedor(rs.getInt("id"), rs.getString("razao_social"),
                rs.getString("nome_fantasia"), rs.getInt("CNPJ"));
                fornecedores.add(f);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return fornecedores;
    }

    public Optional<fornecedor> getById(int id) {
        String sql = "SELECT id, razao_social, nome_fantasia, CNPJ FROM fornecedor WHERE id = ?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                fornecedor f = new fornecedor(rs.getInt("id"), rs.getString("razao_social"),
                rs.getString("nome_fantasia"), rs.getInt("CNPJ"));
                return Optional.of(f);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }

    public ArrayList<fornecedor> getByRs(String rS) {
        ArrayList<fornecedor> fornecedores = new ArrayList<>();
        String sql = "SELECT id, razao_social, nome_fantasia, CNPJ FROM fornecedor WHERE razao_social like(?)";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, rS + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                fornecedor f = new fornecedor(rs.getInt("id"), rs.getString("razao_social"),
                rs.getString("nome_fantasia"), rs.getInt("CNPJ"));
                fornecedores.add(f);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return fornecedores;
    }
    
    public Optional<fornecedor> getByCnpj(int cnpj) {
        String sql = "SELECT id, razao_social, nome_fantasia, CNPJ FROM fornecedor WHERE CNPJ = ?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, cnpj);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                fornecedor f = new fornecedor(rs.getInt("id"), rs.getString("razao_social"),
                rs.getString("nome_fantasia"), rs.getInt("CNPJ"));
                return Optional.of(f);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }

    public boolean delete(int id) {
        String sql = "DELETE FROM fornecedor WHERE id = ?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean update(int id, String rS, String nF, int cnpj) {
        String sql = "UPDATE fornecedor SET razao_social = ?, nome_fantasia = ?, CNPJ = ? WHERE id = ?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, rS);
            stmt.setString(2, nF);
            stmt.setInt(3, cnpj);
            stmt.setInt(4, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
