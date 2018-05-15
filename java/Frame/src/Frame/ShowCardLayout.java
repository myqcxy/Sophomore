package Frame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ShowCardLayout extends JFrame {
	private JPanel p1,p2,p3;
	private JLabel lb1,lb2,lb3;
	private CardLayout  myCard;
	private Container c;
	public ShowCardLayout(){
		myCard = new CardLayout(5,10);
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		lb1 = new JLabel(new ImageIcon("C:\\Users\\MYQ\\Pictures\\Saved Pictures\\img1.jpg"));
		lb2 = new JLabel(new ImageIcon("C:\\Users\\MYQ\\Pictures\\Saved Pictures\\img2.jpg"));
		lb3 = new JLabel(new ImageIcon("C:\\Users\\MYQ\\Pictures\\Saved Pictures\\img3.jpg"));
		
	}
	public void LaunchFrame(){
		c = getContentPane();
		c.setLayout(myCard);
		p1.add(lb1);
		p2.add(lb2);
		p3.add(lb3);
		p1.addMouseListener(new MA());
		p2.addMouseListener(new MA());
		p3.addMouseListener(new MA());
		c.add(p1,"First");
		c.add(p2, "Second");
		c.add(p3, "Third");
		pack();
		setTitle("CardLayoutÊ¾Àý");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	class MA extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			myCard.next(c);
		}
	}
	public static void main(String[] args) {
		ShowCardLayout sc = new ShowCardLayout();
		sc.LaunchFrame();
	}

}
