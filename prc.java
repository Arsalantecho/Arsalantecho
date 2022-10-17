import javax.swing.*;
import java.util.*;
import java.util.Timer;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class prc {

    static int depositt = 0;
    static int blnce;

    // String accno;
    final static String pass = "arsiarsi";

    static void depositbtn() {
        JFrame dp = new JFrame("DEPOSIT");
        dp.setSize(500, 500);
        dp.setLayout(null);
        dp.setVisible(true);
        JLabel dpl, dtel, tmel, rcpl;
        dpl = new JLabel("DEPOSIT");
        dpl.setBounds(180, 30, 70, 30);
        dp.add(dpl);
        dtel = new JLabel("TIME");
        tmel = new JLabel("DATE");
        dtel.setBounds(300, 60, 70, 30);
        tmel.setBounds(350, 60, 70, 30);
        dp.add(dtel);
        dp.add(tmel);
        rcpl = new JLabel("WANT RECEIPT");
        rcpl.setBounds(30, 230, 150, 30);
        dp.add(rcpl);
        JTextField ea = new JTextField("ENTER AMOUNT");
        ea.setBounds(30, 150, 120, 30);
        ea.setEditable(false);
        dp.add(ea);
        JTextField bal = new JTextField("YOUR BALNCE WILL BE");
        bal.setBounds(30, 190, 180, 30);
        bal.setEditable(false);
        dp.add(bal);

        JTextField eat = new JTextField();
        eat.setBounds(240, 150, 70, 30);
        dp.add(eat);
        JTextField balt = new JTextField();
        balt.setBounds(240, 190, 70, 30);
        balt.setEditable(false);
        dp.add(balt);
        JButton chbb = new JButton("CHECK");
        chbb.setBounds(240, 230, 100, 30);
        chbb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = eat.getText();
                int a = Integer.parseInt(s1);
                depositt = depositt + a;
                String rslt = String.valueOf(depositt);
                balt.setText(rslt);

            }

        });
        dp.add(chbb);
        JCheckBox cb = new JCheckBox();
        cb.setBounds(120, 232, 20, 20);
        cb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ee) {
                if (ee.getStateChange() == 1) {
                    // prntstate();
                }

            }

        });
        dp.add(cb);
        JButton fdp = new JButton("DEPOSIT");
        fdp.setBounds(120, 275, 120, 30);
        fdp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sss = eat.getText();
                int a = Integer.parseInt(sss);
                if (sss.length() == 0) {
                    JOptionPane.showMessageDialog(fdp, "sorry no amount mention", "failed", 0);
                } else {

                    JOptionPane.showMessageDialog(fdp, "SUCCESSFULLY DEPOSIT", "DONE", 0);

                }
            }
        });
        dp.add(fdp);

    }

    static void dshb() {

        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");

        String str = ft.format(new Date());

        Date timDate = (Date) Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        String strDate = dateFormat.format(timDate);

        JFrame db = new JFrame("dashboard");
        JLabel timlabel = new JLabel();
        JLabel datelabel = new JLabel(str);
        timlabel.setBounds(710, 120, 100, 30);
        datelabel.setBounds(600, 120, 100, 30);
        db.setSize(800, 800);
        db.setLayout(null);
        db.setVisible(true);

        JLabel dl = new JLabel("WELCOME TO YOUR DASHBOARD ");
        dl.setBounds(50, 50, 250, 30);
        db.add(dl);

        JLabel usid, usac, usbnk;
        JLabel datel, timel;
        JTextField usidt, usact;

        JButton dbtn, withb, chkb, trnsbtn;

        usid = new JLabel("USER ID : ");
        usac = new JLabel("USER ACCOUNT NO :");
        usbnk = new JLabel("Bank : MEEZAN BANK (PVT.LIMITED)");

        datel = new JLabel("DATE :  ");
        timel = new JLabel("TIME :  ");

        dbtn = new JButton("DEPOSIT");
        withb = new JButton("WITHDRAW");
        chkb = new JButton("CHECK BALANCE");
        trnsbtn = new JButton("TRNSCTN HSTRY");

        usidt = new JTextField();
        usact = new JTextField();

        // dttf = new JTextField();
        // ttf = new JTextField();

        // dttf.setText(timeStamp);
        usid.setBounds(20, 90, 80, 30);
        usac.setBounds(20, 130, 120, 30);
        usbnk.setBounds(20, 170, 210, 30);

        usidt.setBounds(150, 90, 80, 30);
        usact.setBounds(150, 130, 150, 30);

        datel.setBounds(620, 90, 80, 30);
        timel.setBounds(720, 90, 80, 30);

        // //dttf.setBounds(680, 90, 80, 30);
        // //ttf.setBounds(680, 120, 80, 30);

        dbtn.setBounds(50, 250, 220, 40);
        withb.setBounds(50, 300, 220, 40);
        chkb.setBounds(50, 350, 220, 40);
        trnsbtn.setBounds(50, 400, 220, 40);

        // dttf.setText();
        // //ttf.setEditable(false);
        // //dttf.setEditable(false);
        usidt.setEditable(false);
        usact.setEditable(false);
        // buttons actions
        dbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                depositbtn();
            }
        });
        // db.add(dttf);
        db.add(datel);
        db.add(timel);
        db.add(usid);
        db.add(usac);
        db.add(usbnk);
        db.add(usidt);
        db.add(usact);
        // db.add(ttf);
        db.add(dbtn);
        db.add(withb);
        db.add(chkb);
        db.add(trnsbtn);
        db.add(timlabel);
        db.add(datelabel);

    }

    public static void main(String[] args) {

        String pa = "arsalan";
        JTextField tid, tacc, tpass;
        JTextField tidin, taccin;
        JPasswordField pfin = new JPasswordField();
        JFrame mf = new JFrame("Meezan Bank");
        tid = new JTextField("ENTER YOUR ID ");
        tacc = new JTextField("ENTER YOUR ACCOUNT NO  ");
        tpass = new JTextField("ENTER YOUR PASSWORD ");

        tidin = new JTextField();
        taccin = new JTextField();
        // tpassin = new JTextField();

        tidin.setBounds(250, 100, 90, 30);
        taccin.setBounds(250, 150, 90, 30);
        pfin.setBounds(250, 200, 90, 30);

        tid.setBounds(50, 100, 180, 30);
        tacc.setBounds(50, 150, 180, 30);
        tpass.setBounds(50, 200, 180, 30);

        JLabel ml = new JLabel("WELCOME TO MEEEZAN BANK LOGIN");
        JButton lb = new JButton("LOGIN");
        lb.setBounds(100, 250, 100, 40);

        ml.setBounds(50, 50, 250, 30);
        mf.setSize(400, 400);
        mf.setLayout(null);
        mf.setVisible(true);

        mf.add(ml);

        tid.setEditable(false);
        tacc.setEditable(false);
        tpass.setEditable(false);

        mf.add(tid);
        mf.add(tacc);
        mf.add(tpass);
        mf.add(lb);
        mf.add(tidin);
        mf.add(taccin);
        mf.add(pfin);

        // String idd = tidin.getText();
        // String accc = taccin.getText();

        lb.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String passs;
                passs = new String(tidin.getText());

                // JLabel ps = new JLabel();
                // ps.setBounds(20, 20, 150, 30);
                // ps.setText(passs);

                if (passs != pass) {
                    mf.setVisible(false);

                    dshb();
                } else if (passs.length() == 0) {
                    JOptionPane.showMessageDialog(lb, "please fill all ", "information", 0);

                }

                else {
                    JOptionPane.showMessageDialog(lb, "invalid info", "information", 0);

                }

            }
        });

    }

}
