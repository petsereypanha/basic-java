package swing.project_queue;


import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Store extends javax.swing.JFrame {
    private double subtotal=0,tax,ctax=1,tatol, amount;
    DecimalFormat df = new DecimalFormat("##0.0000$");
    public Store (double amount){
        this.amount = amount;
    }
    static ArrayList<Store> listStore = new ArrayList<>();
    public Store() {
        initComponents();
        
        // Intaillize product in arraylist
        ProductModel1.listproduct.add(new ProductModel1(101,"Fanta",0.5f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Fanta.jpg"));      
        ProductModel1.listproduct.add(new ProductModel1(102,"Fanta",0.3f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Aquarus.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(103,"Fanta",0.1f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Bachus.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(104,"Fanta",0.2f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Carabao.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(105,"Fanta",0.6f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Dew.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(106,"Fanta",0.7f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Ize.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(107,"Fanta",0.5f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Joop.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(108,"Fanta",0.8f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Olatte.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(109,"Fanta",0.9f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/pepsi.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(110,"Fanta",0.3f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/RedBull.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(111,"Fanta",0.4f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Sprite.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(112,"Fanta",0.7f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/String.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(113,"Fanta",0.5f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Vitamilk.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(114,"Fanta",0.2f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Wurkz.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(115,"Fanta",0.5f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Yeo's.jpg"));
        ProductModel1.listproduct.add(new ProductModel1(116,"Fanta",0.4f,"/Users/sereypanha/Documents/CodeStudy/Java/Drink/Water.jpg"));
        
        
        GridBagConstraints gb = new GridBagConstraints();
        gb.insets = new Insets(5, 4, 5, 4);
        int x=0,y=0;
        for(int i=0;i<16;i++){
            ProductModel1 pro  = new ProductModel1();
            pro.setImage(ProductModel1.listproduct.get(i).getImage());
            pro.setCode(ProductModel1.listproduct.get(i).getCode());
            pro.setName(ProductModel1.listproduct.get(i).getName());
            pro.setPrice(ProductModel1.listproduct.get(i).getPrice());

            gb.gridx =x;
            gb.gridy =y;
            x++;
            MainPanel.add(pro, gb);
            if(x==5){
                y++;
                x=0;
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MainPanel.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(MainPanel);

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Bai Jamjuree", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PayMent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Bai Jamjuree", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delivery");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 576, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuPay m = new MenuPay();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Delivery  d = new Delivery();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
