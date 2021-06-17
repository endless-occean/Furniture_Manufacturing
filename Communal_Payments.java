package furniture_manufacturing;

import java.sql.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Communal_Payments extends javax.swing.JFrame {

    public Communal_Payments() {
        initComponents();
        SelectMed();
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public void SelectMed(){
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Furniture_Manufacturing", "User1", "7755");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.COMMUNAL_PAYMENTS");
            Communal_Payments_Tbl.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CloseAppBtn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NameServiceCb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ConsumedTxt = new javax.swing.JTextField();
        CostTxt = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Communal_Payments_Tbl = new javax.swing.JTable();
        TariffTxt = new javax.swing.JTextField();
        UnitsLbl = new javax.swing.JLabel();
        Units = new javax.swing.JLabel();
        IdTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Коммунальные платежи");

        CloseAppBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CloseAppBtn.setForeground(new java.awt.Color(255, 255, 255));
        CloseAppBtn.setText("x");
        CloseAppBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseAppBtnMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Вернуться");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CloseAppBtn)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CloseAppBtn)
                    .addComponent(jLabel10))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Наименование услуги");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Тарифная ставка");

        NameServiceCb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        NameServiceCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Электроэнергия", "Водоотведение", "Водоснабжение", "Сбор и вывоз ТКО", "Захоронение ТКО", "Газ горючий природный", "Транспортировка газа" }));
        NameServiceCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameServiceCbActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Объём потребляемых ресурсов");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Месячная стоимость услуги");

        ConsumedTxt.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        ConsumedTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsumedTxtActionPerformed(evt);
            }
        });

        CostTxt.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        SaveBtn.setBackground(new java.awt.Color(102, 0, 0));
        SaveBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Сохранить");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setBackground(new java.awt.Color(102, 0, 0));
        UpdateBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Изменить");
        UpdateBtn.setToolTipText("");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(102, 0, 0));
        ClearBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setText("Очистить ");
        ClearBtn.setToolTipText("");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(102, 0, 0));
        DeleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Удалить");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        Communal_Payments_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Код", "Наименование услуги", "Тарифная ставка", "Потреблённое", "20% налоговая ставка", "Стоимость"
            }
        ));
        Communal_Payments_Tbl.setRowHeight(25);
        Communal_Payments_Tbl.setSelectionBackground(new java.awt.Color(102, 51, 0));
        Communal_Payments_Tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Communal_Payments_TblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Communal_Payments_Tbl);

        TariffTxt.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        TariffTxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TariffTxtCaretUpdate(evt);
            }
        });

        UnitsLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UnitsLbl.setText("...");

        Units.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Units.setText("...");

        IdTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Код");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameServiceCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TariffTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UnitsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(IdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CostTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ConsumedTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Units, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(106, 106, 106))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(IdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameServiceCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TariffTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UnitsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ConsumedTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Units, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CostTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ClearBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if(IdTxt.getText().isEmpty() || ConsumedTxt.getText().isEmpty() || CostTxt.getText().isEmpty() || TariffTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Все поля должны быть заполнены");
        }
        else{
            double result = Double.parseDouble(ConsumedTxt.getText()) * Double.parseDouble(TariffTxt.getText()) * 0.2;
            String allowance = new DecimalFormat("#0.00").format(result);
            double  cost = Double.parseDouble(ConsumedTxt.getText()) * Double.parseDouble(TariffTxt.getText()) * 1.2;
            String total = new DecimalFormat("#0.00").format(cost);
            CostTxt.setText(total);
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Furniture_Manufacturing", "User1", "7755");
                String UpdateQuery = "Update User1.COMMUNAL_PAYMENTS set NAME_SERVICE = '" + NameServiceCb.getSelectedItem() + "', TARIFF = " + TariffTxt.getText() +", CONCUMED = " + ConsumedTxt.getText() + ", ALLOWANCE = '" + allowance + "', COST_CP = '" + total + "' where ID_CP = " + IdTxt.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Запись успешно обновлена");
                SelectMed();
                IdTxt.setText("");
                ConsumedTxt.setText("");
                CostTxt.setText("");
                TariffTxt.setText("");
                UnitsLbl.setText("");
                Units.setText("");
            } catch(SQLException e){
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_UpdateBtnMouseClicked
    
    
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        
        double result = Double.parseDouble(ConsumedTxt.getText()) * Double.parseDouble(TariffTxt.getText()) * 0.2;
        String allowance = new DecimalFormat("#0.00").format(result);     
        
        double  cost = Double.parseDouble(ConsumedTxt.getText()) * Double.parseDouble(TariffTxt.getText()) * 1.2;
        String total = new DecimalFormat("#0.00").format(cost);
        CostTxt.setText(total);
        
       /* String ConsumedStr = ConsumedTxt.getText();
    try {
        Double consumed = Double.valueOf(ConsumedStr);
        System.out.println(consumed);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Неверный формат строки!");
    }*/

        if (IdTxt.getText().isEmpty() || ConsumedTxt.getText().isEmpty() || CostTxt.getText().isEmpty() || TariffTxt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Пожалуйста, заполните все поля");
        }
        else {
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Furniture_Manufacturing", "User1", "7755");
                PreparedStatement add = Con.prepareStatement("insert into COMMUNAL_PAYMENTS values (?,?,?,?,?,?)");
                add.setInt(1, Integer.valueOf(IdTxt.getText()));
                add.setString(2, NameServiceCb.getSelectedItem().toString());
                add.setString(3, TariffTxt.getText());
                add.setString(4, ConsumedTxt.getText());
                add.setString(5, allowance);
                add.setString(6, CostTxt.getText());
                
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Новая запись успешно внесена в базу");
                Con.close();
                SelectMed();
                IdTxt.setText("");
                ConsumedTxt.setText("");
                CostTxt.setText("");
                TariffTxt.setText("");
                UnitsLbl.setText("");
                Units.setText("");
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        IdTxt.setText("");
        ConsumedTxt.setText("");
        CostTxt.setText("");
        TariffTxt.setText("");
        UnitsLbl.setText("");
        Units.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if (IdTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Пожалуйста, выберите запись для удаления");
        }
        else {
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Furniture_Manufacturing", "User1", "7755");
                String Id = IdTxt.getText();
                String Query = "Delete from User1.COMMUNAL_PAYMENTS where ID_CP =" + Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectMed();
                JOptionPane.showMessageDialog(this, "Запись успешно удалена из базы");
                IdTxt.setText("");
                ConsumedTxt.setText("");
                CostTxt.setText("");
                TariffTxt.setText("");
                UnitsLbl.setText("");
                Units.setText("");
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void NameServiceCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameServiceCbActionPerformed
         switch(NameServiceCb.getSelectedIndex()){
            case 0:
                TariffTxt.setText("7.96");
                UnitsLbl.setText("руб/(кВт/ч)");
                Units.setText("кВт/ч");
                break;
            case 1:
                TariffTxt.setText("24.74");
                UnitsLbl.setText("руб/м³");
                Units.setText("м³");
                break;
            case 2:
                TariffTxt.setText("35.42");
                UnitsLbl.setText("руб/м³");
                Units.setText("м³");
                break;
            
            case 3:
                TariffTxt.setText("216.54");
                UnitsLbl.setText("руб/м³");
                Units.setText("м³");
                break;
            case 4:
                TariffTxt.setText("53.73");
                UnitsLbl.setText("руб/м³");
                Units.setText("м³");
                break;
            case 5:
                TariffTxt.setText("5719.45");
                UnitsLbl.setText("руб/(10³ м)");
                Units.setText("10³ м");
                break;
            case 6:
                TariffTxt.setText("919.15");
                UnitsLbl.setText("руб/(10³м)");
                Units.setText("10³м");
                break;
         } 
    }//GEN-LAST:event_NameServiceCbActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void ConsumedTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsumedTxtActionPerformed
        double  cost = Double.parseDouble(ConsumedTxt.getText()) * Double.parseDouble(TariffTxt.getText()) * 1.2;
        String total = new DecimalFormat("#0.00").format(cost);
        CostTxt.setText(total);
    }//GEN-LAST:event_ConsumedTxtActionPerformed

    private void Communal_Payments_TblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Communal_Payments_TblMouseClicked
        DefaultTableModel model = (DefaultTableModel)Communal_Payments_Tbl.getModel();
        int Myindex = Communal_Payments_Tbl.getSelectedRow();
        IdTxt.setText(model.getValueAt(Myindex, 0).toString());
        TariffTxt.setText(model.getValueAt(Myindex, 2).toString());
        ConsumedTxt.setText(model.getValueAt(Myindex, 3).toString());
        CostTxt.setText(model.getValueAt(Myindex, 5).toString());
    }//GEN-LAST:event_Communal_Payments_TblMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Accountant().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void TariffTxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TariffTxtCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_TariffTxtCaretUpdate

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
            java.util.logging.Logger.getLogger(Communal_Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Communal_Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Communal_Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Communal_Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Communal_Payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel CloseAppBtn;
    private javax.swing.JTable Communal_Payments_Tbl;
    private javax.swing.JTextField ConsumedTxt;
    private javax.swing.JTextField CostTxt;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField IdTxt;
    private javax.swing.JComboBox<String> NameServiceCb;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField TariffTxt;
    private javax.swing.JLabel Units;
    private javax.swing.JLabel UnitsLbl;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
