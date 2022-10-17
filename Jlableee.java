
import javax.swing.*;

public class Jlableee {
    Jlableee() {

        JFrame f = new JFrame("label example");
        JLabel l1, l2;

        l1 = new JLabel("hello this is first label ");
        l2 = new JLabel("hello this is second label ");
        // l2.setFont();

        l1.setBounds(50, 100, 100, 30);
        l2.setBounds(50, 50, 100, 30);

        f.add(l1, l2);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String args[]) {

        new Jlableee();

    }
}
