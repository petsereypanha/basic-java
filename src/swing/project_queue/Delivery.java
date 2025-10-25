package swing.project_queue;

import Project_Queue.*;              //  Queue in Data Structure and Algorithim
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Delivery extends javax.swing.JFrame {

    queue a = new queue();
    DefaultTableModel model;
    int size = 0;
    
    public Delivery() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        btnSetSize = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQueue = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnEnterQueue = new javax.swing.JButton();
        btnDeleteQueue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1023, 585));
        setSize(new java.awt.Dimension(1023, 591));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/sereypanha/Documents/CodeStudy/Java/Photo/hosting-server-removebg-preview.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Baloo Bhaijaan", 0, 36)); // NOI18N
        jLabel2.setText("Enter Your Desire Destination For DeliVery");

        txtSize.setBackground(new java.awt.Color(0, 102, 102));
        txtSize.setFont(new java.awt.Font("Baloo Bhaina 2", 0, 14)); // NOI18N
        txtSize.setForeground(new java.awt.Color(0, 0, 0));
        txtSize.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 0, 204)));
        txtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizeActionPerformed(evt);
            }
        });

        btnSetSize.setBackground(new java.awt.Color(0, 0, 204));
        btnSetSize.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnSetSize.setText("Set Size");
        btnSetSize.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 102, 255)));
        btnSetSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetSizeActionPerformed(evt);
            }
        });

        tbQueue.setAutoCreateRowSorter(true);
        tbQueue.setForeground(new java.awt.Color(0, 0, 255));
        tbQueue.setModel(new DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Queue"
            }
        ));
        jScrollPane1.setViewportView(tbQueue);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Baloo Bhaina 2", 0, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnEnterQueue.setBackground(new java.awt.Color(102, 51, 255));
        btnEnterQueue.setFont(new java.awt.Font("Baloo Bhaina 2", 0, 14)); // NOI18N
        btnEnterQueue.setText("Enter Queue");
        btnEnterQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterQueueActionPerformed(evt);
            }
        });

        btnDeleteQueue.setBackground(new java.awt.Color(153, 0, 0));
        btnDeleteQueue.setFont(new java.awt.Font("Baloo Bhaina 2", 0, 14)); // NOI18N
        btnDeleteQueue.setText("DeleteQueue");
        btnDeleteQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteQueueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSize)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnSetSize, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEnterQueue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDeleteQueue)))))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSetSize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEnterQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSizeActionPerformed

    private void btnSetSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetSizeActionPerformed

        try {
        int p= Integer.parseInt(txtSize.getText());
        if(p!=0 && p<200){
               size = p;
               a = new queue(p);
               model = new DefaultTableModel();
               model.addColumn("Queue    Size :" +p);
               for(int i=0; i<=p; i++){
                   model.addRow(new Object[]{""});
               }
               tbQueue.setModel(model);
           } 
       } catch (Exception e){
           JOptionPane.showMessageDialog(null, "Kindly enter valid number ");
       }
       txtSize.setText(""); 
    }//GEN-LAST:event_btnSetSizeActionPerformed

    private void btnDeleteQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteQueueActionPerformed
        a.dequeue();
        refresh();
    }//GEN-LAST:event_btnDeleteQueueActionPerformed
    private void refresh(){
        Object []q = a.update();
        for(var i = 0; i<size; i++){
            tbQueue.setValueAt(" ", i, 0);
        }
        for(var i=0; i<=a.rear-1; i++){
            tbQueue.setValueAt(q[i], i, 0);
        }
    }
    private void btnEnterQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterQueueActionPerformed
        a.enqueue(this.txtSize.getText());
        this.txtSize.setText("");
        DefaultTableModel model = (DefaultTableModel) tbQueue.getModel();
        model.addRow(new  Object[]{txtSize.getText()});
        refresh();
        txtSize.setText("");
    }//GEN-LAST:event_btnEnterQueueActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuPay str = new MenuPay();
        str.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delivery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteQueue;
    private javax.swing.JButton btnEnterQueue;
    private javax.swing.JButton btnSetSize;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbQueue;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
