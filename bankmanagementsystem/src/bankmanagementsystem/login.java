package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3,button4;
    
    login(){
        super("Bank Management System");
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image img2 = img1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image1 = new JLabel(img3);
        image1.setBounds(350,10,100,100);
        add(image1);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Arial", Font.BOLD, 38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Arial", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial", Font.BOLD,14));
        add(textField2);

        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Arial", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(330,300,100, 30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(450,300,100, 30);
        button2.addActionListener(this);
        add(button2);
        
        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(330,350,100, 30);
        button3.addActionListener(this);
        add(button3);
        
        button4 = new JButton("EXIT");
        button4.setFont(new Font("Arial", Font.BOLD, 14));
        button4.setForeground(Color.WHITE);
        button4.setBackground(Color.BLACK);
        button4.setBounds(450,350,100, 30);
        button4.addActionListener(this);
        add(button4);

        ImageIcon img7 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image img8 = img7.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon img9 = new ImageIcon(img8);
        JLabel image3 = new JLabel(img9);
        image3.setBounds(0,0,850,480);
        add(image3);

        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	try{
            if (e.getSource()==button1){
                conn c = new conn();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_number = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }
            }else if (e.getSource() == button2){
                textField2.setText("");
                passwordField3.setText("");
            }else if (e.getSource()==button4){
                    System.exit(0);
            }else if (e.getSource() == button3){
                new signup();
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new login();
    }
}