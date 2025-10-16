package form.StaffForm;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Staff extends Frame implements ActionListener{
    Label lbtitle,lbid,lbname,lbposition,lbphon,lbgender,lbsalary,lbaddress;
    TextField textid,textname,textposition,textphone,textsalary,textaddress;
    JCheckBox cbmale,cbfemale;
    ButtonGroup btg;
    JLabel lbimage;
    JTable tbtabel;
    DefaultTableModel model;
    Button btsave,btupdate,btdelete,btexit;
    public Staff(){
        lbimage=new JLabel();
        lbimage.setBounds(0, 0, 320, 700);
        lbtitle =new Label("Staff information");
        lbtitle.setBounds(20, 70, 270, 50);
        lbtitle.setFont(new Font("serif", Font.PLAIN, 40));
        lbtitle.setBackground(Color.white);
        add(lbtitle);
        lbimage.setIcon(new ImageIcon("/Users/sereypanha/Desktop/Photo/Market1.png"));
        add(lbimage);
        
        lbid=new Label("ID");
        lbid.setBounds(350, 100, 120, 40);
        lbid.setFont(new Font("serif", Font.PLAIN, 30));
        lbid.setForeground(Color.white);
        lbid.setBackground(new Color(0, 105, 148));
        add(lbid);
        textid=new TextField();
        textid.setBounds(470, 100, 250, 40);
        textid.setFont(new Font("serif", Font.PLAIN, 30));
        add(textid);
        lbgender=new Label("Gender");
        lbgender.setBounds(770, 100, 120, 40);
        lbgender.setFont(new Font("serif", Font.PLAIN, 30));
        lbgender.setForeground(Color.white);
        lbgender.setBackground(new Color(0, 105, 148));
        add(lbgender);
        cbmale=new JCheckBox("Male",false);
        cbmale.setBounds(900, 100, 100, 40);
        cbmale.setFont(new Font("serif", Font.PLAIN, 30));
        cbmale.setForeground(Color.white);
        cbmale.setBackground(new Color(0, 105, 148));
        add(cbmale);
        cbfemale=new JCheckBox("Female",false);
        cbfemale.setBounds(1030, 100, 130, 40);
        cbfemale.setFont(new Font("serif", Font.PLAIN, 30));
        cbfemale.setForeground(Color.white);
        cbfemale.setBackground(new Color(0, 105, 148));
        add(cbfemale);
        btg=new ButtonGroup();
        btg.add(cbmale);
        btg.add(cbfemale);
        lbname=new Label("Name");
        lbname.setBounds(350, 190, 120, 40);
        lbname.setFont(new Font("serif", Font.PLAIN, 30));
        lbname.setForeground(Color.white);
        lbname.setBackground(new Color(0, 105, 148));
        add(lbname);
        textname=new TextField();
        textname.setBounds(470, 190, 250, 40);
        textname.setFont(new Font("serif", Font.PLAIN, 30));
        add(textname);
        lbsalary=new Label("Salary");
        lbsalary.setBounds(770, 190, 120, 40);
        lbsalary.setFont(new Font("serif", Font.PLAIN, 30));
        lbsalary.setForeground(Color.white);
        lbsalary.setBackground(new Color(0, 105, 148));
        add(lbsalary);
        textsalary=new TextField();
        textsalary.setBounds(900, 190, 250, 40);
        textsalary.setFont(new Font("serif", Font.PLAIN, 30));
        add(textsalary);
        lbposition=new Label("Position");
        lbposition.setBounds(350, 280, 120, 40);
        lbposition.setFont(new Font("serif", Font.PLAIN, 30));
        lbposition.setForeground(Color.white);
        lbposition.setBackground(new Color(0, 105, 148));
        add(lbposition);
        textposition=new TextField();
        textposition.setBounds(470, 280, 250, 40);
        textposition.setFont(new Font("serif", Font.PLAIN, 30));
        add(textposition);
        lbaddress=new Label("Address");
        lbaddress.setBounds(770, 280, 120, 40);
        lbaddress.setFont(new Font("serif", Font.PLAIN, 30));
        lbaddress.setForeground(Color.white);
        lbaddress.setBackground(new Color(0, 105, 148));
        add(lbaddress);
        textaddress=new TextField();
        textaddress.setBounds(900, 280, 250, 40);
        textaddress.setFont(new Font("serif", Font.PLAIN, 30));
        add(textaddress);
        lbphon=new Label("Phone");
        lbphon.setBounds(350, 370, 120, 40);
        lbphon.setFont(new Font("serif", Font.PLAIN, 30));
        lbphon.setForeground(Color.white);
        lbphon.setBackground(new Color(0, 105, 148));
        add(lbphon);
        textphone=new TextField();
        textphone.setBounds(470, 370, 250, 40);
        textphone.setFont(new Font("serif", Font.PLAIN, 30));
        add(textphone);
        String col[]={"ID","NAME","POSITION","PHONE","GENDER","SALARY","ADDRESS"};
        tbtabel=new JTable();
        model=new DefaultTableModel();
        model.setColumnIdentifiers(col);
        tbtabel.setModel(model);
        JScrollPane js=new JScrollPane(tbtabel);
        js.setBounds(350, 450, 790, 150);
        js.setFont(new Font("serif", Font.PLAIN, 30));
        js.setForeground(Color.white);
        js.setBackground(new Color(0, 105, 148));
        add(js);
        btsave=new Button("Save");
        btsave.setBounds(376, 630, 150, 50);
        btsave.setFont(new Font("serif", Font.PLAIN, 30));
        add(btsave);
        btupdate=new Button("Update");
        btupdate.setBounds(574, 630, 150, 50);
        btupdate.setFont(new Font("serif", Font.PLAIN, 30));
        add(btupdate);
        btdelete=new Button("Delete");
        btdelete.setBounds(772, 630, 150, 50);
        btdelete.setFont(new Font("serif", Font.PLAIN, 30));
        add(btdelete);
        btexit=new Button("Exit");
        btexit.setBounds(970, 630, 150, 50);
        btexit.setFont(new Font("serif", Font.PLAIN, 30));
        add(btexit);
        
        btsave.addActionListener(this);
        btupdate.addActionListener(this);
        btdelete.addActionListener(this);
        btexit.addActionListener(this);
       
        setLayout(null);
        setSize(1300, 700);
        setVisible(true);
        setLocationRelativeTo(null);
        setBackground(new Color(0, 105, 148));
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
       
    }
    public static void main(String[] args) {
        new Staff();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btsave){ // button save
            int id = Integer.parseInt(textid.getText());
            String name = textname.getText();
//            String gender;
//            if(cbmale.isSelected()){
//                gender="Male";
//            }else{
//                gender="Female";
//            }
            String gender = (cbmale.isSelected()) ? "Male" : "Female";
            float salary = Float.parseFloat(textsalary.getText());
            String address = textaddress.getText();
            String position = textposition.getText();
            String phone = textphone.getText();

            
//            textid.setText("");
//            textname.setText("");
//            textposition.setText("");
//            textphone.setText("");
//            textsalary.setText("");
//            textaddress.setText("");
//            btg.clearSelection();
            
            
        }else if(e.getSource()==btupdate){ // button update
            
        }else if(e.getSource()==btdelete){ // button delete
            
        }else{  // button exit
            //System.exit(0);
            dispose();
        }
    }

}