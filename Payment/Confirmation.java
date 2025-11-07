package Payment;
import javax.swing.*;

import Frame.Main;

import java.awt.*;
import java.awt.event.*;
public class Confirmation extends JFrame implements ActionListener
{

     JLabel imgLabel; 
     ImageIcon img;
     Color myColor;
     Font myFont;
     JButton  BackBtn;

     public Confirmation()
     {
          super("Confirmation page");
          this .setSize( 850,510);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
           this.setResizable(false);

          JPanel panel = new JPanel();
		panel.setLayout(null);
		myColor = new Color(210, 230, 135);
		panel.setBackground(myColor);

          BackBtn = new JButton("Back");
		BackBtn.setBounds(400, 400, 200, 45);
		BackBtn.setBackground(Color.RED);
		BackBtn.addActionListener(this); 
		panel.add(BackBtn);

          img = new ImageIcon("Image/images13.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 850, 550);
		panel.add(imgLabel);

          this.add(panel);
     }


     public void actionPerformed(ActionEvent ae) 
	{

          if (ae.getSource() == BackBtn) 
          {
              // Handle the Back button action if needed
              Main f2=new Main();
			f2.setVisible(true);
			this.setVisible(false);
          }
     }

     public static void main(String[] args) 
	{

		Confirmation  frame = new Confirmation ();
		frame.setVisible(true);
	}
}
