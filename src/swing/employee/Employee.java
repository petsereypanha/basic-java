package swing.employee;

import javax.swing.table.DefaultTableModel;

public class Employee extends javax.swing.JFrame {
    DefaultTableModel model;
    public Employee() {
        initComponents();
        model = (DefaultTableModel)ttTable.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtGender = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        rbFemale = new javax.swing.JRadioButton();
        rbMale = new javax.swing.JRadioButton();
        cbPosition = new javax.swing.JComboBox<>();
        btnSvae = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ttTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        cbSearch = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1092, 653));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("HeadLineA", 0, 48)); // NOI18N
        jLabel1.setText("Employee Information");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 0, 401, 140);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1090, 140);

        jPanel2.setBackground(new java.awt.Color(153, 102, 255));
        jPanel2.setLayout(null);

        txtGender.setFont(new java.awt.Font("ITF Devanagari Marathi", 0, 14)); // NOI18N
        txtGender.setText("Gender     :");
        jPanel2.add(txtGender);
        txtGender.setBounds(30, 180, 80, 22);

        jLabel3.setFont(new java.awt.Font("Mshtakan", 0, 14)); // NOI18N
        jLabel3.setText("Name    :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 120, 80, 17);

        jLabel4.setFont(new java.awt.Font("ITF Devanagari Marathi", 0, 14)); // NOI18N
        jLabel4.setText("Position    :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 240, 70, 22);

        jLabel7.setFont(new java.awt.Font("ITF Devanagari Marathi", 0, 14)); // NOI18N
        jLabel7.setText("ID            :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 50, 70, 22);

        txtName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(130, 110, 260, 29);

        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtId);
        txtId.setBounds(130, 40, 260, 29);

        buttonGroup1.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        rbFemale.setText("Female");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });
        jPanel2.add(rbFemale);
        rbFemale.setBounds(270, 180, 103, 18);

        buttonGroup1.add(rbMale);
        rbMale.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });
        jPanel2.add(rbMale);
        rbMale.setBounds(160, 180, 54, 18);

        cbPosition.setFont(new java.awt.Font("ITF Devanagari Marathi", 0, 14)); // NOI18N
        cbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Web Developer", "Flutter Developer", "IT Support", "API Developer", " ", " " }));
        cbPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPositionActionPerformed(evt);
            }
        });
        jPanel2.add(cbPosition);
        cbPosition.setBounds(130, 240, 260, 32);

        btnSvae.setBackground(new java.awt.Color(51, 102, 255));
        btnSvae.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnSvae.setText("Save");
        btnSvae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSvaeActionPerformed(evt);
            }
        });
        jPanel2.add(btnSvae);
        btnSvae.setBounds(420, 430, 100, 30);

        btnUpdate.setBackground(new java.awt.Color(0, 102, 255));
        btnUpdate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);
        btnUpdate.setBounds(610, 430, 100, 30);

        btnRemove.setBackground(new java.awt.Color(51, 102, 255));
        btnRemove.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemove);
        btnRemove.setBounds(800, 430, 90, 30);

        btnExit.setBackground(new java.awt.Color(255, 51, 51));
        btnExit.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit);
        btnExit.setBounds(990, 430, 80, 30);

        jPanel3.setBackground(new java.awt.Color(0, 204, 153));
        jPanel3.setLayout(null);

        taAddress.setColumns(20);
        taAddress.setRows(5);
        jScrollPane1.setViewportView(taAddress);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(130, 370, 260, 90);

        jLabel6.setFont(new java.awt.Font("ITF Devanagari Marathi", 0, 14)); // NOI18N
        jLabel6.setText("Address    :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 400, 80, 22);

        txtSalary.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });
        jPanel3.add(txtSalary);
        txtSalary.setBounds(130, 310, 260, 29);

        jLabel5.setFont(new java.awt.Font("ITF Devanagari Marathi", 0, 14)); // NOI18N
        jLabel5.setText("Salary      :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 320, 70, 22);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 400, 510);

        ttTable.setBackground(new java.awt.Color(255, 255, 255));
        ttTable.setFont(new java.awt.Font("Gurmukhi MT", 0, 12)); // NOI18N
        ttTable.setForeground(new java.awt.Color(0, 0, 0));
        ttTable.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Position", "Salary", "Address"
            }
        ));
        ttTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ttTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ttTable);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(420, 110, 650, 270);

        txtSearch.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel2.add(txtSearch);
        txtSearch.setBounds(630, 50, 230, 29);

        cbSearch.setFont(new java.awt.Font("ITF Devanagari Marathi", 0, 14)); // NOI18N
        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search Option ", "Search Option ID", "Search Option Name", " " }));
        jPanel2.add(cbSearch);
        cbSearch.setBounds(890, 50, 170, 32);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 140, 1090, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Gata(){
        model.setRowCount(0);
        for(var i=0;i<Employee_Form.list_Employee.size();i++){
            Object row[] ={
                Employee_Form.list_Employee.get(i).getId(),
                Employee_Form.list_Employee.get(i).getName(),
                Employee_Form.list_Employee.get(i).getGender(),
                Employee_Form.list_Employee.get(i).getPosition(),
                Employee_Form.list_Employee.get(i).getSalary(),
                Employee_Form.list_Employee.get(i).getAddress(),
            };
            model.addRow(row);
        }
    }
    
    private void Clear(){
        txtId.setText("");
        txtName.setText("");
        buttonGroup1.clearSelection();
        cbPosition.setSelectedIndex(0); 
        txtSalary.setText("");
        taAddress.setText("");
    }
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void cbPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPositionActionPerformed

    private void btnSvaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSvaeActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String gender = (rbMale.isSelected()) ? "Male" : "Female";
        String position = (cbPosition.getSelectedItem().toString());
        float salary = Float.parseFloat(txtSalary.getText());
        String address = (taAddress.getText());
        
        Employee_Form.list_Employee.add(new Employee_Form(id, name, gender, position, address, salary));
        Gata();
        Clear();
    }//GEN-LAST:event_btnSvaeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       int id = Integer.parseInt(txtId.getText());
       String name = txtName.getText();
       String gender = (rbMale.isSelected()) ? "Male" : "Female";
       String position = (cbPosition.getSelectedItem().toString());
       float salary = Float.parseFloat(txtSalary.getText());
       String address = (taAddress.getText());
       
       int index = ttTable.getSelectedRow();
       Employee_Form.list_Employee.set(index,new Employee_Form(id, name, gender, position, address, salary));
       Gata();
       Clear();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int index = ttTable.getSelectedRow();
        Employee_Form.list_Employee.remove(index);
        Gata();
        Clear();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void ttTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ttTableMouseClicked
        int row = ttTable.getSelectedRow();
        txtId.setText(model.getValueAt(row, 0).toString());
        txtName.setText(model.getValueAt(row, 1).toString());
        String gender = model.getValueAt(row, 2).toString();
        if(gender.equals("Male")){
            rbMale.setSelected(true);
        }else{
            rbFemale.setSelected(true);
        }
        String position = model.getValueAt(row, 3).toString();
        if(position.equals("Web Developer")){
            cbPosition.setSelectedIndex(0);
        }else if(position.equals("Flutter Developer")){
            cbPosition.setSelectedIndex(1);
        }else if(position.equals("IT Support")){
            cbPosition.setSelectedIndex(2);
        }else {
            cbPosition.setSelectedIndex(3);
        }
        txtSalary.setText(model.getValueAt(row, 4).toString());
        taAddress.setText(model.getValueAt(row, 5).toString());
    }//GEN-LAST:event_ttTableMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
       
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
       int index = cbPosition.getSelectedIndex();
        switch (index) {
            case 1 -> {
                boolean b=false;
                int sid = Integer.parseInt(txtSearch.getText());
                for(var i=0;i<Employee_Form.list_Employee.size();i++){
                    if(sid==Employee_Form.list_Employee.get(i).getId()){
                        model.setRowCount(0);
                        Object row[]={
                            Employee_Form.list_Employee.get(i).getId(),
                            Employee_Form.list_Employee.get(i).getName(),
                            Employee_Form.list_Employee.get(i).getGender(),
                            Employee_Form.list_Employee.get(i).getPosition(),
                            Employee_Form.list_Employee.get(i).getSalary(),
                            Employee_Form.list_Employee.get(i).getAddress(),
                        };
                        model.addRow(row);
                        b=true;
                    }
                }
                if(b==false){
                    model.setRowCount(0);
                    Gata();
                }
            }
            case 2 ->{
                boolean b = false;
                int sid = Integer.parseInt(txtSearch.getText());
                for(var i=0;i<Employee_Form.list_Employee.size();i++){
                    if(sid==Employee_Form.list_Employee.get(i).getId()){
                        model.setRowCount(0);
                        Object row[]={
                            Employee_Form.list_Employee.get(i).getId(),
                            Employee_Form.list_Employee.get(i).getName(),
                            Employee_Form.list_Employee.get(i).getGender(),
                            Employee_Form.list_Employee.get(i).getPosition(),
                            Employee_Form.list_Employee.get(i).getSalary(),
                            Employee_Form.list_Employee.get(i).getAddress(),
                        };
                        model.addRow(row);
                        b=true;
                    }
                }
                if(b==false){
                    model.setRowCount(0);
                    Gata();
                }
            }

        }
    }//GEN-LAST:event_txtSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSvae;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbPosition;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JTable ttTable;
    private javax.swing.JLabel txtGender;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
