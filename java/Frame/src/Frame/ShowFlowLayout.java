package Frame;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowFlowLayout extends JFrame {
	private JButton []b;
	private JButton jb;
	public ShowFlowLayout(){
		b = new JButton[5];
		for(int i  =1;i <= 5;i++)
			b[i-1] = new JButton("JButton" + i);
		jb = new JButton("Welcome to Java");
	}
	public void launchFrame(){
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.RIGHT,10,15));
		for(int i = 0;i < 5;i++)
			c.add(b[i]);
		c.add(jb);
		setTitle("FlowLayoutÊ¾Àý");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
	}
	public static void main(String[] args) {
		ShowFlowLayout sf = new ShowFlowLayout();
		sf.launchFrame();

	}

}
