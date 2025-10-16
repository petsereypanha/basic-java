package AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tranning extends Frame{
	
	private static final long serialVersionUID = 1L;
	Label lb;
	TextField txtId,txtName,txtDob,txtYear,txtClass,txtJava,txtPhp,txtDatabase,txtFlutter,txtAddress,txtPhone,txtImage;
	JRadioButton rbMale,rbFemale;
	JComboBox<?> cbDepartment,cbUniversity;
	JCheckBox cbM,cbA,cbE; 
	ButtonGroup bgImg = new ButtonGroup();
	ButtonGroup bgGender = new ButtonGroup();
	Button btnImage,btnSave,btnUpdate,btnDelete,btnSort,btnExit;
	JTable table;
	DefaultTableModel model;
	
	public Tranning() {
		
		setBackground(Color.PINK);
		
//		 Title
		lb = new Label("Form Student Register");
		lb.setBounds(500,80,500,40);
		lb.setFont(new Font("Serif", Font.BOLD, 40));
		add(lb);
		
// 		InputID
		lb = new Label("Input ID :");
		lb.setBounds(40,180,180,30);
		lb.setFont(new Font("Courier New",Font.BOLD,18));
		add(lb);
		txtId = new TextField();
		txtId.setBounds(240,180,180,30);
		txtId.setFont(new Font("Courier New",Font.BOLD,15));
		add(txtId);
		
// 		InputName
		lb = new Label("Input Name :");
		lb.setBounds(40, 230, 180, 30);
		lb.setFont(new Font("Courier New",Font.CENTER_BASELINE,18));
		add(lb);
		txtName = new TextField();
		txtName.setBounds(240,230,180,30);
		txtName.setFont(new Font("Courier New",Font.CENTER_BASELINE,18));
		add(txtName);
		
//		Input Gender
		lb = new Label("Input Gender :");
		lb.setBounds(40, 280, 180, 30);
		lb.setFont(new Font("Courier New",Font.CENTER_BASELINE,18));
		add(lb);
		rbMale = new JRadioButton("Male");
		rbMale.setBounds(240,280,90,30);
		rbMale.setFont(new Font("Courier New",Font.CENTER_BASELINE,18));
		add(rbMale);
		rbFemale = new JRadioButton("Female");
		rbFemale.setBounds(320,280,120,30);
		rbFemale.setFont(new Font("Courier New",Font.CENTER_BASELINE,18));
		add(rbFemale);
		
//		
		
		setLayout(null);
		setSize(1422,888);
		setVisible(true);
		setLocationRelativeTo(null);
		
	       
        // Close form
        addWindowListener (new WindowAdapter() {
           @Override
           public  void windowClosing (WindowEvent e){
               dispose();
           }
       });
	}
	public static void main(String[] args) {
		new Tranning();
	}
	
}
