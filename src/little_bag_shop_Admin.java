public class little_bag_shop_Admin extends javax.swing.JFrame {
    public little_bag_shop_Admin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        DashboardAdmin = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Createcashier_btn = new javax.swing.JButton();
        AddnewBags_btn = new javax.swing.JButton();
        Deletebags_btn = new javax.swing.JButton();
        ViewallBags_btn = new javax.swing.JButton();
        Bag_Shop_lbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1920, 1080));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1080, 560));

        DashboardAdmin.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(jLabel1)
                .addContainerGap(430, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DashboardAdminLayout = new javax.swing.GroupLayout(DashboardAdmin);
        DashboardAdmin.setLayout(DashboardAdminLayout);
        DashboardAdminLayout.setHorizontalGroup(
            DashboardAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DashboardAdminLayout.setVerticalGroup(
            DashboardAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardAdminLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 586, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Createcashier_btn.setBackground(new java.awt.Color(102, 102, 255));
        Createcashier_btn.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Createcashier_btn.setText("Create Cashier Account");
        Createcashier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Createcashier_btnActionPerformed(evt);
            }
        });

        AddnewBags_btn.setBackground(new java.awt.Color(102, 102, 255));
        AddnewBags_btn.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        AddnewBags_btn.setText("Add New Bags");
        AddnewBags_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddnewBags_btnActionPerformed(evt);
            }
        });

        Deletebags_btn.setBackground(new java.awt.Color(102, 102, 255));
        Deletebags_btn.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Deletebags_btn.setText("Delete Bags");
        Deletebags_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deletebags_btnActionPerformed(evt);
            }
        });

        ViewallBags_btn.setBackground(new java.awt.Color(102, 102, 255));
        ViewallBags_btn.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ViewallBags_btn.setText("View all Bags");
        ViewallBags_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewallBags_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Createcashier_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Deletebags_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddnewBags_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewallBags_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ViewallBags_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddnewBags_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Deletebags_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Createcashier_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Bag_Shop_lbl.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        Bag_Shop_lbl.setForeground(new java.awt.Color(51, 255, 255));
        Bag_Shop_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bag_Shop_lbl.setText("Bag Shop");
        Bag_Shop_lbl.setAlignmentY(0.0F);
        Bag_Shop_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bag_Shop_lbl.setName(""); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bag_Shop_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Bag_Shop_lbl)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DashboardAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DashboardAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ViewallBags_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewallBags_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewallBags_btnActionPerformed

    private void Createcashier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Createcashier_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Createcashier_btnActionPerformed

    private void AddnewBags_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddnewBags_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddnewBags_btnActionPerformed

    private void Deletebags_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deletebags_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Deletebags_btnActionPerformed

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
            java.util.logging.Logger.getLogger(little_bag_shop_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(little_bag_shop_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(little_bag_shop_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(little_bag_shop_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new little_bag_shop_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddnewBags_btn;
    private javax.swing.JLabel Bag_Shop_lbl;
    private javax.swing.JButton Createcashier_btn;
    private javax.swing.JPanel DashboardAdmin;
    private javax.swing.JButton Deletebags_btn;
    private javax.swing.JButton ViewallBags_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
