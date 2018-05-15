package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame {
	private JFrame f;
	JButton jb = new JButton("OK");
	JButton jb1 = new JButton("OK");
	JButton jb2 = new JButton("OK");
	public MyFrame() {
		f = new JFrame("Hello,this is the first GUI");
	}
	
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		mf.launchFrame();
	}

	public void launchFrame() {
		f.setSize(170, 170);
		f.setLocation(50, 50);
		Container c = f.getContentPane();
		c.setBackground(Color.BLUE);
		//c.add(jb);
		//jb.setBackground(Color.GREEN);
		c.add(jb);
		c.add(jb1);
		c.add(jb2);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		
	}

}
