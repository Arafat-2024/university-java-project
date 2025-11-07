package Frame;
import javax.swing.*;

import Payment.Paymentmethood;

import java.awt.*;
import java.awt.event.*;
public class Laungeset extends JFrame implements ActionListener
{
     ImageIcon img;
     JRadioButton  r1, r2, r3,r4,r5,r6,r7,r8,r9,r10;
     ButtonGroup bg1,beg2 ;
     JButton NextBtn, BackBtn;
     JTextField userTF;
     JPanel panel;
	Color myColor;
     JLabel p1,p2,p3,p4,p5,p6, t1,t2;
     Font myFont;

     public Laungeset ()

     {
        super("Which type Ticket you want ? ");
		this.setSize(850, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          this.setResizable(false);
         
        panel = new JPanel();
		panel.setLayout(null);


        r1 = new JRadioButton("VIP");
		r1.setBounds(70, 100, 150, 30);
		r1.setBackground(Color.ORANGE); 
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r1);
		
		r2 = new JRadioButton("Family Cabin");
		r2.setBounds(70, 120, 150, 30);
		r2.setOpaque(false);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r2);
		
		r3 = new JRadioButton("Double Cabin");
		r3.setBounds(70, 140, 150, 30);
         myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r3);

        r4 = new JRadioButton("Single Cabin");
		r4.setBounds(70, 160, 150, 30);
         myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r4);

        r5 = new JRadioButton("Sofa");
		r5.setBounds(70, 180, 150, 30);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r5);

        r6 = new JRadioButton("Deck");
		r6.setBounds(70, 200, 150, 30);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r6);
		
        t1 = new JLabel("This type seat available");
		t1.setBounds(40, 50, 270, 20);
		t1.setBackground(Color .RED);
		t1.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		t1.setForeground(Color.black);
		t1.setFont(myFont);
          panel.add(t1);

		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
        bg1.add(r4);
        bg1.add(r5);
        bg1.add(r6);

        t2 = new JLabel("How many seat you need ");
		t2.setBounds(40,270, 270, 20);
		t2.setBackground(Color .RED);
		t2.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		t2.setForeground(Color.black);
		t2.setFont(myFont);
          panel.add(t2);

        r7 = new JRadioButton("1 Seat");
		r7.setBounds(70, 290, 150, 30);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r7);

        r8 = new JRadioButton("2 Seat");
		r8.setBounds(70, 310, 150, 30);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r8);

        r9 = new JRadioButton("3 seat");
		r9.setBounds(70, 330, 150, 30);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r9);

        r10 = new JRadioButton("4 seat ");
		r10.setBounds(70, 350, 150, 30);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r10);

        beg2 = new ButtonGroup();
		beg2.add(r7);
		beg2.add(r8);
		beg2.add(r9);
        beg2.add(r10);

        p1 = new JLabel("Seat Type :  VIP   tk: 5000");
		p1.setBounds(330, 100, 450, 20);
		p1.setBackground(Color .LIGHT_GRAY);
		p1.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		p1.setForeground(Color.black);
		p1.setFont(myFont);
          panel.add(p1);

        p2 = new JLabel("Seat Type :  Family Cabin  tk: 2500");
		p2.setBounds(330, 160, 450, 20);
		p2.setBackground(Color .LIGHT_GRAY);
		p2.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		p2.setForeground(Color.black);
		p2.setFont(myFont);
		panel.add(p2);

        p3 = new JLabel("Seat Type :  Double Cabin  tk: 1800");
		p3.setBounds(330, 220, 450, 20);
		p3.setBackground(Color .LIGHT_GRAY);
		p3.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		p3.setForeground(Color.black);
		p3.setFont(myFont);
		panel.add(p3);

        p4 = new JLabel("Seat Type :  Single Cabin  tk: 1000");
		p4.setBounds(330, 280, 450, 20);
		p4.setBackground(Color .LIGHT_GRAY);
		p4.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		p4.setForeground(Color.black);
		p4.setFont(myFont);
		panel.add(p4);

        p5 = new JLabel("Seat Type : Sofa   tk: 600 ");
		p5.setBounds(330, 340, 450, 20);
		p5.setBackground(Color .LIGHT_GRAY);
		p5.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		p5.setForeground(Color.black);
		p5.setFont(myFont);
		panel.add(p5);

        p6 = new JLabel("Seat Type :   Deck     tk: 300 ");
		p6.setBounds(330, 400, 450, 20);
		p6.setBackground(Color .LIGHT_GRAY);
		p6.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		p6.setForeground(Color.black);
		p6.setFont(myFont);
		panel.add(p6);

		NextBtn = new JButton("Next");
		NextBtn.setBounds(660, 500, 100, 30);
		NextBtn.setBackground(Color.GREEN);
		NextBtn.addActionListener(this); 
		panel.add(NextBtn);

		BackBtn = new JButton("Back");
		BackBtn.setBounds(460, 500, 90, 30);
		BackBtn.setBackground(Color.WHITE);
          myFont = new Font("Cambria", Font.PLAIN, 18);
		BackBtn.addActionListener(this); 
		BackBtn.setFont(myFont);
		panel.add(BackBtn);

          this.add(panel);
     }


	public void actionPerformed(ActionEvent ae) 
	{
          if (ae.getSource() == NextBtn) 
		{
              if (r1.isSelected()&&r7.isSelected() || r8.isSelected() || r9.isSelected() || r10.isSelected()) {
                  // Open the page related to the "Paymentmethood" option
                  Paymentmethood husPage = new Paymentmethood();
                  husPage.setVisible(true);
                  this.setVisible(false);
              } else if (r2.isSelected()&&r7.isSelected() || r8.isSelected() || r9.isSelected() || r10.isSelected()) {
                  // Open the page related to the "Paymentmethood" option
                  Paymentmethood loungePage = new Paymentmethood();
                  loungePage.setVisible(true);
                  this.setVisible(false);
              } else if (r3.isSelected()&&r7.isSelected() || r8.isSelected() || r9.isSelected() || r10.isSelected()) {
                  // Open the page related to the "Paymentmethood" option
                  Paymentmethood PayPage = new Paymentmethood();
                  PayPage.setVisible(true);
                  this.setVisible(false);
              } 

		    else if (r4.isSelected()&&r7.isSelected() || r8.isSelected() || r9.isSelected() || r10.isSelected()) {
			// Open the page related to the "Paymentmethood" option
			Paymentmethood PayPage = new Paymentmethood();
			PayPage.setVisible(true);
			this.setVisible(false);

		    }
			else if (r5.isSelected()&&r7.isSelected() || r8.isSelected() || r9.isSelected() || r10.isSelected()) 
			{
				// Open the page related to the "Paymentmethood" option
				Paymentmethood PayPage = new Paymentmethood();
				PayPage.setVisible(true);
				this.setVisible(false);

			}

				else if (r6.isSelected()&&r7.isSelected() || r8.isSelected() || r9.isSelected() || r10.isSelected()) 
				{
					// Open the page related to the "Paymentmethood" option
					Paymentmethood PayPage = new Paymentmethood();
					PayPage.setVisible(true);
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
              Laungeavalable f22=new Laungeavalable();
			f22.setVisible(true);
			this.setVisible(false);
          }
      }

	 public static void main(String[] args) 
	{

		Laungeset frame = new Laungeset();
		frame.setVisible(true);
	}
}
