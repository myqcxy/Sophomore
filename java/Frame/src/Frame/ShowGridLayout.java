package Frame;

import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShowGridLayout extends JFrame {
	private JLabel j1;
	private JButton ok,cancel;
	private JTextField jt;
	private JPanel jp1,jp2;
	private JButton []jb;
	public ShowGridLayout(){
		j1 = new JLabel("请输入手机号码");
		ok = new JButton("确认");
		cancel = new JButton("取消");
		jt = new JTextField(15);
		jp1 = new JPanel();
		jp2 = new JPanel();
		jb = new JButton [10];
		for(int i = 0;i < 10;i++)
			jb[i] = new JButton(new Integer(i).toString());
	}
	public void launchFrame(){
		Container  c = getContentPane();
		GridLayout gl = new GridLayout(4,3,3,5);
		jp1.add(j1);
		jp1.add(jt);
		jp2.setLayout(gl);
		for(int i = 1;i <10;i++)
			jp2.add(jb[i]);
		jp2.add(jb[0]);
		jp2.add(ok);
		jp2.add(cancel);
		c.add(jp1,"South");
		c.add(jp2, "North");
		setTitle("GridLayout示例");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		ShowGridLayout sg = new ShowGridLayout();
		sg.launchFrame();
	}

}
