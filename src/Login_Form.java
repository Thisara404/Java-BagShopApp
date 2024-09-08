public class Login_Form extends javax.swing.JFrame {
    public Login_Form() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        Username_TXT = new javax.swing.JTextField();
        Username_lbl = new javax.swing.JLabel();
        paswrd_lbl = new javax.swing.JLabel();
        Paswd_txt = new javax.swing.JTextField();
        Show_btn = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        login_btn.setBackground(new java.awt.Color(51, 102, 255));
        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        reset_btn.setBackground(new java.awt.Color(51, 102, 255));
        reset_btn.setText("Reset");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });

        Username_TXT.setBackground(new java.awt.Color(0, 102, 255));
        Username_TXT.setText("Enter User Name");
        Username_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_TXTActionPerformed(evt);
            }
        });

        Username_lbl.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Username_lbl.setForeground(new java.awt.Color(0, 0, 0));
        Username_lbl.setText("User Name :");

        paswrd_lbl.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        paswrd_lbl.setForeground(new java.awt.Color(0, 0, 0));
        paswrd_lbl.setText("Password :");

        Paswd_txt.setBackground(new java.awt.Color(0, 102, 255));
        Paswd_txt.setText("Enter Your Password");
        Paswd_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Paswd_txtActionPerformed(evt);
            }
        });

        Show_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Show_btn.setForeground(new java.awt.Color(102, 102, 102));
        Show_btn.setText("Show");
        Show_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Show_btn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(paswrd_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(Username_lbl)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Username_TXT)
                            .addComponent(Paswd_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_lbl)
                    .addComponent(Username_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paswrd_lbl)
                    .addComponent(Paswd_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Show_btn)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Login Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        String username = Username_TXT.getText();
    String password = Paswd_txt.getText();

    // Assuming "admin" is the username and password for Admin and "cashier" for Cashier
    if (username.equals("Admin") && password.equals("Admin123")) {
        // Redirect to Admin GUI
        new little_bag_shop_Admin().setVisible(true);
        this.dispose();  // Close the login form
    } else if (username.equals("Cashier") && password.equals("Cashier123")) {
        // Redirect to Cashier GUI
        new bag_shop_Cahier().setVisible(true);
        this.dispose();  // Close the login form
    } else {
        // Show error message if login details are invalid
        javax.swing.JOptionPane.showMessageDialog(this, "Invalid login details", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_login_btnActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        // Reset the text fields to their default states
    Username_TXT.setText("");  // Clear the username field
    Paswd_txt.setText("");     // Clear the password field
    }//GEN-LAST:event_reset_btnActionPerformed

    private void Username_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_TXTActionPerformed

    private void Paswd_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Paswd_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Paswd_txtActionPerformed

    private void Show_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Show_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Paswd_txt;
    private javax.swing.JCheckBox Show_btn;
    private javax.swing.JTextField Username_TXT;
    private javax.swing.JLabel Username_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel paswrd_lbl;
    private javax.swing.JButton reset_btn;
    // End of variables declaration//GEN-END:variables
}
