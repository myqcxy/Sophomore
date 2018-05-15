package Event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Event.KeyTest.KeyPanel;

public class Game extends JFrame {
	private JTextField jt = new JTextField(15);
	private Random r = new Random();
	private int n = r.nextInt(100) + 1;
	private JButton jb = new JButton("提交");
	private JLabel jl = new JLabel();
	private KeyPanel kp = new KeyPanel();
	public Game() {
		jl.setText("请输入1-100的整数");
		Font g = new Font("宋体",Font.BOLD,22);
		jl.setFont(g);	
		jb.setBackground(Color.red);
		jt.setFont(g);
		jb.setFont(g);
		jb.addMouseListener(new mouse());
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jl);
		c.add(jt);
		c.add(jb);
		c.setBackground(Color.cyan);
		jt.addKeyListener(kp);
		setTitle("Game");
		setSize(600,200);
		setVisible(true);
		setLocation(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class KeyPanel extends JPanel implements KeyListener{

		public KeyPanel(){
			addKeyListener(this);
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER){
				int s = 0;
				try{
					s = Integer.parseInt(jt.getText());
					if(s==n){
						jl.setText("恭喜过关！");
						jt.setText("");
					}
					else if(s>n){
						jl.setText("输入的数字过大！");
						jt.setText("");
					}
					else{
						jl.setText("输入的数字过小！");
						jt.setText("");
					}
				} catch (NumberFormatException e1) {
					jl.setText("请输入1-100的整数");
					jt.setText("");
				}
				repaint();
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	public class mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource()==jb){
				int s = 0;
				try{
					s = Integer.parseInt(jt.getText());
					if(s==n){
						jl.setText("恭喜过关！");
						jt.setText("");
					}
					else if(s>n){
						jl.setText("输入的数字过大！");
						jt.setText("");
					}
					else{
						jl.setText("输入的数字过小！");
						jt.setText("");
					}
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					jl.setText("请输入1-100的整数");
					jt.setText("");
				}
				
			}
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) {
		new Game();

	}

}
