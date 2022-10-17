//package java Swing Class Practice;

import javax.swing.*;

public class JTextfie {

    public static void main(String args[]) {

        JFrame a = new JFrame("Enter your name Box ");
        JTextField b = new JTextField();

        b.setBounds(40, 90, 200, 50);

        a.add(b);

        a.setSize(300, 300);
        a.setLayout(null);
        a.setVisible(true);
    }

}
