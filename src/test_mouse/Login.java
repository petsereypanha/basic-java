package test_mouse;

import javax.swing.plaf.ProgressBarUI;
public class Login extends javax.swing.JFrame implements Runnable{
    public Login() {
        
        initComponents();
        Thread t = new Thread(this);
        t.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        myprogressbar = new javax.swing.JProgressBar();
        lbl_count = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(952, 764));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        jPanel1.add(myprogressbar);
        myprogressbar.setBounds(130, 390, 690, 30);
        jPanel1.add(lbl_count);
        lbl_count.setBounds(470, 350, 150, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/sereypanha/Documents/CodeStudy/Java/Photo/Curve-Loading.gif")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 150, 880, 200);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_count;
    private javax.swing.JProgressBar myprogressbar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        for(int i=1 ; i<=100;i++){
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
            lbl_count.setText(i+" % ");
            myprogressbar.setValue(i);
        }
        dispose();
    }
}
