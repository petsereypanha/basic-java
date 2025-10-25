package swing.project_queue;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;

public class RegisterForm extends javax.swing.JFrame {
    public RegisterForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSingIn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        s = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        pasComfirm = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
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

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("I am a member!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 320, 170, 30);

        btnSingIn.setBackground(new java.awt.Color(255, 102, 153));
        btnSingIn.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnSingIn.setText("SING IN");
        btnSingIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSingInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSingIn);
        btnSingIn.setBounds(120, 370, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 590);

        jPanel2.setBackground(new java.awt.Color(255, 153, 204));
        jPanel2.setLayout(null);

        s.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        s.setText("REGISTER YOUR ACCOUNT");
        jPanel2.add(s);
        s.setBounds(140, 130, 300, 40);

        jLabel4.setFont(new java.awt.Font("Al Bayan", 0, 14)); // NOI18N
        jLabel4.setText("Comfirm Password :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 360, 150, 30);

        jLabel5.setFont(new java.awt.Font("Al Bayan", 0, 14)); // NOI18N
        jLabel5.setText("Username :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 220, 80, 30);

        btnRegister.setBackground(new java.awt.Color(255, 102, 153));
        btnRegister.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnRegister.setText("REGISTER ");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister);
        btnRegister.setBounds(130, 430, 300, 40);

        txtName.setBackground(new java.awt.Color(255, 153, 204));
        txtName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 153)));
        jPanel2.add(txtName);
        txtName.setBounds(200, 220, 300, 30);

        pasComfirm.setBackground(new java.awt.Color(255, 153, 204));
        pasComfirm.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        pasComfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 102)));
        jPanel2.add(pasComfirm);
        pasComfirm.setBounds(200, 360, 310, 30);

        jLabel6.setFont(new java.awt.Font("Al Bayan", 0, 14)); // NOI18N
        jLabel6.setText("Password :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 290, 80, 30);

        pasPassword.setBackground(new java.awt.Color(255, 153, 204));
        pasPassword.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        pasPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 102)));
        jPanel2.add(pasPassword);
        pasPassword.setBounds(200, 290, 310, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(450, 0, 540, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSingInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingInActionPerformed
        LoginForm in = new LoginForm();
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSingInActionPerformed
    
    private void Clear(){
        txtName.setText("");
        pasPassword.setText("");
        pasComfirm.setText(""); 
    }
    
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String username = txtName.getText();
        String password = String.valueOf(pasPassword.getPassword());
        String comfirm_password = String.valueOf(pasComfirm.getPassword());
        if(username.equals("")||password.equals("")||comfirm_password.equals("")){
            JOptionPane.showMessageDialog(null, "Please Input Form","Register",JOptionPane.ERROR_MESSAGE);
        }else{
            if(password.equals(comfirm_password)){
                List_Account.listAccount.add(new List_Account(username,password));
                JOptionPane.showMessageDialog(null, "Register Account Succesful .");
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect Confirm Password !","REGISTER",JOptionPane.ERROR_MESSAGE);
            }
        }
        Clear();
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSingIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pasComfirm;
    private javax.swing.JPasswordField pasPassword;
    private javax.swing.JLabel s;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
