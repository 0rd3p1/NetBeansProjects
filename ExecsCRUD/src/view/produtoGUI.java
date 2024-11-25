/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.produtoController;
import java.util.ArrayList;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.produto;
import model.produtoSQL;

/**
 *
 * @author Pedro
 */
public class produtoGUI extends javax.swing.JFrame {

    private produtoController produtoController;

    /**
     * Creates new form usuarioGUI
     */
    public produtoGUI(produtoController produtoController) {
        this.produtoController = produtoController;
        initComponents();
        popularTabela(produtoController.getAll());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblN = new javax.swing.JLabel();
        txtV = new javax.swing.JTextField();
        lblV = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        btnBuscarId = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnBuscarN = new javax.swing.JButton();
        btnMax = new javax.swing.JButton();
        Min = new javax.swing.JButton();
        btnEntre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblId.setLabelFor(txtId);
        lblId.setText("ID:");

        lblN.setLabelFor(txtN);
        lblN.setText("Nome:");

        lblV.setLabelFor(txtV);
        lblV.setText("Valor:");

        btnBuscarId.setText("Buscar");
        btnBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        btnBuscarN.setText("Buscar");
        btnBuscarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNActionPerformed(evt);
            }
        });

        btnMax.setText("Max");
        btnMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxActionPerformed(evt);
            }
        });

        Min.setText("Min");
        Min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinActionPerformed(evt);
            }
        });

        btnEntre.setText("Entre");
        btnEntre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarId)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarN))
                                    .addComponent(lblN)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir))
                            .addComponent(lblV)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtV, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Min)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEntre)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(lblN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarN))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarId)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMax)
                        .addComponent(Min)
                        .addComponent(btnEntre)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdActionPerformed
        int id = Integer.valueOf(txtId.getText());
        Optional<produto> p = produtoController.getById(id);
        p.ifPresentOrElse(ps -> {
            txtN.setText(ps.getN());
            txtV.setText(String.valueOf(ps.getV()));
        }, () -> {
            JOptionPane.showMessageDialog(this, "ID nao encontrado!");
            txtId.setText("");
            txtId.requestFocus();
        });
    }//GEN-LAST:event_btnBuscarIdActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtId.setText("");
        txtN.setText("");
        txtV.setText("");
        txtN.requestFocus();
        popularTabela(produtoController.getAll());
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String n = txtN.getText();
        float v = Float.valueOf(txtV.getText());

        produtoController.add(n, v);

        JOptionPane.showMessageDialog(this, "Produto Salvo!");
        popularTabela(produtoController.getAll());
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int res = JOptionPane.showConfirmDialog(
                this,
                "Tem certeza?",
                "Confirmar exclusao",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
        if (res == JOptionPane.YES_OPTION) {
            int id = Integer.valueOf(txtId.getText());
            if (produtoController.delete(id)) {
                JOptionPane.showMessageDialog(this, "Produto excluido!");
            } else {
                JOptionPane.showMessageDialog(this, "Produto nao encontrado!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Abre o olho japones!");
        }
        popularTabela(produtoController.getAll());
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int id = Integer.valueOf(txtId.getText());
        String n = txtN.getText();
        float v = Float.valueOf(txtV.getText());

        if (produtoController.update(id, n, v)) {
            JOptionPane.showMessageDialog(this, "Produto alterado!");
        } else {
            JOptionPane.showMessageDialog(this, "Produto nao encontrado!");
        }
        popularTabela(produtoController.getAll());
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        int id = (int) tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0);
        Optional<produto> p = produtoController.getById(id);
        p.ifPresentOrElse(ps -> {
            txtId.setText(String.valueOf(ps.getId()));
            txtN.setText(ps.getN());
            txtV.setText(String.valueOf(ps.getV()));
        }, () -> {
            JOptionPane.showMessageDialog(this, "ID nao encontrado!");
            txtId.setText("");
            txtId.requestFocus();
        });
    }//GEN-LAST:event_tblProdutosMouseClicked

    private void btnBuscarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNActionPerformed
        String n = txtN.getText();
        Optional<produto> p = produtoController.getByName(n);
        p.ifPresentOrElse(ps -> {
            txtN.setText(ps.getN());
            txtV.setText(String.valueOf(ps.getV()));
        }, () -> {
            JOptionPane.showMessageDialog(this, "Nome nao encontrada!");
            txtN.setText("");
            txtN.requestFocus();
        });
    }//GEN-LAST:event_btnBuscarNActionPerformed

    private void btnMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxActionPerformed
        String input = JOptionPane.showInputDialog(this, "Qual valor maximo buscar?");
        ArrayList<produto> res = new ArrayList<>();
        try {
            if (input != null) {
                float v1 = Float.parseFloat(input);
                res = produtoController.getByMax(v1);
                popularTabela(res);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Valor invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMaxActionPerformed

    private void MinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinActionPerformed
        String input = JOptionPane.showInputDialog(this, "Qual valor minimo buscar?");
        ArrayList<produto> res = new ArrayList<>();
        try {
            if (input != null) {
                float v1 = Float.parseFloat(input);
                res = produtoController.getByMin(v1);
                popularTabela(res);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Valor invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_MinActionPerformed

    private void btnEntreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntreActionPerformed
        String input1 = JOptionPane.showInputDialog(this, "Qual o primeiro valor buscar?");
        String input2 = JOptionPane.showInputDialog(this, "Qual o segundo valor buscar?");
        ArrayList<produto> res = new ArrayList<>();
        try {
            if (input1 != null && input2 != null) {
                float v1 = Float.parseFloat(input1);
                float v2 = Float.parseFloat(input2);
                res = produtoController.getByBet(v1, v2);
                popularTabela(res);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Valor invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEntreActionPerformed

    public void popularTabela(ArrayList<produto> produto) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nome");
        model.addColumn("Valor");

        for (produto u : produto) {
            model.addRow(new Object[]{u.getId(), u.getN(), u.getV()});
        }
        tblProdutos.setModel(model);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(produtoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(produtoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(produtoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(produtoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                produtoSQL produtoSQL = new produtoSQL();
                produtoController usuarioController = new produtoController(produtoSQL);
                new produtoGUI(usuarioController).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Min;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JButton btnBuscarN;
    private javax.swing.JButton btnEntre;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMax;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblV;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtV;
    // End of variables declaration//GEN-END:variables
}