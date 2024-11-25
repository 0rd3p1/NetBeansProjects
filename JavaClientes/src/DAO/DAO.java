/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.sun.jdi.connect.spi.Connection;
import Controller.Conexao;
import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class DAO {
    
private static PreparedStatement pst = null;
    private static ResultSet rs = null;
    
    private static String CADASTRAR_CLIENTE = "INSER INTO cliente (id, cpfCnpj, nome, email, telefone, endereco) values (null, ?, ?, ?, ?, ?)";
    private static String CONSULTAR_CLIENTE = "SELECT * FROM cliente WHERE id = ?";
    private static String ALTERAR_CLIENTE = "UPDATE cliente SET nome = ?, cpfCnpj = ?, email = ?, telefone = ?, endereco = ? WHERE id = ?";
    private static String EXCLUIR_CLIENTE = "DELETE FROM cliente WHERE id = ?";
    private static String LISTAR_CLIENTES = "SELECT * FROM cliente WHERE 1 = 1"; //qualquer coisa a gente apaga
    private static String CONSULTAR_USUARIO = "SELECT usuario, senha FROM usuario WHERE usuario = ? and senha = ?";
    
    public void cadastrarCliente(Cliente cliente) throws SQLException {
        Connection connection = Conexao.getConn().abrirConexao();
        try {
            pst.connection.prepareStatement(CADASTRAR_CLIENTE);
            int i = 1;
            pst.setString(i++, cliente.getNome());
            pst.setString(i++, cliente.getCpfCnpj());
            pst.setString(i++, cliente.getEmail());
            pst.setString(i++, cliente.getTelefone());
            pst.setString(i++, cliente.getEndereco());
            pst.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Cliente incluido com sucesso!");
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
    }
    
}
