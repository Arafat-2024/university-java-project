
package loging;
import javax.swing.*;
import Frame.Main;
import java.awt.*;
import java.awt.event.*; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;

public class First extends JFrame implements ActionListener
{
     ImageIcon img;
	JLabel nameLabel, passLabel,TimeLabel,imgLabel,login;
     JTextField userTF;
	JPasswordField passPF;
	JButton  loginBtn,Signup ,Admin;
     JPanel panel;
	Color myColor;
	Font myFont;
	JCheckBox showPasswordCheckbox;

     public First()
     {
          super("First Frame");
          this .setSize( 850,510);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          this.setResizable(false);

          JPanel panel = new JPanel();
		panel.setLayout(null);
		myColor = new Color(176, 196, 222);
		panel.setBackground(myColor);

          nameLabel = new JLabel("𝔏𝔬𝔤𝔦𝔫");
		nameLabel.setBounds(650, 35, 150, 50);
		nameLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 40);
		myColor = new Color(176, 196, 222);
		//nameLabel.setForeground(Color.myColor);
		//nameLabel.setFont(myColor);
		nameLabel.setFont(myFont);
		panel.add(nameLabel);

          nameLabel = new JLabel("Name : ");
		nameLabel.setBounds(450, 100, 80, 20);
		nameLabel.setBackground(Color .LIGHT_GRAY);
		nameLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		nameLabel.setForeground(Color.black);
		nameLabel.setFont(myFont);
		panel.add(nameLabel);

          userTF = new JTextField();
		userTF.setBounds(530, 100, 100, 20);
		userTF.setBackground(Color.CYAN);
		panel.add(userTF);
		
		passLabel = new JLabel("Password : ");
		passLabel.setBounds(450, 135, 100, 30);
          myFont = new Font("Cambria", Font.PLAIN, 18);
          passLabel.setBackground(Color .LIGHT_GRAY);
          passLabel.setForeground(Color.black);
		passLabel.setFont(myFont);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(550, 135, 80, 30);
		passPF.setEchoChar('*');
		panel.add(passPF);

		// Show Password checkbox
		showPasswordCheckbox = new JCheckBox("Show Password");
		showPasswordCheckbox.setBounds(640, 170, 150, 20);
		showPasswordCheckbox.setBackground(myColor);
		showPasswordCheckbox.addActionListener(this);
		panel.add(showPasswordCheckbox);
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(570, 400, 80, 30);
		loginBtn.setBackground(Color.GREEN);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);
		
		
		Signup = new JButton("Sign up");
		Signup.setBounds(660, 400, 80, 30);
		Signup.setBackground(Color.RED);
		Signup.addActionListener(this);
		panel.add(Signup);

		/*Admin = new JButton("Admin");
		Admin.setBounds(490, 400, 80, 30);
		Admin.setBackground(Color.GREEN);
		Admin.addActionListener(this);
		panel.add(Admin);*/

		img = new ImageIcon("Image/images1.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(3, 3, 350, 490);
		panel.add(imgLabel);
          this.add(panel);
     }

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Signup)
		{
			 Registration r1=new Registration();
			 r1.setVisible(true);
			 this.setVisible(false);
		}


		else if (ae.getSource() == loginBtn) 
		{
                String enteredName = userTF.getText();
                char[] enteredPassword = passPF.getPassword();
                String enteredPasswordString = new String(enteredPassword);

            if (checkCredentials(enteredName, enteredPasswordString)) 
		  {
                // Credentials are correct, proceed to the main frame
                Main h1 = new Main();
                h1.setVisible(true);
                this.setVisible(false);
            } 
		  
		  else 
		  {
                // Credentials are incorrect, you may want to display an error message
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
		  
        }

	   else if (ae.getSource() == showPasswordCheckbox)
		   
		  {
			//  password visibility
			JCheckBox cb = (JCheckBox) ae.getSource();
			passPF.setEchoChar(cb.isSelected() ? 0 : '*');
		 }
	}

     private boolean checkCredentials(String enteredName, String enteredPassword) {
        try (BufferedReader br = new BufferedReader(new FileReader("people.txt"))) 
	    {
            String line;
            while ((line = br.readLine()) != null) 
		    {
                String[] parts = line.split(":");
                String storedName = parts[0].trim();
                String storedPassword = parts[1].trim();

                if (enteredName.equals(storedName) && enteredPassword.equals(storedPassword)) 
			 {
                    return true; // Credentials match
                }
               }
          } 
	   catch (IOException e) 
	    {
            e.printStackTrace(); // Handle the exception appropriately
          }

        return false; // Credentials do not match
    }
		
	
	public static void main(String[] args) 
	{

		First frame = new First();
		frame.setVisible(true);
	}
}
