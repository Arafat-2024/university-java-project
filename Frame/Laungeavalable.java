package Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Laungeavalable extends JFrame  implements ActionListener
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

     public Laungeavalable()

     {
          super("Launche Name");
          this .setSize( 850,600);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          this.setResizable(false);

		// Initialize panel and set layout
		JPanel panel = new JPanel();
		panel.setLayout(null);

		Btn1 = new JButton("MV Sundarban - 8 (M 7002)");
		Btn1.setBounds(200, 100, 400, 65);
		Btn1.setBackground(Color.WHITE);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		Btn1.setFont(myFont);
		Btn1.addActionListener(this); 
		panel.add(Btn1);

		Btn2 = new JButton("MV Parabat - 8 (M 6918)");
		Btn2.setBounds(200, 200, 400, 65);
		Btn2.setBackground(Color.WHITE);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		Btn2.setFont(myFont);
		Btn2.addActionListener(this); 
		panel.add(Btn2);

		Btn3 = new JButton(" Adventure - 9 (M-011-679) ");
		Btn3.setBounds(200, 300, 400, 65);
		Btn3.setBackground(Color.WHITE);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		Btn3.setFont(myFont);
		Btn3.addActionListener(this); 
		panel.add(Btn3);

		Btn4 = new JButton("MV Farhan -8 (M-01-1128");
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

		img = new ImageIcon("Image/images8.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(10, 0, 850, 550);
		panel.add(imgLabel);

		this.add(panel);
     }
     
     public void actionPerformed(ActionEvent ae) {
          if (ae.getSource() == Btn5) {
              // Handle the Back button action if needed
              Launge l5 = new Launge();
              l5.setVisible(true);
              this.setVisible(false);
          } else if (ae.getSource() == Btn1 || ae.getSource() == Btn2 || ae.getSource() == Btn3 || ae.getSource() == Btn4) 
          {
              // Open the Busset page for the selected button
              Laungeset l10 = new Laungeset();
              l10.setVisible(true);
              this.setVisible(false);
          }
      } 

	 public static void main(String[] args) 
	{

		Laungeavalable frame = new Laungeavalable();
		frame.setVisible(true);
	}
}
