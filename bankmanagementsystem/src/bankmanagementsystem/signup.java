package bankmanagementsystem;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class signup extends  JFrame implements ActionListener {
		Random num = new Random();
		long first4 =(num.nextLong() % 9000L) +1000L;
	    String first = " " + Math.abs(first4);
	    JTextField textName , textLastName, textEmail,textAddress,textcity,textPin,textState,textPan,textAadhar;
	    JRadioButton r1,r2,r3,r4,r5,r6;
	    JButton  next;
	    JComboBox comboBox,comboBox2,comboBox3;
	signup(){
		super("APPLICATION FORM");
		
		 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
	        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        JLabel image = new JLabel(i3);
	        image.setBounds(25,10,100,100);
	        add(image);
	        
	        JLabel label1 = new  JLabel("Application Form No : " + first);
	        label1.setBounds(160,20,600,49);
	        label1.setFont(new Font("Arial", Font.BOLD, 38));
	        add(label1);
	        
	        JLabel label2 = new JLabel("Page 1");
	        label2.setFont(new Font("Arial", Font.BOLD, 22));
	        label2.setBounds(330,68,600,30);
	        add(label2);
	        
	        JLabel label3 = new JLabel("Person Details");
	        label3.setFont(new Font("Arial", Font.BOLD, 22));
	        label3.setBounds(290,95,600,30);
	        add(label3);

	        JLabel labelName = new JLabel("First Name :");
	        labelName.setFont(new Font("Arial", Font.BOLD, 20));
	        labelName.setBounds(100,190,150,30);
	        add(labelName);

	        textName = new JTextField();
	        textName.setFont(new Font("Arial",Font.BOLD, 14));
	        textName.setBounds(300,190,400,30);
	        add(textName);
	        
	        JLabel labelLast = new JLabel("Last Name :");
	        labelLast.setFont(new Font("Arial", Font.BOLD, 20));
	        labelLast.setBounds(100,240,200,30);
	        add(labelLast);
	        
	        textLastName = new JTextField();
	        textLastName.setFont(new Font("Arial", Font.BOLD, 20));
	        textLastName.setBounds(300,240,400,30);
	        add(textLastName);

	        JLabel labelGender = new JLabel("Gender : ");
	        labelGender.setFont(new Font("Arial", Font.BOLD, 20));
	        labelGender.setBounds(100,287,200,30);
	        add(labelGender);
	        
	        r1 = new JRadioButton("Male");
	        r1.setFont((new Font("Arial", Font.BOLD,14)));
	        r1.setBackground(new Color(95, 149, 237));
	        r1.setBounds(300,290,60,30);
	        add(r1);
	        
	        r2 = new JRadioButton("Female");
	        r2.setFont((new Font("Arial", Font.BOLD,14)));
	        r2.setBackground(new Color(95, 149, 237));
	        r2.setBounds(450,290,90,30);
	        add(r2);
	        
	        ButtonGroup buttonGroup = new ButtonGroup();
	        buttonGroup.add(r1);
	        buttonGroup.add(r2);
	        
	        JLabel email = new JLabel("E-mail :");
	        email.setFont((new Font("Arial", Font.BOLD,20)));
	        email.setBounds(100,330,200,30);
	        add(email);
	        
	        textEmail = new JTextField();
	        textEmail.setFont((new Font("Arial", Font.BOLD,20)));
	        textEmail.setBounds(300,330,400,30);
	        add(textEmail);
	        
	        JLabel labelAddress = new JLabel("Address :");
	        labelAddress.setFont(new Font("Arial", Font.BOLD, 20));
	        labelAddress.setBounds(100,370,200,30);
	        add(labelAddress);
	        
	        textAddress = new JTextField();
	        textAddress.setFont((new Font("Arial", Font.BOLD,20)));
	        textAddress.setBounds(300,370,400,30);
	        add(textAddress);
	        
	        JLabel labelCity = new JLabel("City :");
	        labelCity.setFont(new Font("Arial", Font.BOLD, 20));
	        labelCity.setBounds(100,410,200,30);
	        add(labelCity);

	        textcity = new JTextField();
	        textcity.setFont(new Font("Arial",Font.BOLD, 14));
	        textcity.setBounds(300,410,400,30);
	        add(textcity);

	        JLabel labelPin = new JLabel("Pin Code :");
	        labelPin.setFont(new Font("Arial", Font.BOLD, 20));
	        labelPin.setBounds(100,450,200,30);
	        add(labelPin);

	        textPin = new JTextField();
	        textPin.setFont(new Font("Arial",Font.BOLD, 14));
	        textPin.setBounds(300,450,400,30);
	        add(textPin);

	        JLabel labelstate = new JLabel("State :");
	        labelstate.setFont(new Font("Arial", Font.BOLD, 20));
	        labelstate.setBounds(100,490,200,30);
	        add( labelstate);

	        textState = new JTextField();
	        textState.setFont(new Font("Arial",Font.BOLD, 14));
	        textState.setBounds(300,490,400,30);
	        add(textState);

	        JLabel lcategory = new JLabel("Category : ");
	        lcategory.setFont(new Font("Arial", Font.BOLD,18));
	        lcategory.setBounds(100,530,100,30);
	        add(lcategory);
	        
	        String Category [] = {"General","OBC","SC", "ST", "Other"};
	        comboBox = new JComboBox(Category);
	        comboBox.setBackground(Color.WHITE);
	        comboBox.setFont(new Font("Arial",Font.BOLD,14));
	        comboBox.setBounds(300,530,200,30);
	        add(comboBox);
	        
	        JLabel lincome = new JLabel("Income : ");
	        lincome.setFont(new Font("Arial", Font.BOLD,18));
	        lincome.setBounds(100,570,200,30);
	        add(lincome);
	        
	        String income [] = {"Null","<1,50,000","<2,50,000", "5,00,000", "Uptp 10,00,000","Above 10,00,000"};
	        comboBox2 = new JComboBox(income);
	        comboBox2.setBackground(Color.WHITE);
	        comboBox2.setFont(new Font("Arial",Font.BOLD,14));
	        comboBox2.setBounds(300,570,320,30);
	        add(comboBox2);
	        
	        JLabel locc = new JLabel("Occupation : ");
	        locc.setFont(new Font("Arial", Font.BOLD,18));
	        locc.setBounds(100,610,200,30);
	        add(locc);

	        String Occupation [] = {"Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
	        comboBox3 = new JComboBox(Occupation);
	        comboBox3.setBackground(Color.WHITE);
	        comboBox3.setFont(new Font("Arial",Font.BOLD,14));
	        comboBox3.setBounds(300,610,320,30);
	        add(comboBox3); 

	        JLabel lPan = new JLabel("PAN Number : ");
	        lPan.setFont(new Font("Arial", Font.BOLD,18));
	        lPan.setBounds(100,648,200,30);
	        add(lPan);

	        textPan = new JTextField();
	        textPan.setFont(new Font("Arial", Font.BOLD,18));
	        textPan.setBounds(300,648,320,30);
	        add(textPan);

	        JLabel lAadhar = new JLabel("Aadhar Number : ");
	        lAadhar.setFont(new Font("Arial", Font.BOLD,18));
	        lAadhar.setBounds(100,680,200,30);
	        add(lAadhar);

	        textAadhar = new JTextField();
	        textAadhar.setFont(new Font("Arial", Font.BOLD,18));
	        textAadhar.setBounds(300,680,200,30);
	        add(textAadhar);
	        
	        JLabel lSc = new JLabel("Senior Citizen : ");
	        lSc.setFont(new Font("Arial", Font.BOLD,18));
	        lSc.setBounds(100,720,200,30);
	        add(lSc);

	        r3 = new JRadioButton("Yes");
	        r3.setFont((new Font("Arial", Font.BOLD,14)));
	        r3.setBackground(new Color(95, 149, 237));
	        r3.setBounds(300,720,60,30);
	        add(r3);
	        
	        r4 = new JRadioButton("No");
	        r4.setFont((new Font("Arial", Font.BOLD,14)));
	        r4.setBackground(new Color(95, 149, 237));
	        r4.setBounds(450,720,90,30);
	        add(r4);
	        
	        ButtonGroup buttonGroup1 = new ButtonGroup();
	        buttonGroup1.add(r3);
	        buttonGroup1.add(r4);

	        JLabel lEacc = new JLabel("Existing Account : ");
	        lEacc.setFont(new Font("Arial", Font.BOLD,18));
	        lEacc.setBounds(100,750,200,30);
	        add(lEacc);

	        r5 = new JRadioButton("Yes");
	        r5.setFont((new Font("Arial", Font.BOLD,14)));
	        r5.setBackground(new Color(95, 149, 237));
	        r5.setBounds(300,750,60,30);
	        add(r5);
	        
	        r6 = new JRadioButton("No");
	        r6.setFont((new Font("Arial", Font.BOLD,14)));
	        r6.setBackground(new Color(95, 149, 237));
	        r6.setBounds(450,750,90,30);
	        add(r6);
	        
	        ButtonGroup buttonGroup2 = new ButtonGroup();
	        buttonGroup2.add(r5);
	        buttonGroup2.add(r6);

	        next = new JButton("Next");
	        next.setFont(new Font("Arial",Font.BOLD, 14));
	        next.setBackground(Color.BLACK);
	        next.setForeground(Color.WHITE);
	        next.setBounds(620,810,80,30);
	        next.addActionListener(this);
	        add(next);

	        getContentPane().setBackground(new Color(95, 149, 237));		 
	        getContentPane().setBackground(new Color(95, 149, 237));
	        setLayout(null);
	        setSize(850,882);
	        setLocation(360,40);
	        setVisible(true);
		
	}
	
	  @Override
	 public void actionPerformed(ActionEvent e) {

	        String formno = first;
	        String name = textName.getText();
	        String Lname = textLastName.getText();
	        String Gender = null;
	        if(r1.isSelected()){
	        	 Gender = "Male";
	        }else if (r2.isSelected()){
	        	 Gender = "Female";
	        }
	        String email = textEmail.getText();
	        String address = textAddress.getText();
	        String city = textcity.getText();
	        String pincode = textPin.getText();
	        String state = textState.getText();
	        
	        String cate = (String) comboBox.getSelectedItem();
	        String inc = (String) comboBox2.getSelectedItem();
	        String occ = (String) comboBox3.getSelectedItem();
	        
	        String pan = textPan.getText();
	        String addhar = textAadhar.getText();
	        
	        String scitizen = " ";
	        if ((r3.isSelected())){
	            scitizen = "Yes";
	        } else if (r4.isSelected()) {
	            scitizen ="No";
	        }
	        String eAccount = " ";
	        if ((r5.isSelected())){
	            eAccount = "Yes";
	        } else if (r6.isSelected()) {
	            eAccount ="No";
	        }
		 
	        try{
	            if (textName.getText().equals("")){
	                JOptionPane.showMessageDialog(null, "Fill all the fields");
	            }else {
	            	conn c = new conn();
	                String q = "insert into signup values('"+formno+"', '"+name+"','"+Lname+"','"+Gender+"','"+email+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"','"+cate+"','"+inc+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
	                c.statement.executeUpdate(q);
	                new signup2(formno);
	                setVisible(false);
	            }

	        }catch (Exception E){
	            E.printStackTrace();
	        }
	 }
	
	public static void main(String[] args) {
	new signup();

	}
}
