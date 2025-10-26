package swing.Calculator;

import java.awt.Color;
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

public class calculator_app extends javax.swing.JFrame {

    private int temp =0,i;
    private int op;
    private double value1,value2,result;
    
    public calculator_app() {
        initComponents();
        chdark.setSelected(true);
        txresual.setText("0");
    }
    
    public void setNumber(String x){
        temp++;
        if(temp==1){
            txresual.setText("");
            if (txresual.getText().equals("")) {
                txresual.setText(x);
            }else{
                txresual.setText(txresual.getText()+x);
            }
        }else{
            if (txresual.getText().equals("")) {
                txresual.setText(x);
            }else{
                txresual.setText(txresual.getText()+x);
            }
        }
    }
    public void CalculatorNumber(){
        switch (op) {
            case 1 -> { // +
                value2 =  Double.parseDouble(txresual.getText());
                result = value1 + value2;
                txresual.setText(String.valueOf(result));
                lbcalculator.setText(lbcalculator.getText()+String.valueOf(value2)+" = ");
            }
            case 2 -> { // -
                value2 = Double.parseDouble(txresual.getText());
                result = value1 - value2;
                txresual.setText(String.valueOf(result));
                lbcalculator.setText(lbcalculator.getText()+String.valueOf(value2)+ " = ");
            }
            case 3 -> { // *
                value2 = Double.parseDouble(txresual.getText());
                result = value1 * value2;
                txresual.setText(String.valueOf(result));
                lbcalculator.setText(lbcalculator.getText()+String.valueOf(value2)+ " = ");
            }
            case 4 -> { // /
                value2 = Double.parseDouble(txresual.getText());
                result = value1 / value2;
                txresual.setText(String.valueOf(result));
                lbcalculator.setText(lbcalculator.getText()+String.valueOf(value2)+ " = ");
            }
            case 5 -> { // %
                value2 = Double.parseDouble(txresual.getText());
                result = value1 % value2;
                txresual.setText(String.valueOf(result));
                lbcalculator.setText(lbcalculator.getText()+String.valueOf(value2)+ " = ");
            }
            case 6 -> { // x^y
                value2 = Double.parseDouble(txresual.getText());
                result = pow(value1,1/value2);
                txresual.setText(String.valueOf(result));
                lbcalculator.setText(lbcalculator.getText()+"1/"+String.valueOf(value2)+") =");
                
            }
            case 7 -> {
                
            }
            case 8 -> {
                
            }
                            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txresual = new javax.swing.JTextField();
        btc = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btplush = new javax.swing.JToggleButton();
        btpow = new javax.swing.JButton();
        btsin = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        btmile = new javax.swing.JToggleButton();
        bty = new javax.swing.JButton();
        btcos = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btx = new javax.swing.JToggleButton();
        bttwo = new javax.swing.JButton();
        bttan = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btslash = new javax.swing.JToggleButton();
        btthree = new javax.swing.JButton();
        slachx = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btdot = new javax.swing.JButton();
        btequal = new javax.swing.JButton();
        btplushandmuil = new javax.swing.JToggleButton();
        btpii = new javax.swing.JButton();
        btnoe = new javax.swing.JButton();
        lbcalculator = new javax.swing.JLabel();
        chlight = new javax.swing.JCheckBox();
        chdark = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(0, 0, 0));

        jPanel2.setBackground(new Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Calculator");

        txresual.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        btc.setBackground(new Color(51, 51, 51));
        btc.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btc.setText("C");
        btc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcActionPerformed(evt);
            }
        });

        btdelete.setBackground(new Color(51, 51, 51));
        btdelete.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btdelete.setText("<-");
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });

        jButton3.setBackground(new Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton3.setText("%");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btplush.setBackground(new Color(51, 51, 51));
        btplush.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btplush.setText("+");
        btplush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btplushActionPerformed(evt);
            }
        });

        btpow.setBackground(new Color(51, 51, 51));
        btpow.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btpow.setText("x^2");
        btpow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpowActionPerformed(evt);
            }
        });

        btsin.setBackground(new Color(51, 51, 51));
        btsin.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btsin.setText("sin");
        btsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsinActionPerformed(evt);
            }
        });

        bt7.setBackground(new Color(0, 204, 255));
        bt7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.setBackground(new Color(0, 204, 255));
        bt8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt9.setBackground(new Color(0, 204, 255));
        bt9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        btmile.setBackground(new Color(51, 51, 51));
        btmile.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btmile.setText("-");
        btmile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmileActionPerformed(evt);
            }
        });

        bty.setBackground(new Color(51, 51, 51));
        bty.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bty.setText("x^y");
        bty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btyActionPerformed(evt);
            }
        });

        btcos.setBackground(new Color(51, 51, 51));
        btcos.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btcos.setText("cos");
        btcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcosActionPerformed(evt);
            }
        });

        bt4.setBackground(new Color(0, 204, 255));
        bt4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.setBackground(new Color(0, 204, 255));
        bt5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt6.setBackground(new Color(0, 204, 255));
        bt6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        btx.setBackground(new Color(51, 51, 51));
        btx.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btx.setText("x");
        btx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxActionPerformed(evt);
            }
        });

        bttwo.setBackground(new Color(51, 51, 51));
        bttwo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bttwo.setText("√x");
        bttwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttwoActionPerformed(evt);
            }
        });

        bttan.setBackground(new Color(51, 51, 51));
        bttan.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bttan.setText("tan");
        bttan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttanActionPerformed(evt);
            }
        });

        bt1.setBackground(new Color(0, 204, 255));
        bt1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setBackground(new Color(0, 204, 255));
        bt2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setBackground(new Color(0, 204, 255));
        bt3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        btslash.setBackground(new Color(51, 51, 51));
        btslash.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btslash.setText("/");
        btslash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btslashActionPerformed(evt);
            }
        });

        btthree.setBackground(new Color(51, 51, 51));
        btthree.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btthree.setText("y^√x");
        btthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthreeActionPerformed(evt);
            }
        });

        slachx.setBackground(new Color(51, 51, 51));
        slachx.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        slachx.setText("X!");
        slachx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slachxActionPerformed(evt);
            }
        });

        bt0.setBackground(new Color(0, 204, 255));
        bt0.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });

        btdot.setBackground(new Color(0, 204, 255));
        btdot.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btdot.setText(".");
        btdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdotActionPerformed(evt);
            }
        });

        btequal.setBackground(new Color(255, 255, 255));
        btequal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btequal.setForeground(new Color(0, 0, 0));
        btequal.setText("=");
        btequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btequalActionPerformed(evt);
            }
        });

        btplushandmuil.setBackground(new Color(51, 51, 51));
        btplushandmuil.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btplushandmuil.setText("+/-");
        btplushandmuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btplushandmuilActionPerformed(evt);
            }
        });

        btpii.setBackground(new Color(51, 51, 51));
        btpii.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btpii.setText("π");
        btpii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpiiActionPerformed(evt);
            }
        });

        btnoe.setBackground(new Color(51, 51, 51));
        btnoe.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnoe.setText("1/X");
        btnoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(203, 203, 203)
                        .addComponent(lbcalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btdot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btequal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btplushandmuil, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btpii, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnoe, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btslash, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btthree, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slachx, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btx, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bttwo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bttan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btmile, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bty, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btcos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btplush, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btpow, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btsin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txresual))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbcalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(txresual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btplush, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpow, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttwo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btthree, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btslash, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(slachx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btdot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btequal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btplushandmuil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpii, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnoe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        buttonGroup1.add(chlight);
        chlight.setForeground(new Color(51, 255, 204));
        chlight.setText("light");
        chlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chlightActionPerformed(evt);
            }
        });

        buttonGroup1.add(chdark);
        chdark.setForeground(new Color(0, 255, 204));
        chdark.setText("dark");
        chdark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chdarkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chlight)
                .addGap(34, 34, 34)
                .addComponent(chdark)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chlight)
                    .addComponent(chdark))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btplushandmuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btplushandmuilActionPerformed
        String data = txresual.getText();
        if(data.contains(("-"))){
            data = data.substring(1,data.length());
            txresual.setText(data);
        }else{
            txresual.setText("-"+data);
        }
    }//GEN-LAST:event_btplushandmuilActionPerformed

    private void btequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btequalActionPerformed
        CalculatorNumber();
    }//GEN-LAST:event_btequalActionPerformed

    private void btdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdotActionPerformed
        if(txresual.getText().contains(".")==false){
            txresual.setText(txresual.getText()+".");
        }
    }//GEN-LAST:event_btdotActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed

        setNumber("0");
    }//GEN-LAST:event_bt0ActionPerformed

    private void btthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthreeActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        lbcalculator.setText("pow("+String.valueOf(value1)+" ^ ");
        txresual.setText("");
        op=6;
    }//GEN-LAST:event_btthreeActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        setNumber("1");
    }//GEN-LAST:event_bt1ActionPerformed

    private void btxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        lbcalculator.setText(String.valueOf(value1)+" x ");
        txresual.setText("");
        op=3;
    }//GEN-LAST:event_btxActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        setNumber("4");
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        setNumber("7");
    }//GEN-LAST:event_bt7ActionPerformed

    private void btpowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpowActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        txresual.setText(String.valueOf(pow(value1,2)));
        lbcalculator.setText("pow("+value1+",2) = ");
    }//GEN-LAST:event_btpowActionPerformed

    private void btcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcActionPerformed
        setNumber("0");
        lbcalculator.setText("");
        temp=0;
    }//GEN-LAST:event_btcActionPerformed

    private void chlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chlightActionPerformed
        jPanel1.setBackground(Color.WHITE);
        chlight.setForeground(new Color(0,0,0));
        chdark.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_chlightActionPerformed

    private void chdarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chdarkActionPerformed
        jPanel1.setBackground(new Color(0,0,0)); 
        chlight.setForeground(new Color(255,255,255));
        chdark.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_chdarkActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        setNumber("2");
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        setNumber("3");
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        setNumber("5");
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        setNumber("6");
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        setNumber("8");
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        setNumber("9");
    }//GEN-LAST:event_bt9ActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        String number = txresual.getText();
        number = number.substring(0,number.length()-1);
        txresual.setText(number);
        if(number.length()==0){
            txresual.setText("0");
            temp =0;
        }
    }//GEN-LAST:event_btdeleteActionPerformed

    private void btplushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btplushActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        lbcalculator.setText(String.valueOf(value1)+" + ");
        txresual.setText("");
        op=1;
    }//GEN-LAST:event_btplushActionPerformed

    private void btmileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmileActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        lbcalculator.setText(String.valueOf(value1)+" - ");
        txresual.setText("");
        op=2;
    }//GEN-LAST:event_btmileActionPerformed

    private void btslashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btslashActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        lbcalculator.setText(String.valueOf(value1)+" / ");
        txresual.setText("");
        op=4;
    }//GEN-LAST:event_btslashActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        lbcalculator.setText(String.valueOf(value1)+" % ");
        txresual.setText("");
        op=5;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btyActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        lbcalculator.setText(String.valueOf(value1)+" ^ ");
        txresual.setText("");
        op=6;
    }//GEN-LAST:event_btyActionPerformed

    private void bttwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttwoActionPerformed
         value1 = Double.parseDouble(txresual.getText());
        txresual.setText(String.valueOf(sqrt(value1)));
        lbcalculator.setText("Sqrt("+value1+" = ");
    }//GEN-LAST:event_bttwoActionPerformed

    private void btpiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpiiActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        txresual.setText(String.valueOf(3.14*(value1)));
        lbcalculator.setText("π *"+value1+" = ");
    }//GEN-LAST:event_btpiiActionPerformed

    private void btnoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoeActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        txresual.setText(String.valueOf(1/(value1)));
        lbcalculator.setText("1/"+value1+" = ");
    }//GEN-LAST:event_btnoeActionPerformed

    private void slachxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slachxActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        double f=1;
        for(i=0;i<value1;i++){
            f = f*i;
        }
        txresual.setText(String.valueOf(f));
        lbcalculator.setText(value1+"! = ");
    }//GEN-LAST:event_slachxActionPerformed

    private void btsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsinActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        txresual.setText(String.valueOf(sin(value1)));
        lbcalculator.setText("sin("+value1+") = ");
    }//GEN-LAST:event_btsinActionPerformed

    private void btcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcosActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        txresual.setText(String.valueOf(cos(value1)));
        lbcalculator.setText("cos("+value1+") = ");
    }//GEN-LAST:event_btcosActionPerformed

    private void bttanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttanActionPerformed
        value1 = Double.parseDouble(txresual.getText());
        txresual.setText(String.valueOf(tan(value1)));
        lbcalculator.setText("tan("+value1+") = ");
    }//GEN-LAST:event_bttanActionPerformed

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
            java.util.logging.Logger.getLogger(calculator_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new calculator_app().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btc;
    private javax.swing.JButton btcos;
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btdot;
    private javax.swing.JButton btequal;
    private javax.swing.JToggleButton btmile;
    private javax.swing.JButton btnoe;
    private javax.swing.JButton btpii;
    private javax.swing.JToggleButton btplush;
    private javax.swing.JToggleButton btplushandmuil;
    private javax.swing.JButton btpow;
    private javax.swing.JButton btsin;
    private javax.swing.JToggleButton btslash;
    private javax.swing.JButton bttan;
    private javax.swing.JButton btthree;
    private javax.swing.JButton bttwo;
    private javax.swing.JToggleButton btx;
    private javax.swing.JButton bty;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBox chdark;
    private javax.swing.JCheckBox chlight;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbcalculator;
    private javax.swing.JButton slachx;
    private javax.swing.JTextField txresual;
    // End of variables declaration//GEN-END:variables
}
