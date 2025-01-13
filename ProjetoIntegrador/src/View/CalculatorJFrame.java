package View;

import Model.Calculator;
import javax.swing.JOptionPane;

public class CalculatorJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginJFrame
     */
    Calculator op;
    
    public CalculatorJFrame() {
        op = new Calculator();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSom = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnPot = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnRai = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnRes = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtNum2 = new javax.swing.JTextField();
        btnC = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        txtNum1 = new javax.swing.JTextField();
        lblApont = new javax.swing.JLabel();
        lblApont1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSom.setBackground(new java.awt.Color(153, 153, 153));
        btnSom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSom.setForeground(new java.awt.Color(0, 0, 0));
        btnSom.setText("+");
        btnSom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomActionPerformed(evt);
            }
        });

        btnSub.setBackground(new java.awt.Color(153, 153, 153));
        btnSub.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSub.setForeground(new java.awt.Color(0, 0, 0));
        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(153, 153, 153));
        btnDiv.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDiv.setForeground(new java.awt.Color(0, 0, 0));
        btnDiv.setText("÷");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnMul.setBackground(new java.awt.Color(153, 153, 153));
        btnMul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMul.setForeground(new java.awt.Color(0, 0, 0));
        btnMul.setText("X");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btnPot.setBackground(new java.awt.Color(153, 153, 153));
        btnPot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPot.setForeground(new java.awt.Color(0, 0, 0));
        btnPot.setText("^");
        btnPot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnRai.setBackground(new java.awt.Color(153, 153, 153));
        btnRai.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRai.setForeground(new java.awt.Color(0, 0, 0));
        btnRai.setText("√");
        btnRai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnRes.setBackground(new java.awt.Color(153, 153, 153));
        btnRes.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnRes.setForeground(new java.awt.Color(51, 51, 51));
        btnRes.setText("=");
        btnRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResActionPerformed(evt);
            }
        });

        lblName.setLabelFor(txtNum2);
        lblName.setText("Bizzonhos Calculator");

        txtNum2.setBackground(new java.awt.Color(0, 204, 204));
        txtNum2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtNum2.setForeground(new java.awt.Color(255, 255, 255));

        btnC.setBackground(new java.awt.Color(153, 153, 153));
        btnC.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnC.setForeground(new java.awt.Color(51, 51, 51));
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 153, 0));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setText("Sair");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        txtNum1.setBackground(new java.awt.Color(0, 204, 204));
        txtNum1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtNum1.setForeground(new java.awt.Color(255, 255, 255));

        lblApont.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblApont.setText(">");

        lblApont1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblApont1.setText(">");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(94, 94, 94)
                                .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNum2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApont)
                                    .addComponent(lblApont1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNum1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(txtNum2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblApont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApont1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnSom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtNum2.setText(txtNum2.getText() + 1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtNum2.setText(txtNum2.getText() + 2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtNum2.setText(txtNum2.getText() + 3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtNum2.setText(txtNum2.getText() + 4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtNum2.setText(txtNum2.getText() + 5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtNum2.setText(txtNum2.getText() + 6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtNum2.setText(txtNum2.getText() + 7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtNum2.setText(txtNum2.getText() + 8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtNum2.setText(txtNum2.getText() + 9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtNum2.setText(txtNum2.getText() + 0);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomActionPerformed
        if (!txtNum1.getText().isEmpty() && !txtNum2.getText().isEmpty()) {
            double val1 = Double.parseDouble(txtNum1.getText());
            double val2 = Double.parseDouble(txtNum2.getText());
            double res = op.som(val1, val2);
            txtNum1.setText(String.valueOf(res));
            txtNum2.setText(null);
        } else {
            JOptionPane.showMessageDialog(this, "Insira um numero valido");
        }
    }//GEN-LAST:event_btnSomActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        if (!txtNum1.getText().isEmpty() && !txtNum2.getText().isEmpty()) {
            double val1 = Double.parseDouble(txtNum1.getText());
            double val2 = Double.parseDouble(txtNum2.getText());
            double res = op.sub(val1, val2);
            txtNum1.setText(String.valueOf(res));
            txtNum2.setText(null);
        } else {
            JOptionPane.showMessageDialog(this, "Insira um numero valido");
        }
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        if (!txtNum1.getText().isEmpty() && !txtNum2.getText().isEmpty()) {
            double val1 = Double.parseDouble(txtNum1.getText());
            double val2 = Double.parseDouble(txtNum2.getText());
            double res = op.mul(val1, val2);
            txtNum1.setText(String.valueOf(res));
            txtNum2.setText(null);
        } else {
            JOptionPane.showMessageDialog(this, "Insira um numero valido");
        }
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        if (!txtNum1.getText().isEmpty() && !txtNum2.getText().isEmpty()) {
            double val1 = Double.parseDouble(txtNum1.getText());
            double val2 = Double.parseDouble(txtNum2.getText());
            double res = op.div(val1, val2);
            txtNum1.setText(String.valueOf(res));
            txtNum2.setText(null);
        } else {
            JOptionPane.showMessageDialog(this, "Insira um numero valido");
        }
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnPotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotActionPerformed
        if (!txtNum1.getText().isEmpty() && !txtNum2.getText().isEmpty()) {
            double val1 = Double.parseDouble(txtNum1.getText());
            double val2 = Double.parseDouble(txtNum2.getText());
            double res = op.pot(val1, val2);
            txtNum1.setText(String.valueOf(res));
            txtNum2.setText(null);
        } else {
            JOptionPane.showMessageDialog(this, "Insira um numero valido");
        }
    }//GEN-LAST:event_btnPotActionPerformed

    private void btnRaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiActionPerformed
        if (!txtNum2.getText().isEmpty()) {
            double val1 = Double.parseDouble(txtNum2.getText());
            txtNum1.setText(String.valueOf(op.rai(val1)));
            txtNum2.setText(null);
        } else {
            JOptionPane.showMessageDialog(this, "Insira um numero valido");
        }
    }//GEN-LAST:event_btnRaiActionPerformed

    private void btnResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResActionPerformed
        btnRes.setEnabled(true);
    }//GEN-LAST:event_btnResActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtNum1.setText(null);
        txtNum2.setText(null);
    }//GEN-LAST:event_btnCActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginJFrame log = new LoginJFrame();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CalculatorJFrame().setVisible(true);
                
                CalculatorJFrame calJF = new CalculatorJFrame();
                calJF.setVisible(true);
                calJF.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnPot;
    private javax.swing.JButton btnRai;
    private javax.swing.JButton btnRes;
    private javax.swing.JButton btnSom;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel lblApont;
    private javax.swing.JLabel lblApont1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    // End of variables declaration//GEN-END:variables
}
