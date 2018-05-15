package Frame;

import javax.swing.JFrame;

public class DrawOnJPanel extends JFrame {

	public static void main(String[] args) {
		DrawPanel p = new DrawPanel();
		DrawOnJPanel f = new DrawOnJPanel();
		f.setTitle("ªÊ÷∆Õº–Œ");
		f.getContentPane().add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,200);
		f.setVisible(true);

	}

}
