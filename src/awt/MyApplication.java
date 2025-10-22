/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awt;
import java.awt.*;
import java.awt.event.*;

public class MyApplication extends Frame {
    private TextField textField;
    private Label label;
    
    public MyApplication() {
        // Set layout manager
        setLayout(new FlowLayout());
        
        // Create label
        label = new Label("You input: ");
        add(label);
        
        // Create text field
        textField = new TextField(20);
        add(textField);
        
        // Create ADD button
        Button addButton = new Button("ADD");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                label.setText("You input: " + input);
            }
        });
        add(addButton);
        
        // Create CLEAR button
        Button clearButton = new Button("CLEAR");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                label.setText("You input: ");
            }
        });
        add(clearButton);
        
        // Create EXIT button
        Button exitButton = new Button("EXIT");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
        
        // Set frame properties
        setTitle("My Application");
        setSize(300, 150);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MyApplication();
    }
}