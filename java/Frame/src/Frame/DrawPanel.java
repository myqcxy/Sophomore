package Frame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawString("×Ö·û´®", 20, 50);
		g.drawLine(120, 10, 200, 50);
		g.drawRect(60, 80, getWidth()/2-30, getHeight()/2-30);
		g.drawOval(60, 80, getWidth()/2-30, getHeight()/2-30);
		System.out.println(getWidth());
	}
}
