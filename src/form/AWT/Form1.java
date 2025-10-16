package form.AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Form1 extends  Frame{ 
 
    private static final long serialVersionUID = 1L;

	public Form1(){
        // Button 
        Button btnsave = new Button("Save"); 
        btnsave.setBounds(100, 50, 140, 40);   //( marginLefe, marginTop, wirdth,Hight)   
        btnsave.setFont(new Font("Serif", Font.BOLD, 20));
        // btnsave.setForeground(Color.BLUE);
        btnsave.setForeground( Color.blue);
        btnsave.setBackground(Color.cyan);
        add(btnsave);
       
        setLayout(null);
        setSize(500, 300); 
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
        new Form1();
    }
    
}
