package swing.project_queue;


import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
public class ProductModel1 extends javax.swing.JPanel {

    //------------------------
    public static DefaultTableModel getModel() {
        return model;
    }

    public static void setModel(DefaultTableModel aModel) {
        model = aModel;
    }
    //------------------------
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
        lbcode.setText(lbcode.getText()+String.valueOf(code));
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        name = name.replace(".jpg", "");
        this.name = name;
        lbname.setText(lbname.getText()+name);
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
        lbimage.setIcon(new ImageIcon(image));
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
        lbprice.setText(lbprice.getText()+String.valueOf(price)+"$");
    }

    private int code,qty=0;
    private  String name,image;
    private  float price;
    private double amount;
    
    //-------------------------
    private static DefaultTableModel model = new DefaultTableModel(new String[]{"ID","Name","Price","Qty","Amount"},0);
    DecimalFormat df = new DecimalFormat("##0.00$");
    //-------------------------

    public ProductModel1(int code, String name, float price, String image) {
        this.code = code;
        this.name = name;
        this.image = image;
        this.price = price;
//        this.amount = amount;
    }
    
    static  ArrayList<ProductModel1> listproduct = new ArrayList<>();
    
    public ProductModel1() {
        initComponents();
        btncancel.setVisible(false);
        Store.listStore.add(new Store(amount));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbImage = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnBuy = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbimage = new javax.swing.JLabel();
        lbcode = new javax.swing.JLabel();
        lbprice = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        btnbuy = new javax.swing.JButton();
        lbname = new javax.swing.JLabel();

        lbImage.setIcon(new ImageIcon("/Users/sereypanha/Documents/CodeStudy/Java/SwingStore/323530482_880415919766849_3266884149402296249_n.jpg")); // NOI18N

        lbPrice.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        lbPrice.setText("Price  :");

        btnCancel.setBackground(new java.awt.Color(153, 51, 0));
        btnCancel.setFont(new java.awt.Font("Bai Jamjuree", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");

        btnBuy.setBackground(new java.awt.Color(0, 153, 153));
        btnBuy.setFont(new java.awt.Font("Bai Jamjuree", 0, 12)); // NOI18N
        btnBuy.setText("Buy");

        lbName.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        lbName.setText("Name :");

        setMinimumSize(new java.awt.Dimension(211, 307));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        lbimage.setIcon(new ImageIcon("/Users/sereypanha/Documents/CodeStudy/Java/SwingStore/323530482_880415919766849_3266884149402296249_n.jpg")); // NOI18N
        jPanel1.add(lbimage);
        lbimage.setBounds(0, 0, 210, 160);

        lbcode.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        lbcode.setText("Code  :");
        jPanel1.add(lbcode);
        lbcode.setBounds(20, 180, 190, 18);

        lbprice.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        lbprice.setText("Price  :");
        jPanel1.add(lbprice);
        lbprice.setBounds(20, 240, 190, 18);

        btncancel.setBackground(new java.awt.Color(153, 51, 0));
        btncancel.setFont(new java.awt.Font("Bai Jamjuree", 0, 12)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel);
        btncancel.setBounds(20, 280, 66, 27);

        btnbuy.setBackground(new java.awt.Color(0, 153, 153));
        btnbuy.setFont(new java.awt.Font("Bai Jamjuree", 0, 12)); // NOI18N
        btnbuy.setText("Buy");
        btnbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuy);
        btnbuy.setBounds(130, 280, 70, 27);

        lbname.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        lbname.setText("Name :");
        jPanel1.add(lbname);
        lbname.setBounds(20, 210, 190, 18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private int FindRow(int code){
        for(var i=0;i<model.getRowCount();i++){
            code = (int) model.getValueAt(i, 0);
            if(code == this.code){
                return  i;
            }
        }
        return -1;
    }
    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        qty--;
        int row = FindRow(code);
        if(qty<=0){  // remove
            btnbuy.setText("Buy");
            qty = 0;
            model.removeRow(row);
            btncancel.setVisible(false);
        }else{   // update
            amount = price*qty;
            btnbuy.setText("Buy("+qty+")");
            model.setValueAt(qty, row, 3);    // qty
            model.setValueAt(df.format(amount), row, 4);  // amount
            
        }
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuyActionPerformed
        qty++;
        btnbuy.setText("Buy("+qty+")"); 
        int row = FindRow(code);
        btncancel.setVisible(true);
        if(qty == 1){
            Object row1[] = {code,name,price+"$",qty,price+"$"};
            model.addRow(row1);
        }else{
            amount = price*qty;
            model.setValueAt(qty, row, 3);  // qty
            model.setValueAt(df.format(amount), row, 4);  // amout
        }
    }//GEN-LAST:event_btnbuyActionPerformed
    
//    public  ProductModel1(double  amount){
//        this.amount = amount;
//    }
//    
//    public double getAmount(){
//        return amount;
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnbuy;
    private javax.swing.JButton btncancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbcode;
    private javax.swing.JLabel lbimage;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbprice;
    // End of variables declaration//GEN-END:variables
}
