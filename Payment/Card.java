package Payment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Card extends JFrame  implements ActionListener
{
     ImageIcon img;
	JLabel nameLabel, passLabel,imgLabel,cvvLabel;
     JTextField userTF;
	JPasswordField passPF,passPF2;
	JButton  backBtn,PaymentBtn;
     JPanel panel;
	Color myColor;
	Font myFont;

     public Card()
     {
          super("Mobile banking ");
          this .setSize( 850,500);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
           this.setResizable(false);

          JPanel panel = new JPanel();
		panel.setLayout(null);
		myColor = new Color(230, 230, 250);
		panel.setBackground(myColor);

          nameLabel = new JLabel("Name on card :");
		nameLabel.setBounds(150, 100, 140, 25);
		nameLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		//myColor = new Color(210, 230, 135);
		//nameLabel.setFont(myColor);
		nameLabel.setFont(myFont);
		panel.add(nameLabel);


          userTF = new JTextField();
		userTF.setBounds(300,100, 250, 30);
		//userTF.setBackground(Color.CYAN);
		panel.add(userTF);
		
		passLabel = new JLabel("Card Number ");
		passLabel.setBounds(150, 150, 200, 35);
          myFont = new Font("Cambria", Font.PLAIN, 18);
          //passLabel.setBackground(Color .LIGHT_GRAY);
         // passLabel.setForeground(Color.black);
		passLabel.setFont(myFont);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(300, 150, 250, 30);
		passPF.setEchoChar('*');
		panel.add(passPF);
		

          cvvLabel = new JLabel("   CVV/CVV2 ");
		cvvLabel.setBounds(150, 220, 200, 35);
          myFont = new Font("Cambria", Font.PLAIN, 18);
          //passLabel.setBackground(Color .LIGHT_GRAY);
         // passLabel.setForeground(Color.black);
		passLabel.setFont(myFont);
		panel.add(cvvLabel);
		
		passPF2 = new JPasswordField();
		passPF2.setBounds(300, 220, 70, 30);
		passPF2.setEchoChar('*');
		panel.add(passPF2);

          PaymentBtn = new JButton("Payment");
		PaymentBtn.setBounds(450, 400, 140, 50);
		PaymentBtn.setBackground(Color.GREEN);
		PaymentBtn.addActionListener(this);
		panel.add(PaymentBtn);

		backBtn = new JButton("back");
		backBtn.setBounds(230, 400, 80, 30);
		backBtn.setBackground(Color.GREEN);
		backBtn.addActionListener(this);
		panel.add(backBtn);


          this.add(panel);
     }

     public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==backBtn)
		{
			Paymentmethood m1=new Paymentmethood();
			m1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==PaymentBtn)
		{
			String name = userTF.getText();
               String cardNumber = new String(passPF.getPassword());
               String cvv = new String(passPF2.getPassword());

			if(name.length() <= 5||cardNumber.length() != 16||cvv.length() != 3)
			{

				JOptionPane.showMessageDialog(this, "Name must be more than 5 characters or Card number must be 16 digits or CVV must be 3 digits", "Invalid Input", JOptionPane.ERROR_MESSAGE);
			}

			else
			{
				Confirmation c2=new Confirmation();
			c2.setVisible(true);
			this.setVisible(false);

			}
			
		}
	} 
	
	public static void main(String[] args) 
	{

		Card frame = new Card();
		frame.setVisible(true);
	}
}
