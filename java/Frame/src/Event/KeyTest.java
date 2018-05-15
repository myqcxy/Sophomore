package Event;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyTest extends JFrame {
	private KeyPanel kp = new KeyPanel();
	
	public KeyTest(){
		getContentPane().add(kp);
		kp.setFocusable(true);
	}
	class KeyPanel extends JPanel implements KeyListener{
		private int keyNumber = 0;
		private float rightKeyNumber = 0.0f;
		private float accurate = 0.0f;
		private boolean stop = false;
		private Random r = new Random();
		private char keyChar = (char)(r.nextInt(26) + 65);
		public KeyPanel(){
			addKeyListener(this);
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			keyNumber++;
			if(Character.toUpperCase(e.getKeyChar())==keyChar){
				keyChar = (char)(r.nextInt(26)+65);
				rightKeyNumber++;
				repaint();
			}
			if(e.getKeyCode()==KeyEvent.VK_ENTER){
				keyNumber--;
				if(keyNumber!=0){
					accurate = rightKeyNumber/keyNumber;
				}
				stop = true;
				repaint();
			}
			if(e.getKeyCode()==KeyEvent.VK_SPACE){
				keyNumber = 0;
				rightKeyNumber = 0.0f;
				accurate = 0.0f;
				stop = false;
				keyChar = (char)(r.nextInt(26)+65);
				repaint();
			}
			
		}
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setFont(new Font("TimesRoman",Font.PLAIN,24));
			if(stop==true){
				g.drawString("正确率为" + Math.round(accurate*100)+"%", 100,100);
			}
			else
				g.drawString(String.valueOf(keyChar), 100, 100);
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) {
		KeyTest kt = new KeyTest();
		kt.setTitle("键盘事件示例");
		kt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kt.setSize(300,300);
		kt.setVisible(true);

	}

}
