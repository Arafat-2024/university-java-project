package loging;
import javax.swing.*;
import People.Customer;
import java.awt.*;
import java.awt.event.*;
public class Registration   extends JFrame implements ActionListener
{
     ImageIcon img;
	JLabel nameLabel, passLabel,EmailLabel,phoneLabel,imgLabel;
     JTextField userTF, phoneField,emailField; 
     JButton   RegisterBtn ,BackBtn;
     JPanel panel;
	Color myColor;
	JPasswordField passPF;
	Font myFont;

     public Registration()
     {

          super("Singup Frame");
          this .setSize( 850,550);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setResizable(false);

          JPanel panel = new JPanel();
		panel.setLayout(null);
		myColor = new Color(176, 196, 222);
		panel.setBackground(myColor);

          nameLabel = new JLabel("Name : ");
		nameLabel.setBounds(375, 100, 80, 25);
		nameLabel.setBackground(Color .LIGHT_GRAY);
		nameLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		nameLabel.setForeground(Color.black);
		nameLabel.setFont(myFont);
		panel.add(nameLabel);

          passLabel = new JLabel("password : ");
		passLabel.setBounds(375, 140, 100, 25);
		passLabel.setBackground(Color .LIGHT_GRAY);
		passLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		passLabel.setForeground(Color.black);
		passLabel.setFont(myFont);
		panel.add(passLabel);

          EmailLabel = new JLabel(" Em@il : ");
		EmailLabel.setBounds(375,180, 80, 25);
		EmailLabel.setBackground(Color .LIGHT_GRAY);
		EmailLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		EmailLabel.setForeground(Color.black);
		EmailLabel.setFont(myFont);
		panel.add(EmailLabel);

          phoneLabel = new JLabel("Mobile Number: ");
		phoneLabel.setBounds(375, 220, 150, 25);
		phoneLabel.setBackground(Color .LIGHT_GRAY);
		phoneLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		phoneLabel.setForeground(Color.black);
		phoneLabel.setFont(myFont);
		panel.add(phoneLabel);

          userTF = new JTextField();
		userTF.setBounds(475, 100, 100, 25);
		userTF.setBackground(Color.CYAN);
		panel.add(userTF);

		passPF = new JPasswordField();
		passPF.setBounds(475, 140, 100, 25);
		passPF.setEchoChar('*');
		panel.add(passPF);

          emailField = new JTextField();
		emailField.setBounds(475, 180, 150, 25);
		emailField.setBackground(Color.CYAN);
		panel.add(emailField);

		phoneField = new JTextField();
		phoneField.setBounds(530, 220, 140, 30);
		phoneField.setBackground(Color.CYAN);
		panel.add(phoneField);

        /*  String items[] = {"CSE", "CS", "CSSE", "SE", "CIS"};
		combo = new JComboBox(items);
		combo.setBounds(550, 70, 100, 30);
		panel.add(combo);*/ 

           RegisterBtn = new JButton("Register ");
           RegisterBtn.setBounds(500, 350, 200, 50);
           RegisterBtn.setBackground(Color.GREEN);
		 RegisterBtn.addActionListener(this);
		 panel.add(  RegisterBtn);

		BackBtn = new JButton("Back");
		BackBtn.setBounds(400, 350, 100, 50);
		BackBtn.setBackground(Color.RED);
          BackBtn.addActionListener(this); 
		panel.add(BackBtn);

		img = new ImageIcon("Image/images2.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 350, 490);
		panel.add(imgLabel);
          this.add(panel);

     }


     public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()== RegisterBtn)
		{
               String name=userTF.getText();
			//String pass=passfield.getText();
			String pass = new String(passPF.getPassword());
               String email= emailField.getText();
               String  number=  phoneField .getText();

               if(pass.length() <= 3||email. isEmpty()|| number.length() != 11)
			{
				JOptionPane.showMessageDialog(null,"Password must be more than 3 characters.Must be a Gmail address.Mobile number must be 11 digits");
			}

               else {
                    // Assuming Custoomer and addCustoomer methods exist
                    Customer acc = new Customer(name, pass, email, number);
                    acc.addCustoomer();
    
                    JOptionPane.showMessageDialog(null, "Successfully Registered");
    
                    userTF.setText("");
                    passPF.setText("");
                    emailField.setText("");
                    phoneField.setText("");
    
                    First f1 = new First();
                    f1.setVisible(true);
                    this.setVisible(false);
                }
			
		}
		else if (ae.getSource() == BackBtn) 
          {
              // Handle the Back button action if needed
               First f2=new First();
			f2.setVisible(true);
			this.setVisible(false);
          }
		
	} 
	
	

     public static void main(String[] args) {

          Registration frame = new  Registration();
		frame.setVisible(true);
	 }
}
