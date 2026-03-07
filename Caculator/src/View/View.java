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
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;

    private JButton btnDot;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnDivide;

    private JButton btnEqual;
    private JButton btnClear;

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
        buttonPanel.setLayout(new GridLayout(5,4,4,4));

      

        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnDivide = new JButton("/");

        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btnMultiply = new JButton("*");

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btnMinus = new JButton("-");

        btn0 = new JButton("0");
        btnDot = new JButton(".");
        btnEqual = new JButton("=");
        btnPlus = new JButton("+");

        btnClear = new JButton("C");
        
        buttonPanel.add(btn7);
        buttonPanel.add(btn8);
        buttonPanel.add(btn9);
        buttonPanel.add(btnDivide);

        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        buttonPanel.add(btn6);
        buttonPanel.add(btnMultiply);

        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btnMinus);

        buttonPanel.add(btn0);
        buttonPanel.add(btnDot);
        buttonPanel.add(btnEqual);
        buttonPanel.add(btnPlus);

        buttonPanel.add(btnClear);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
                
    }
        public String getDisplayText() {
         return display.getText();
   }

    public void setDisplayText(String text) {
        display.setText(text);
    }
     
     public static void main(String[] args) {
        new View();
    }  
     
     public void addNumberListener(java.awt.event.ActionListener listener) {

    btn0.addActionListener(listener);
    btn1.addActionListener(listener);
    btn2.addActionListener(listener);
    btn3.addActionListener(listener);
    btn4.addActionListener(listener);
    btn5.addActionListener(listener);
    btn6.addActionListener(listener);
    btn7.addActionListener(listener);
    btn8.addActionListener(listener);
    btn9.addActionListener(listener);

    btnDot.addActionListener(listener); 
    }   
     public void addOperatorListener(java.awt.event.ActionListener listener) {

        btnPlus.addActionListener(listener);
        btnMinus.addActionListener(listener);
        btnMultiply.addActionListener(listener);
        btnDivide.addActionListener(listener);
    }
     
     public void addClearListener(java.awt.event.ActionListener listener) {

        btnClear.addActionListener(listener);
    }
     
     
     public void addEqualListener(java.awt.event.ActionListener listener) {

        btnEqual.addActionListener(listener);
    }

}
