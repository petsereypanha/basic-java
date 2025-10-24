package swing.person;

import javax.swing.table.DefaultTableModel;

public class Person extends javax.swing.JFrame {
    DefaultTableModel model;
    public Person() {
        initComponents();
        model = (DefaultTableModel) ttTable.getModel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        rbFemale = new javax.swing.JRadioButton();
        rbMale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttTable = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(863, 691));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Person Information");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 50, 240, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 860, 140);

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Gender  :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 300, 70, 17);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Age     :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 400, 60, 17);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("ID          :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 130, 60, 17);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Name     :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 210, 70, 17);

        txtAge.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        jPanel2.add(txtAge);
        txtAge.setBounds(110, 390, 190, 27);

        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtId);
        txtId.setBounds(110, 120, 190, 29);

        txtName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(110, 200, 190, 30);

        buttonGroup1.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        rbFemale.setText("Female");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });
        jPanel2.add(rbFemale);
        rbFemale.setBounds(200, 300, 90, 18);

        buttonGroup1.add(rbMale);
        rbMale.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });
        jPanel2.add(rbMale);
        rbMale.setBounds(110, 300, 103, 18);

        ttTable.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Age"
            }
        ));
        ttTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ttTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ttTable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(306, 120, 540, 300);

        btnExit.setBackground(new java.awt.Color(51, 255, 204));
        btnExit.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit);
        btnExit.setBounds(750, 450, 90, 40);

        btnSave.setBackground(new java.awt.Color(51, 204, 255));
        btnSave.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave);
        btnSave.setBounds(310, 450, 90, 40);

        btnUpdate.setBackground(new java.awt.Color(51, 204, 255));
        btnUpdate.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);
        btnUpdate.setBounds(460, 450, 90, 40);

        btnRemove.setBackground(new java.awt.Color(51, 204, 255));
        btnRemove.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(0, 0, 0));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemove);
        btnRemove.setBounds(610, 450, 90, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 140, 860, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Getdata(){
        model.setRowCount(0);
        for(var i=0;i<ListPerson.listPersons.size();i++){
            Object row[] ={
                ListPerson.listPersons.get(i).getId(),
                ListPerson.listPersons.get(i).getName(),
                ListPerson.listPersons.get(i).getGender(),
                ListPerson.listPersons.get(i).getAge(),     
            };
            model.addRow(row);
        }
    }
    private void clear(){
        txtId.setText("");
        txtName.setText("");
        buttonGroup1.clearSelection();
        txtAge.setText("");
    }
    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String gender = (rbMale.isSelected()) ? "Male" : "Female";
         int age = Integer.parseInt(txtAge.getText());
         
         ListPerson.listPersons.add(new ListPerson(id, name, gender, age));
         Getdata();
         clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       int id = Integer.parseInt(txtId.getText());
       String name = txtName.getText();
       String gender = (rbMale.isSelected()) ? "Male" : "Female";
       int age = Integer.parseInt(txtAge.getText());
       int index = ttTable.getSelectedRow();
       ListPerson.listPersons.set(index,new ListPerson(id, name, gender, age));
       Getdata();
       clear();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int index = ttTable.getSelectedRow();
        ListPerson.listPersons.remove(index);
        Getdata();
        clear();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void ttTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ttTableMouseClicked
        int row = ttTable.getSelectedRow();
        txtId.setText(model.getValueAt(row, 0).toString());
        txtName.setText(model.getValueAt(row, 1).toString());
        String gender = model.getValueAt(row, 2).toString();
        if(gender.equals("Male"))
            rbMale.setSelected(true);
        else
            rbFemale.setSelected(true);
        txtAge.setText(model.getValueAt(row, 3).toString());
    }//GEN-LAST:event_ttTableMouseClicked

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
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Person().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable ttTable;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
