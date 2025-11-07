package Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Busavalable extends JFrame  implements ActionListener
{
     ImageIcon img;
	JTextField userTF;
     JLabel imgLabel;
	JPasswordField passPF;
	JButton  Btn1 ,Btn2,Btn3,Btn4, Btn5;
	JCheckBox c1, c2, c3;
	ButtonGroup bg1;
	JPanel panel;
	Color myColor;
	Font myFont;

     public Busavalable()

     {
          super("Bus Name");
          this .setSize( 850,660);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          this.setResizable(false);

		// Initialize panel and set layout
		JPanel panel = new JPanel();
		panel.setLayout(null);

		Btn1 = new JButton("Green Line");
		Btn1.setBounds(200, 100, 400, 65);
		Btn1.setBackground(Color.WHITE);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		Btn1.setFont(myFont);
          Btn1.addActionListener(this);
		panel.add(Btn1);

		Btn2 = new JButton("Hanif Enterprise");
		Btn2.setBounds(200, 200, 400, 65);
		Btn2.setBackground(Color.WHITE);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		Btn2.setFont(myFont);
          Btn2.addActionListener(this);
		panel.add(Btn2);

		Btn3 = new JButton(" Ena Transport Pvt. Ltd. ");
		Btn3.setBounds(200, 300, 400, 65);
		Btn3.setBackground(Color.WHITE);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		Btn3.setFont(myFont);
          Btn3.addActionListener(this);
		panel.add(Btn3);

		Btn4 = new JButton("Desh Travels");
		Btn4.setBounds(200, 400, 400, 65);
		Btn4.setBackground(Color.WHITE);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		Btn4.setFont(myFont);
          Btn4.addActionListener(this);
		panel.add(Btn4);

          Btn5 = new JButton("Back");
		Btn5.setBounds(150, 500, 150, 35);
		Btn5.setBackground(Color.RED);
          Btn5.addActionListener(this); 
		panel.add(Btn5);

		img = new ImageIcon("Image/images7.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 850, 530);
		panel.add(imgLabel);

		
		this.add(panel);
     } 
     
     public void actionPerformed(ActionEvent ae) {
          if (ae.getSource() == Btn5) {
              // Handle the Back button action if needed
              Train t5 = new Train();
              t5.setVisible(true);
              this.setVisible(false);
          } else if (ae.getSource() == Btn1 || ae.getSource() == Btn2 || ae.getSource() == Btn3 || ae.getSource() == Btn4) {
              // Open the Busset page for the selected button
              Busset b2 = new Busset();
              b2.setVisible(true);
              this.setVisible(false);
          }
      } 

	 public static void main(String[] args) 
	{

		Busavalable frame = new Busavalable();
		frame.setVisible(true);
	}
}
