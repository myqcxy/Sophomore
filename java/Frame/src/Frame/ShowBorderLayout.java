package Frame;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShowBorderLayout extends JFrame {
	private JButton jb1, jb2,jb3,jb4,jb5;
	private JLabel j1;
	private JPanel jp;
	public ShowBorderLayout(){
		jb1 = new JButton("东");
		jb2 = new JButton("西");
		jb3 = new JButton("南");
		jb4 = new JButton("北");
		jb5 = new JButton("中");
		j1 = new JLabel("欢迎来到：");
		jp = new JPanel();
	}
	public void launchFrame(){
		Container c = getContentPane();
		c.add(jb1,BorderLayout.EAST);
		c.add(jb2,BorderLayout.WEST);
		c.add(jb3,BorderLayout.SOUTH);
		c.add(jb4,BorderLayout.NORTH);
		jp.add(j1);
		jp.add(jb5);
		c.add(jp,BorderLayout.CENTER);
		setTitle("BorderLayout示例");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		ShowBorderLayout sbo = new ShowBorderLayout();
		sbo.launchFrame();

	}

}
