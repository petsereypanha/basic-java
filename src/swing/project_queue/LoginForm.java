package swing.project_queue;

import Project_Queue.Delivery;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        List_Account.listAccount.add(new List_Account("Serey","123"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSingUp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        s = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSingIn = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        pasPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(993, 588));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setText("HELLO AGAIN!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 60, 320, 70);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setText("WELCOME TO OUR MEMBER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 220, 330, 30);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Don't have an account?");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 380, 170, 30);

        btnSingUp.setBackground(new java.awt.Color(255, 102, 153));
        btnSingUp.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnSingUp.setText("SING UP");
        btnSingUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSingUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSingUp);
        btnSingUp.setBounds(140, 420, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 590);

        jPanel2.setBackground(new java.awt.Color(255, 153, 204));
        jPanel2.setLayout(null);

        s.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        s.setText("SING IN YOUR ACCOUNT");
        jPanel2.add(s);
        s.setBounds(140, 130, 300, 40);

        jLabel4.setFont(new java.awt.Font("Al Bayan", 0, 14)); // NOI18N
        jLabel4.setText("Password :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 320, 80, 30);

        jLabel5.setFont(new java.awt.Font("Al Bayan", 0, 14)); // NOI18N
        jLabel5.setText("Username :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 220, 80, 30);

        btnSingIn.setBackground(new java.awt.Color(255, 102, 153));
        btnSingIn.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnSingIn.setText("SING IN");
        btnSingIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSingInActionPerformed(evt);
            }
        });
        jPanel2.add(btnSingIn);
        btnSingIn.setBounds(130, 430, 300, 40);

        txtName.setBackground(new java.awt.Color(255, 153, 204));
        txtName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 153)));
        jPanel2.add(txtName);
        txtName.setBounds(140, 220, 300, 27);

        pasPassword.setBackground(new java.awt.Color(255, 153, 204));
        pasPassword.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        pasPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 102)));
        jPanel2.add(pasPassword);
        pasPassword.setBounds(130, 330, 310, 19);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(450, 0, 540, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSingInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingInActionPerformed
        String username = txtName.getText();
        String password = String.valueOf(pasPassword.getPassword());
        boolean isUserName = false;
        boolean isPassword = false;
        for(var i=0; i < List_Account.listAccount.size();i++){
            if(username.equals(List_Account.listAccount.get(i).getUsername())){
                isUserName=true;
            }
            if(password.equals(List_Account.listAccount.get(i).getPassword())){
                isPassword=true;
            }
        }
        if(isPassword==true && isUserName==true){
            JOptionPane.showMessageDialog(null, "Wellcome to user login.");
            MenuPay de = new MenuPay();
            de.setVisible(true);
            dispose();
        }
        if(isPassword==false && isUserName==true){
            JOptionPane.showMessageDialog(null, "Incorrect UserName ..!","SING IN",JOptionPane.ERROR_MESSAGE);
        }
        if(isPassword==true && isUserName==false){
            JOptionPane.showMessageDialog(null, "Incorrect PassWord ..!","SING IN",JOptionPane.ERROR_MESSAGE);
        }
        if(isPassword==false && isUserName==false){
            JOptionPane.showMessageDialog(null, "Incorrect UserName And PassWord..!","SING IN",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSingInActionPerformed

    private void btnSingUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingUpActionPerformed
       RegisterForm up = new RegisterForm();
       up.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnSingUpActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSingIn;
    private javax.swing.JButton btnSingUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pasPassword;
    private javax.swing.JLabel s;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
