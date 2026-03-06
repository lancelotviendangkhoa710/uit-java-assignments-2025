/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @VienDangKhoa
 */

import javax.swing.*;
import java.awt.Font;
import java.awt.*;
public class View extends JFrame {
     private JTextField display;// man hinh hien thi
    
     public View() {

        setTitle("Calculator");
        setSize(350,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);// can le phai
        display.setFont(new Font("Arial", Font.BOLD, 24));

        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,5,4,4));

        String[] buttons = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0",".","=","+",
            "C"
        };

        for(String text : buttons){
            JButton button = new JButton(text);
            buttonPanel.add(button);
            button.setFont(new Font("Arial", Font.CENTER_BASELINE, 21));
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
                
    }
     
     public static void main(String[] args) {
        new View();
    }   
     

}
