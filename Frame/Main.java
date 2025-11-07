package Frame;
import javax.swing.*;

import loging.First;

//import Frame.login.First;

import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame implements ActionListener
{
     ImageIcon img;
     JRadioButton r1, r2, r3;
     ButtonGroup bg1;
     JButton NextBtn, BackBtn;
     JTextField userTF;
     JPanel panel;
	Color myColor;
     JLabel imgLabel;
     Font myFont;

     public  Main()
     {
          super("Main Frame");
		this.setSize(850, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          this.setResizable(false);
         
          panel = new JPanel();
		panel.setLayout(null);

          r1 = new JRadioButton("Bus");
		r1.setBounds(610, 130, 150, 30);
		r1.setBackground(Color.ORANGE); 
          myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r1);
		
		r2 = new JRadioButton("Launge");
		r2.setBounds(610, 200, 150, 30);
		r2.setOpaque(false);
          myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r2);
		
		r3 = new JRadioButton("Train");
		r3.setBounds(610, 270, 150, 30);
          myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r3);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);

          NextBtn = new JButton("Next");
		NextBtn.setBounds(660, 400, 100, 30);
		NextBtn.setBackground(Color.GREEN);
          NextBtn.addActionListener(this); 
		panel.add(NextBtn);
		
		
		BackBtn = new JButton("Back");
		BackBtn.setBounds(570, 400, 100, 30);
		BackBtn.setBackground(Color.RED);
          BackBtn.addActionListener(this); 
		panel.add(BackBtn);

          img = new ImageIcon("Image/images3.jpeg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(10, 0, 850, 550);
		panel.add(imgLabel);

         this.add(panel);

     }  

     

     public void actionPerformed(ActionEvent ae) 
	{
          if (ae.getSource() == NextBtn) {
              if (r1.isSelected()) {
                  // Open the page related to the "Bus" option
                  Bus busPage = new Bus();
                  busPage.setVisible(true);
                  this.setVisible(false);
              } else if (r2.isSelected()) {
                  // Open the page related to the "Launge" option
                  Launge loungePage = new Launge();
                  loungePage.setVisible(true);
                  this.setVisible(false);
              } else if (r3.isSelected()) 
		    {
                 
                  Train trainPage = new Train();
                  trainPage.setVisible(true);
                  this.setVisible(false);
              } 
		    else 
		    {
                  JOptionPane.showMessageDialog(null, "Please select an option");
              }
          }

		 else if (ae.getSource() == BackBtn) 
          {
             
              First f2=new First();
			f2.setVisible(true);
			this.setVisible(false);
          }
      }

      public static void main(String[] args) 
	{

		Main frame = new Main();
		frame.setVisible(true);
	}
}
