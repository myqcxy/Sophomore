package shiyan6;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClickTimes extends JFrame {
	private JLabel jl;
	private JPanel jp;
	private JButton jb;
	private int times = 0;
	public ClickTimes(){
		jl = new JLabel("欢迎过来点击我！");
		jb = new JButton("＋");
		jb.addMouseListener(new lis());
		jp = new JPanel();
		jp.add(jl);
		jp.add(jb);
		Container c = getContentPane();
		c.add(jp);
		setTitle("事件1");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		setLocation(400,300);
	}
	class lis extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			times++;
			jl.setText("鼠标点击了" + times + "次");
		}
	}

	public static void main(String[] args) {
		new ClickTimes();
	}

}
