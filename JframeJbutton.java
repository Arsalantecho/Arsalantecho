
import javax.swing.*;

public class JframeJbutton {

    public static void main(String args[]) {

        JFrame a = new JFrame("sign up ");

        JButton b = new JButton("login");

        b.setBounds(40, 90, 100, 20);
        a.add(b);

        a.setSize(300, 300);
        a.setLayout(null);
        a.setVisible(true);
    }
}
