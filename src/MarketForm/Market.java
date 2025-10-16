package MarketForm;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Market{
	Frame f;
	JLabel lTitle,lImage,lCode,lName,lPrice,lQty;
	Market()
	{
		// Frame Title
		f = new Frame("Chill Market");
		
		// Frame Icon
		  Image icoImage = Toolkit.getDefaultToolkit().getImage("Desktop/Photo/Market1.Png");
		  f.setIconImage(icoImage);
		
		// Background Color
		f.setBackground(new Color(254,226,113));
		
		// Label
		lCode = new JLabel("Code");
		lCode.setBounds(480, 100, 200, 50);
		lCode.setFont(new Font("Serif",Font.BOLD,26));
		// Frame
		f.setLayout(null);
		f.setSize(1200,500);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		
        // Close form
        f.addWindowListener (new WindowAdapter() {
           @Override
           public  void windowClosing (WindowEvent e){
               f.dispose();
           }
       });
	}
	public static void main(String[] args) {
		new Market();
	}
}
