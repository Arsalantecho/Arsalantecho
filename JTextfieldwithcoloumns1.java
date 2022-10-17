
//import javax.net.ssl.TrustManagerFactory;
import javax.swing.*;

public class JTextfieldwithcoloumns1 extends JFrame {

    JTextfieldwithcoloumns1() {

        JTextField f = new JTextField("hi my name is arsalan ");

        f.setBounds(50, 50, 250, 50);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        add(f);
    }

    public static void main(String args[]) {
        new JTextfieldwithcoloumns1();

    }

}
