
import javax.swing.*;

public class JScroll {

    JScroll() {

        JFrame a = new JFrame("scroll bar example");
        JScrollBar b = new JScrollBar();

        b.setBounds(190, 190, 40, 400);

        a.add(b);
        a.setLayout(null);
        a.setSize(200, 200);

        a.setVisible(true);

    }

    public static void main(String[] args) {
        new JScroll();

    }

}
