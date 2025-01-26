package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class deposit extends JFrame implements ActionListener {
   String pin;
   TextField textField;
   JLabel label1;
   JButton button1, button2;
    deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bankatm.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        textField = new TextField();
        textField.setBackground(Color.GRAY);
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Arial", Font.BOLD,22));
        l3.add(textField);

        button1 = new JButton("DEPOSIT");
        button1.setBounds(700,362,150,35);
        button1.setBackground(Color.GRAY);
        button1.setForeground(Color.WHITE);
        button1.addActionListener(this);
        l3.add(button1);

        button2 = new JButton("BACK");
        button2.setBounds(700,406,150,35);
        button2.setBackground(Color.GRAY);
        button2.setForeground(Color.WHITE);
        button2.addActionListener(this);
        l3.add(button2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            if (e.getSource()==button1){
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }else {
                    conn c = new conn();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            }else if (e.getSource()==button2){
                setVisible(false);
                new main_Class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new deposit("");
    }
}
