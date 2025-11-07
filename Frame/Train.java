package Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Train extends JFrame implements ActionListener
{
     ImageIcon img;
	JLabel FromLabel, toLabel,TimeLabel,imgLabel;
	JTextField userTF;
	JButton  NextBtn ,BackBtn;
	JComboBox combo;
	JPanel panel;
	Color myColor;
	Font myFont;
	JLabel background,background1,background2;

	public Train()
	{
          super("Train Frame");
          this .setSize( 850,550);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
          
		// Initialize panel and set layout
		JPanel panel = new JPanel();
		panel.setLayout(null);
		myColor = new Color(204, 255, 204);
		panel.setBackground(myColor);

		
       //Fromlebel
	     FromLabel = new JLabel("From : ");
		FromLabel.setBounds(600, 115, 80, 20);
		FromLabel.setBackground(Color .LIGHT_GRAY);
		FromLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		FromLabel.setForeground(Color.black);
		FromLabel.setFont(myFont);
		panel.add(FromLabel);
		//new try
		
		//com box
		String items[] = {"Dhaka", "Chittagong"};
		combo = new JComboBox(items);
		combo.setBounds(700, 115, 100, 30);
		panel.add(combo);
		

		//tolabel
		toLabel = new JLabel("   TO:");
		toLabel.setBounds(600, 150, 80, 20);
		toLabel.setBackground(Color .LIGHT_GRAY);
		toLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		toLabel.setForeground(Color.black);
		toLabel.setFont(myFont);
		panel.add(toLabel);

		

		//combo box
		String itemss[] = {"Rajshahi", "Sylhet", "Chittagong"};
		combo = new JComboBox(itemss);
		combo.setBounds(700, 150, 100, 30);
		panel.add(combo);
          

		//time
		TimeLabel = new JLabel("Time:");
		TimeLabel.setBounds(600, 187, 80, 20);
		TimeLabel.setBackground(Color .LIGHT_GRAY);
		TimeLabel.setOpaque(true);
		myFont = new Font("Cambria", Font.PLAIN, 18);
		TimeLabel.setForeground(Color.black);
		TimeLabel.setFont(myFont);
		panel.add(TimeLabel);
		//com box
		String itemse[] = {"10 AM", "08 PM"};
		combo = new JComboBox(itemse);
		combo.setBounds(700, 185, 100, 30);
		panel.add(combo);

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

		img = new ImageIcon("Image/images6.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(3, 3, 850, 550);
		panel.add(imgLabel);

         this.add(panel);


     }

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==BackBtn)
		{
			Main m1=new Main();
			m1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==NextBtn)
		{
			Trainavalable t2=new Trainavalable();
			t2.setVisible(true);
			this.setVisible(false);
		}
	}	
	
	public static void main(String[] args) 
	{

		Train frame = new Train();
		frame.setVisible(true);
	}
}
