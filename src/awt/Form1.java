package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Form1 extends  Frame{ 
 
    public Form1(){
        // Button 
        Button btnsave = new Button("Save"); 
        btnsave.setBounds(100, 50, 140, 40);   //( marginLefe, marginTop, wirdth,Hight)   
        btnsave.setFont(new Font("Serif", Font.BOLD, 20));
        // btnsave.setForeground(Color.BLUE);
        btnsave.setForeground(new Color(042 , 100 , 120));
        btnsave.setBackground(Color.PINK);
        add(btnsave);
        
        // label
        Label lbtitle = new Label("Hello java Programming");
        lbtitle.setBounds(100, 100, 230, 40);
        lbtitle.setFont(new Font("Serif", Font.BOLD, 20));
        lbtitle.setForeground(Color.GREEN); 
        lbtitle.setBackground(Color.PINK); 
        add(lbtitle);
        
        // set Color into Frame
        setBackground(new Color(134,115,161)); 
        
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
