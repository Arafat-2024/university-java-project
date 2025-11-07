package Frame;
import javax.swing.*;

import Payment.Paymentmethood;

import java.awt.*;
import java.awt.event.*;
public class Busset extends JFrame implements ActionListener
{
     ImageIcon img;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8;
	ButtonGroup bg1,bgr2 ;
	JButton NextBtn, BackBtn;
	JTextField UserTF;
	JPanel panel;
	Color myColor;
	JLabel p1,p2,p3,p4,p5,p6,t1,t2,seatTypeLabels;
	Font myFont;
	
	public Busset()
	{
		super("What type of seat do you want?");
		this.setSize(850,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		r1 = new JRadioButton("ECONOMIC_CLASS (Economic Class Seat)");
		r1.setBounds(70,100,150,30);
		r1.setBackground(Color.WHITE);
		myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r1);
		
		r2 = new JRadioButton("BUSINESS_CLASS (Business Class Seat)");
		r2.setBounds(70,120,140,30);
		r2.setOpaque(false);
		myFont = new Font("Cambria" , Font.PLAIN, 24);
		panel.add(r2);
		
		r3 = new JRadioButton("SLEEPER_COACH(Sleeper Coach Seat)");
		r3.setBounds(70, 140, 150, 30);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r3);
		
		r4 = new JRadioButton("HINO_1J(Hino 1J Seat)");
		r4.setBounds(70, 160, 150, 30);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r4);
		
		t1 = new JLabel("This type of seat is available.");
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
		
		t2 = new JLabel("How many seat you need ");
		t2.setBounds(40,270, 270, 20);
		t2.setBackground(Color .RED);
		t2.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		t2.setForeground(Color.black);
		t2.setFont(myFont);
        panel.add(t2);
		
		r5 = new JRadioButton("1 Seat");
		r5.setBounds(70, 290, 150, 30);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r5);
		
		r6 = new JRadioButton("2 Seat");
		r6.setBounds(70, 310, 150, 30);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r6);
		
		r7 = new JRadioButton("3 seat");
		r7.setBounds(70, 330, 150, 30);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r7);
		
		r8 = new JRadioButton("4 seat ");
		r8.setBounds(70, 350, 150, 30);
        myFont = new Font("Cambria", Font.PLAIN, 24);
		panel.add(r8);
		
		bgr2 = new ButtonGroup();
		bgr2.add(r5);
		bgr2.add(r6);
		bgr2.add(r7);
        bgr2.add(r8);
		
		p1 = new JLabel( "Seat type : ECONOMIC_CLASS (Economic Class Seat) BDT: 2500");
		p1.setBounds(330, 100, 450, 20);
		p1.setBackground(Color .LIGHT_GRAY);
		p1.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		p1.setForeground(Color.black);
		p1.setFont(myFont);
        panel.add(p1);
		
		p2 = new JLabel( "ECONOMIC_CLASS (Economic Class Seat) BDT: 1500");
		p2.setBounds(330, 160, 450, 20);
		p2.setBackground(Color .LIGHT_GRAY);
		p2.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		p2.setForeground(Color.black);
		p2.setFont(myFont);
        panel.add(p2);
		
		p3 = new JLabel("Seat Type : SLEEPER_COACH(Sleeper Coach Seat) BDT: 3500");
		p3.setBounds(330, 220, 450, 20);
		p3.setBackground(Color .LIGHT_GRAY);
		p3.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		p3.setForeground(Color.black);
		p3.setFont(myFont);
		panel.add(p3);
		
		p4 = new JLabel("Seat Type : HINO_1J(Hino 1J Seat) BDT: 1300");
		p4.setBounds(330, 280, 450, 20);
		p4.setBackground(Color .LIGHT_GRAY);
		p4.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		p4.setForeground(Color.black);
		p4.setFont(myFont);
		panel.add(p4);
		
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
			
        if (r1.isSelected()&& r5.isSelected() || r6.isSelected() ||r7.isSelected() || r8.isSelected())
			
		{
			Paymentmethood husPage = new Paymentmethood();
            husPage.setVisible(true);
            this.setVisible(false);
		}
		
		else if (r2.isSelected()&&r5.isSelected() || r6.isSelected() ||r7.isSelected() || r8.isSelected() )
		
	    {
			Paymentmethood loungePage = new Paymentmethood();
            loungePage.setVisible(true);
            this.setVisible(false);
		}
		
		else if (r3.isSelected()&&r5.isSelected() || r6.isSelected() ||r7.isSelected() || r8.isSelected() )
			
		{
			
			 Paymentmethood PayPage = new Paymentmethood();
             PayPage.setVisible(true);
             this.setVisible(false);
			 
		}
		
		else if (r4.isSelected()&&r5.isSelected() || r6.isSelected() ||r7.isSelected() || r8.isSelected() )
			
		{
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
			Busavalable f22 = new Busavalable();
			f22.setVisible(true);
			this.setVisible(false);
		}
		

	}	
	public static void main(String[] args) 
	{

		Busset frame = new Busset();
		frame.setVisible(true);
	} 
}
