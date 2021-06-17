package furniture_manufacturing;

public class ComDirect extends javax.swing.JFrame {

    public ComDirect() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Fittings_Btn = new javax.swing.JButton();
        Slab_Material_Btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CloseAppBtn = new javax.swing.JLabel();
        Suppliers_Btn = new javax.swing.JButton();
        AuthorizationBtn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Fittings_Btn.setBackground(new java.awt.Color(102, 0, 0));
        Fittings_Btn.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        Fittings_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Fittings_Btn.setText("Фурнитура");
        Fittings_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fittings_BtnActionPerformed(evt);
            }
        });

        Slab_Material_Btn.setBackground(new java.awt.Color(102, 0, 0));
        Slab_Material_Btn.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        Slab_Material_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Slab_Material_Btn.setText("Плитный материал");
        Slab_Material_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slab_Material_BtnActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ekate\\OneDrive\\Рабочий стол\\Java\\Furniture_Manufacturing\\5.jpg")); // NOI18N

        CloseAppBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CloseAppBtn.setForeground(new java.awt.Color(102, 102, 102));
        CloseAppBtn.setText("x");
        CloseAppBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseAppBtnMouseClicked(evt);
            }
        });

        Suppliers_Btn.setBackground(new java.awt.Color(102, 0, 0));
        Suppliers_Btn.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        Suppliers_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Suppliers_Btn.setText("Поставщики");
        Suppliers_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Suppliers_BtnActionPerformed(evt);
            }
        });

        AuthorizationBtn3.setBackground(new java.awt.Color(204, 204, 204));
        AuthorizationBtn3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        AuthorizationBtn3.setForeground(new java.awt.Color(102, 0, 0));
        AuthorizationBtn3.setText("Товар");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CloseAppBtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AuthorizationBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Slab_Material_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Fittings_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Suppliers_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(CloseAppBtn)
                .addGap(19, 19, 19)
                .addComponent(Suppliers_Btn)
                .addGap(46, 46, 46)
                .addComponent(AuthorizationBtn3)
                .addGap(18, 18, 18)
                .addComponent(Fittings_Btn)
                .addGap(18, 18, 18)
                .addComponent(Slab_Material_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseAppBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseAppBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseAppBtnMouseClicked

    private void Slab_Material_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slab_Material_BtnActionPerformed
        new Slab_Material().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Slab_Material_BtnActionPerformed

    private void Suppliers_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Suppliers_BtnActionPerformed
        new Suppliers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Suppliers_BtnActionPerformed

    private void Fittings_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fittings_BtnActionPerformed
        new Fittings().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Fittings_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(ComDirect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComDirect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComDirect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComDirect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComDirect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AuthorizationBtn3;
    private javax.swing.JLabel CloseAppBtn;
    private javax.swing.JButton Fittings_Btn;
    private javax.swing.JButton Slab_Material_Btn;
    private javax.swing.JButton Suppliers_Btn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
