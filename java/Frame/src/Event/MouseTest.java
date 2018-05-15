package Event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MouseTest extends JFrame {
	private JLabel label1, label2;
	public MouseTest(){
		super("Mouse Testing");
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,5));
		label1 = new JLabel("�Ͻ����ڣ�",SwingConstants.CENTER);
		label2 = new JLabel();
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		Font g = new Font("����",Font.BOLD,22);
		label1.setFont(g);
		label1.setForeground(Color.RED);
		c.add(label1, BorderLayout.NORTH);
		c.add(label2, BorderLayout.CENTER);
		c.addMouseMotionListener(new MouseMotionHandler());
		c.addMouseListener(new MouseEventHandler());
		setSize(360,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public class MouseMotionHandler implements MouseMotionListener{
		public void mouseDragged(MouseEvent e){
			label2.setText("��������ƶ�����λ��Ϊ��X=" + e.getX() + "Y=" + e.getY());
		}
		public void mouseMoved(MouseEvent e){}
	}
	public class MouseEventHandler implements MouseListener{
		public void mouseEntered(MouseEvent e){
			label2.setText("��괳�룡");
			label2.setBackground(Color.GREEN);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			label2.setText("�������");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			label2.setText("�����룬����ʱδ���϶���");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			label2.setText("����뿪��");
		}
	}
	
	public static void main(String[] args) {
		MouseTest mt = new MouseTest();

	}

}
