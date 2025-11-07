package Payment;
import javax.swing.*;

import Frame.Main;

import java.awt.*;
import java.awt.event.*; 
public class Paymentmethood extends JFrame implements ActionListener
{
     ImageIcon img,img2;
	JLabel nameLabel, bkashLabel,cardLabel,imgLabel,imgLabel1;
     JButton  NextBtn,BackBtn;
     JRadioButton  r1,r2;
     ButtonGroup bg1 ;
     Color myColor;
     Font myFont;
     public Paymentmethood()
     {
          super("Payment Methood");
          this .setSize( 850,510);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
           this.setResizable(false);

          JPanel panel = new JPanel();
		panel.setLayout(null);
		myColor = new Color(210, 230, 135);
		panel.setBackground(myColor);

          nameLabel = new JLabel("Chose one methood to payment ");
		nameLabel.setBounds(100, 75, 400, 30);
		nameLabel.setBackground(Color .LIGHT_GRAY);
		nameLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 22);
		nameLabel.setForeground(Color.black);
		nameLabel.setFont(myFont);
		panel.add(nameLabel);


          bkashLabel = new JLabel("Mobile Banking ");
		bkashLabel.setBounds(300, 200, 200, 20);
		bkashLabel.setBackground(Color .LIGHT_GRAY);
		bkashLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 22);
		bkashLabel.setForeground(Color.black);
		bkashLabel.setFont(myFont);
		panel.add(bkashLabel);

          r1 = new JRadioButton("Bkash");
		r1.setBounds(310, 230, 100, 20);
		r1.setBackground(Color.ORANGE); 
          myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r1);
		
		r2 = new JRadioButton("Visa");
		r2.setBounds(310, 320, 100, 20);
		r2.setOpaque(false);
          myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r2);

          bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);

          cardLabel = new JLabel(" card ");
		cardLabel.setBounds(300, 300, 80, 20);
		cardLabel.setBackground(Color .LIGHT_GRAY);
		cardLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 22);
		cardLabel.setForeground(Color.black);
		cardLabel.setFont(myFont);
		panel.add(cardLabel);

          NextBtn = new JButton("Next");
		NextBtn.setBounds(660, 400, 100, 30);
		NextBtn.setBackground(Color.GREEN);
		NextBtn.addActionListener(this); 
		panel.add(NextBtn);

		BackBtn = new JButton("Back");
		BackBtn.setBounds(460, 400, 90, 30);
		BackBtn.setBackground(Color.WHITE);
          myFont = new Font("Cambria", Font.PLAIN, 18);
		BackBtn.addActionListener(this); 
		BackBtn.setFont(myFont);
		panel.add(BackBtn);

		img = new ImageIcon("");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(300, 200, 60, 50);
		panel.add(imgLabel);

		img2 = new ImageIcon("Image/images11.png");
		imgLabel1 = new JLabel(img2);
		imgLabel.setBounds(300, 300, 60, 50);
		panel.add(imgLabel);

          this.add(panel);
     }

	public void actionPerformed(ActionEvent ae) 
	{
          if (ae.getSource() == NextBtn) {
              if (r1.isSelected()) {
                  // Open the page related to the "Bus" option
                  Bkash b1=new Bkash();
                  b1.setVisible(true);
                  this.setVisible(false);
                  
              } 
		    else if (r2.isSelected()) 
		    {
                  // Open the page related to the "Launge" option
                  Card l1 = new Card();
                  l1.setVisible(true);
                  this.setVisible(false);
              } 
		     else 
			{
                  JOptionPane.showMessageDialog(null, "Please select an option");
              }
          } 
		
		else if (ae.getSource() == BackBtn) 
          {
              // Handle the Back button action if needed
              Main f2=new Main();
			f2.setVisible(true);
			this.setVisible(false);
          }
      }

	 public static void main(String[] args) 
	{

		Paymentmethood frame = new Paymentmethood();
		frame.setVisible(true);
	}
}
