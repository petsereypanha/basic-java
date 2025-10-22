package test_mouse;
public class Digital_Clock extends javax.swing.JFrame implements Runnable{
    
    int hour,second,minute;
    int day,month,year;
    String timestr,yearstr;
    public Digital_Clock() {
        initComponents();
        Thread t = new Thread(this);
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(721, 481));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 51, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Digital Clock");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(184, 45, 245, 66);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 6, 721, 185);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Current Time :");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(21, 20, 99, 17);

        lbTime.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbTime.setForeground(new java.awt.Color(51, 0, 51));
        lbTime.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.add(lbTime);
        lbTime.setBounds(144, 43, 381, 40);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Current Data :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(21, 118, 96, 17);

        lbDate.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbDate.setForeground(new java.awt.Color(51, 0, 51));
        lbDate.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.add(lbDate);
        lbDate.setBounds(140, 140, 390, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 160, 720, 290);

        jPanel1.setBackground(new java.awt.Color(255, 51, 255));
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setText("Digital Clock");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(283, 41, 149, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 160);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Digital_Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Digital_Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Digital_Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Digital_Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Digital_Clock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbTime;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {            
            try {
                
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
    }
}
