package Payment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Bkash extends JFrame  implements ActionListener
{
     ImageIcon img;
	JLabel nameLabel, passLabel,imgLabel;
     JTextField userTF;
	JPasswordField passPF;
	JButton  backBtn,PaymentBtn;
     JPanel panel;
	Color myColor;
	Font myFont;

     public Bkash()
     {
          super("Mobile banking ");
          this .setSize( 600,700);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
           this.setResizable(false);

          JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color .WHITE);

          nameLabel = new JLabel("Enter Your Mobile numder ");
		nameLabel.setBounds(250, 230, 260, 25);
		nameLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 20);
		myColor = new Color(210, 230, 135);
		//nameLabel.setFont(myColor);
		nameLabel.setFont(myFont);
		panel.add(nameLabel);


          userTF = new JTextField();
		userTF.setBounds(250,260, 150, 30);
		userTF.setBackground(Color.CYAN);
		panel.add(userTF);
		
		passLabel = new JLabel("Enter Your pin ");
		passLabel.setBounds(220, 400, 200, 35);
          myFont = new Font("Cambria", Font.PLAIN, 22);
          passLabel.setBackground(Color .LIGHT_GRAY);
          passLabel.setForeground(Color.black);
		passLabel.setFont(myFont);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(250, 430, 100, 25);
		passPF.setEchoChar('*');
		panel.add(passPF);
		
          PaymentBtn = new JButton("Payment");
		PaymentBtn.setBounds(350, 600, 140, 50);
		PaymentBtn.setBackground(Color.GREEN);
		PaymentBtn.addActionListener(this);
		panel.add(PaymentBtn);

		backBtn = new JButton("back");
		backBtn.setBounds(230, 600, 80, 30);
		backBtn.setBackground(Color.GREEN);
		backBtn.addActionListener(this);
		panel.add(backBtn);

          img = new ImageIcon("Image/images12.jpeg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(3, 3, 600, 700);
		panel.add(imgLabel);

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
			String mobileNumber = userTF.getText();
			String pin = new String(passPF.getPassword());
			if (mobileNumber.length() != 11 || pin.length() < 4) 
			{
				JOptionPane.showMessageDialog(null, "Mobile number must be 11 digits and pin must be at least 4 characters.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
			} 
			else 
			{
				Confirmation b2 = new Confirmation();
				b2.setVisible(true);
				this.setVisible(false);
			 }
			
		}
	}
	public static void main(String[] args) 
	{

		Bkash frame = new Bkash();
		frame.setVisible(true);
	}
}
