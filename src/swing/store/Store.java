package swing.store;

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
            if(x==4){
                y++;
                x=0;
            }
        }
        tbTable.setModel(ProductModel1.getModel());
//        for(int i=0;i<ProductModel1.getModel().getRowCount();i++){
//            String amount = tbTable.getValueAt(i, 4).toString();
//            amount=amount.replace("$", "");
//            subtotal+=Double.parseDouble(amount);
//       }
//        for(int i=0;i<ProductModel1.listproduct.size();i++){
//            double amount = ProductModel1.listproduct.get(i).getAmount();
//            subtotal += amount;
//        }

        for(int i=0;i<ProductModel1.getModel().getRowCount();i++){
            String amount = tbTable.getValueAt(i, 4).toString();
            amount = amount.replace("$","");
            subtotal+=Double.parseDouble(amount);
        }
        subtotal += amount;
        tax=subtotal*ctax/100;
        tatol=subtotal+tax;
        txtSubtotal.setText(df.format(subtotal));
        txtTex.setText(df.format(tax));
        txtTotal.setText(df.format(tatol));
    }
    private int x=0;
    private void SetNumber(String number){
        if(txtCashreceive.getText().equals("")){
            txtCashreceive.setText(number);
        }else{
            txtCashreceive.setText(txtCashreceive.getText()+number);
        }
        x++;
        int index = cbPayment.getSelectedIndex();
        switch (index) {
            case 0 -> {  // riel
                if(x==1){
                    txtCashreceive.setText(txtCashreceive.getText()+"R");
                }else{
                    String a = txtCashreceive.getText();
                    a=a.replace("$", "");
                    txtCashreceive.setText(a+"$");
                }
            }
            case 1 -> {
                if(x==1){
                    txtCashreceive.setText(txtCashreceive.getText()+"$");
                }else{
                String a = txtCashreceive.getText();
                a=a.replace("$","");
                txtCashreceive.setText(a+"$");
                }
            }
        }
    }
    private void PaymentDollar(){
        String cashReceive = txtCashreceive.getText();
        cashReceive = cashReceive.replace("$", "");
        double cashReturnDollor = Double.parseDouble(cashReceive) - tatol;
        double cashReturnReil = cashReturnDollor*4100;
        txtCashreturnDollor.setText(df.format(cashReturnDollor));
        txtCashreturnReil.setText(df.format(cashReturnReil));
    }
    private void PaymentReil(){
        String cashReceive = txtCashreceive.getText();
        cashReceive = cashReceive.replace("$", "");
        tatol = tatol*4100;
        double cashReturnReil = Double.parseDouble(cashReceive) - tatol;
        double cashReturnDollor = cashReturnReil/4100;
        txtCashreturnDollor.setText(df.format(cashReturnDollor));
        txtCashreturnReil.setText(df.format(cashReturnReil));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        MainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTable = new javax.swing.JTable();
        btn5 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTex = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCashreceive = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCashreturnDollor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbPayment = new javax.swing.JComboBox<>();
        btnPayment = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnExite = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCashreturnReil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(MainPanel);

        jLabel1.setFont(new java.awt.Font("Bai Jamjuree", 0, 36)); // NOI18N
        jLabel1.setText("Custom   Product");

        tbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Price", "Qty", "Acount"
            }
        ));
        jScrollPane2.setViewportView(tbTable);

        btn5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnPoint.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnPoint.setText(".");
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        jLabel2.setText("SubTotal :");

        txtSubtotal.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        jLabel3.setText("Tex         :");

        txtTex.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        jLabel4.setText("Total      :");

        txtTotal.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        jLabel5.setText("Cash Receive       :");

        txtCashreceive.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        jLabel6.setText("Cash Return  $     :");

        txtCashreturnDollor.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        jLabel7.setText("Payment Method  :");

        cbPayment.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        cbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Riel", "USD" }));

        btnPayment.setBackground(new java.awt.Color(0, 102, 255));
        btnPayment.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        btnPayment.setText("Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 102, 255));
        btnReset.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(0, 102, 255));
        btnPrint.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        btnPrint.setText("Print");

        btnRemove.setBackground(new java.awt.Color(0, 102, 255));
        btnRemove.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnExite.setBackground(new java.awt.Color(255, 51, 51));
        btnExite.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        btnExite.setText("Exit");
        btnExite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExiteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 102, 255));
        btnUpdate.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N
        jLabel8.setText("Cash Return Reil  :");

        txtCashreturnReil.setFont(new java.awt.Font("Bai Jamjuree", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 14, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                            .addComponent(txtTex)
                                            .addComponent(txtTotal))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCashreceive)
                                    .addComponent(txtCashreturnDollor)
                                    .addComponent(cbPayment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnExite, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCashreturnReil))
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnC)
                                .addGap(18, 18, 18)
                                .addComponent(btn7)
                                .addGap(18, 18, 18)
                                .addComponent(btn5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn3)
                                .addGap(18, 18, 18)
                                .addComponent(btn1)
                                .addGap(18, 18, 18)
                                .addComponent(btn0))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel3))
                                .addComponent(txtTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCashreceive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(txtCashreturnDollor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPayment)
                                    .addComponent(btnRemove)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtCashreturnReil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset)
                            .addComponent(btnPrint)
                            .addComponent(btnExite)
                            .addComponent(btnUpdate)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(btnPoint))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn9)
                        .addGap(18, 18, 18)
                        .addComponent(btn8)
                        .addGap(18, 18, 18)
                        .addComponent(btn6)
                        .addGap(18, 18, 18)
                        .addComponent(btn4)
                        .addGap(18, 18, 18)
                        .addComponent(btn2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        SetNumber("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        SetNumber("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        SetNumber("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        SetNumber("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtCashreceive.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        SetNumber("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        if(txtCashreceive.getText().contains(".")==false){
            txtCashreceive.setText(txtCashreceive.getText()+".");
        }
    }//GEN-LAST:event_btnPointActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        SetNumber("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        SetNumber("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        SetNumber("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        SetNumber("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        SetNumber("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtCashreturnDollor.setText("");
        txtSubtotal.setText("");
        txtCashreceive.setText("");
        txtTex.setText("");
        txtTotal.setText("");
        cbPayment.setSelectedIndex(0);
        ProductModel1.getModel().setRowCount(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        int index = cbPayment.getSelectedIndex();
        switch (index) {
            case 0 -> {
                PaymentDollar();
            }
            case 1 ->{
                PaymentReil();
            }
        }
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnExiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExiteActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExiteActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnExite;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbTable;
    private javax.swing.JTextField txtCashreceive;
    private javax.swing.JTextField txtCashreturnDollor;
    private javax.swing.JTextField txtCashreturnReil;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTex;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
