package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class signup2 extends JFrame implements ActionListener {
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;
	JRadioButton radiob1,radiob2,radiob3,radiob4;
    JCheckBox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5, checkbox6;
    JButton submit,cancel;
    String formno;
    signup2(String formno){

        this.formno = formno;

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image img2 = img1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image1 = new JLabel(img3);
        image1.setBounds(150,5,100,100);
        add(image1);

        label1 = new JLabel("Page 2:");
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.setBounds(280,40,400,40);
        add(label1);

        label2 = new JLabel("Account Details");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(280,70,400,40);
        add(label2);

        label3 = new JLabel("Account Type:");
        label3.setFont(new Font("Raleway",Font.BOLD,18));
        label3.setBounds(100,140,200,30);
        add(label3);

        radiob1 = new JRadioButton("Saving Account");
        radiob1.setFont(new Font("Raleway",Font.BOLD,16));
        radiob1.setBackground(new Color(144, 183, 245));
        radiob1.setBounds(100,180,150,30);
        add(radiob1);

        radiob2 = new JRadioButton("Fixed Deposit Account");
        radiob2.setFont(new Font("Raleway",Font.BOLD,16));
        radiob2.setBackground(new Color(144, 183, 245));
        radiob2.setBounds(350,180,300,30);
        add(radiob2);

        radiob3 = new JRadioButton("Current Account");
        radiob3.setFont(new Font("Raleway",Font.BOLD,16));
        radiob3.setBackground(new Color(144, 183, 245));
        radiob3.setBounds(100,220,250,30);
        add(radiob3);

        radiob4 = new JRadioButton("Recurring Deposit Account");
        radiob4.setFont(new Font("Raleway",Font.BOLD,16));
        radiob4.setBackground(new Color(144, 183, 245));
        radiob4.setBounds(350,220,250,30);
        add(radiob4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radiob1);
        buttonGroup.add(radiob2);
        buttonGroup.add(radiob3);
        buttonGroup.add(radiob4);

        label4 = new JLabel("Card Number:");
        label4.setFont(new Font("Raleway",Font.BOLD,18));
        label4.setBounds(100,300,200,30);
        add(label4);

        label5 = new JLabel("(Your 16-digit Card Number)");
        label5.setFont(new Font("Raleway",Font.BOLD,12));
        label5.setBounds(100,330,200,20);
        add(label5);

        label6 = new JLabel("XXXX-XXXX-XXXX-4841");
        label6.setFont(new Font("Raleway",Font.BOLD,18));
        label6.setBounds(330,300,250,30);
        add(label6);

        label7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        label7.setFont(new Font("Raleway",Font.BOLD,12));
        label7.setBounds(330,330,500,20);
        add(label7);

        label8 = new JLabel("PIN:");
        label8.setFont(new Font("Raleway",Font.BOLD,18));
        label8.setBounds(100,370,200,30);
        add(label8);

        label9 = new JLabel("XXXX");
        label9.setFont(new Font("Raleway",Font.BOLD,18));
        label9.setBounds(330,370,200,30);
        add(label9);

        label10 = new JLabel("(4-digit Password)");
        label10.setFont(new Font("Raleway",Font.BOLD,12));
        label10.setBounds(100,400,200,20);
        add(label10);

        label11 = new JLabel("Services Required:");
        label11.setFont(new Font("Raleway",Font.BOLD,18));
        label11.setBounds(100,450,200,30);
        add(label11);

        checkbox1 = new JCheckBox("ATM CARD");
        checkbox1.setBackground(new Color(144, 183, 245));
        checkbox1.setFont(new Font("Raleway",Font.BOLD,16));
        checkbox1.setBounds(100,500,200,30);
        add(checkbox1);

        checkbox2 = new JCheckBox("Internet Banking");
        checkbox2.setBackground(new Color(144, 183, 245));
        checkbox2.setFont(new Font("Raleway",Font.BOLD,16));
        checkbox2.setBounds(350,500,200,30);
        add(checkbox2);

        checkbox3 = new JCheckBox("Mobile Banking");
        checkbox3.setBackground(new Color(144, 183, 245));
        checkbox3.setFont(new Font("Raleway",Font.BOLD,16));
        checkbox3.setBounds(100,550,200,30);
        add(checkbox3);

        checkbox4 = new JCheckBox("EMAIL Alerts");
        checkbox4.setBackground(new Color(144, 183, 245));
        checkbox4.setFont(new Font("Raleway",Font.BOLD,16));
        checkbox4.setBounds(350,550,200,30);
        add(checkbox4);

        checkbox5 = new JCheckBox("Cheque Book");
        checkbox5.setBackground(new Color(144, 183, 245));
        checkbox5.setFont(new Font("Raleway",Font.BOLD,16));
        checkbox5.setBounds(100,600,200,30);
        add(checkbox5);

        checkbox6 = new JCheckBox("E-Statement");
        checkbox6.setBackground(new Color(144, 183, 245));
        checkbox6.setFont(new Font("Raleway",Font.BOLD,16));
        checkbox6.setBounds(350,600,200,30);
        add(checkbox6);

        JCheckBox c7 = new JCheckBox("I here by decleares that the above entered details correct to the best of my knlowledge.",true);
        c7.setBackground(new Color(144, 183, 245));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,20);
        add(c7);

        label12 = new JLabel("Form No : ");
        label12.setFont(new Font("Raleway", Font.BOLD,14));
        label12.setBounds(700,10,100,30);
        add(label12);

        label13 = new JLabel(formno);
        label13.setFont(new Font("Raleway", Font.BOLD,14));
        label13.setBounds(760,10,60,30);
        add(label13);

        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD,14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD,14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(new Color(144, 183, 245));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (radiob1.isSelected()){
            atype = "Saving Account";
        } else if (radiob2.isSelected()) {
            atype ="Fixed Deposit Account";
        }else if (radiob3.isSelected()){
            atype ="Current Account";
        }else if (radiob4.isSelected()){
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(checkbox1.isSelected()){
            fac = fac+"ATM CARD ";
        } else if (checkbox2.isSelected()) {
            fac = fac+"Internet Banking";
        } else if (checkbox3.isSelected()) {
            fac = fac+"Mobile Banking";
        } else if (checkbox4.isSelected()) {
            fac = fac+"EMAIL Alerts";
        } else if (checkbox5.isSelected()) {
            fac=fac+"Cheque Book";
        } else if (checkbox6.isSelected()) {
            fac=fac+"E-Statement";
        }

        try {
            if (e.getSource()==submit){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    conn c1 = new conn();
                    String q1 = "insert into signuptwo values('"+formno+"', '"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
                    new deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==cancel) {
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

public static void main(String[] args) {
    new signup2("");
}
}
