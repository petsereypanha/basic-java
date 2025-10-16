package AWT;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Person extends Frame{
	Label lbtitle,lbid,lbname,lbgender,lbsalary;
	TextField txtid,txtname,txtsalary;
	Checkbox cbmale,cbfemale;
	Button btnsave,btnupdate,btndelete,btnexit;
	JTable tbtable;
	DefaultTableModel model;
	public Person() {
		// background color
		setBackground(Color.pink);
		
		//  TITLE
		lbtitle = new Label("Person Information", Label.CENTER);
		lbtitle.setBounds(0, 40, 600, 30);
		lbtitle.setFont(new Font("Serif", Font.BOLD, 30));
		add(lbtitle);
		
		// ID
		lbid = new Label("ID");
		lbid.setBounds(80, 130, 50, 30);
		lbid.setFont(new Font("Serif", Font.BOLD, 20));
		add(lbid);
		txtid = new TextField();
		txtid.setBounds(180, 130, 250, 30);
		txtid.setFont(new Font("Serif", Font.BOLD, 15));
		add(txtid);
		
		// NAME
		lbname = new Label("NAME");
		lbname.setBounds(80, 180, 100, 30);
		lbname.setFont(new Font("Serif", Font.BOLD, 20));
		add(lbname);
		txtname = new TextField();
		txtname.setBounds(180, 180, 250, 30);
		txtname.setFont(new Font("Serif", Font.BOLD, 15));
		add(txtname);
		
		// GENDER
		lbgender = new Label("GENDER");
		lbgender.setBounds(80, 230, 100, 30);
		lbgender.setFont(new Font("Serif", Font.BOLD, 20));
		add(lbgender);
		CheckboxGroup  cbg = new CheckboxGroup();
		
		// MALE
		cbmale = new Checkbox("Male", cbg, false);
		cbmale.setBounds(174, 230, 80, 30);
		cbmale.setFont(new Font("Serif", Font.BOLD, 20));
		add(cbmale);
		
		// Female
		cbfemale = new Checkbox("Female", cbg, false);
		cbfemale.setBounds(280, 230, 100, 30);
		cbfemale.setFont(new Font("Serif", Font.BOLD, 20));
		add(cbfemale);
		
		// Salary
		lbsalary = new Label("Salary");
		lbsalary.setBounds(80, 280, 100, 30);
		lbsalary.setFont(new Font("Serif", Font.BOLD, 20));
		add(lbsalary);
		txtsalary = new TextField();
		txtsalary.setBounds(180, 280, 250, 30);
		txtsalary.setFont(new Font("Serif", Font.BOLD, 15));
		add(txtsalary);
		
		// Button Save
		btnsave = new Button("Save");
		btnsave.setBounds(80, 350, 100, 40);
		btnsave.setFont(new Font("Serif", Font.BOLD, 20));
		add(btnsave);
		
		// Button Update
		btnupdate = new Button("Update");
		btnupdate.setBounds(190, 350, 100, 40);
		btnupdate.setFont(new Font("Serif", Font.BOLD, 20));
		add(btnupdate);
		
		// Button Delete
		btndelete = new Button("Delete");
		btndelete.setBounds(300, 350, 100, 40);
		btndelete.setFont(new Font("Serif", Font.BOLD, 20));
		add(btndelete);
		
		// Button Exit
		btnexit = new Button("Exit");
		btnexit.setBounds(410, 350, 100, 40);
		btnexit.setFont(new Font("Serif", Font.BOLD, 20));
		add(btnexit);
		
		// Table
		String col[] = {"ID","Name","Gender","Salary"};
		tbtable = new JTable();
		model = new DefaultTableModel();
		model.setColumnIdentifiers(col);
		tbtable.setModel(model);
		JScrollPane js = new JScrollPane(tbtable);
		js.setBounds(80, 420, 430, 200);
		js.setFont(new Font("Serif", Font.BOLD, 15));
		add(js);
		
		
        setLayout(null);
        setSize(600, 750); 
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
		new Person();
	}
}
