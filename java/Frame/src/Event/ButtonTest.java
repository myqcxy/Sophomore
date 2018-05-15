package Event;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ButtonTest extends JFrame implements ItemListener {
	private Color c;
	private int style;
	private Font f,f1;
	private JLabel jlExample,jlFontstyle,jlColor;
	private JRadioButton rbRed,rbBlue,rbBlack;
	private ButtonGroup g;
	private JCheckBox jcbBold, jcbItalic;
	private JPanel jpFontstyle,jpColor,jpLabel;
	public ButtonTest(){
		style = Font.PLAIN;
		jlExample = new JLabel("请设置效果");
		jlFontstyle = new JLabel("字形：");
		jlColor = new JLabel("颜色：");
		rbRed = new JRadioButton("   ");
		rbBlue = new JRadioButton("   ");
		rbBlack = new JRadioButton("   ");
		g = new ButtonGroup();
		jcbBold = new JCheckBox("粗体");
		jcbItalic = new JCheckBox("斜体");
		jpFontstyle = new JPanel();
		jpColor = new JPanel();
		jpLabel = new JPanel();
	
	}
	public void launchButtonTest(){
		f= jlExample.getFont();
		f1 = f.deriveFont(Font.PLAIN);
		jlExample.setFont(f1);
		rbRed.setBackground(Color.red);
		rbBlue.setBackground(Color.blue);
		rbBlack.setBackground(Color.black);
		rbRed.addItemListener(this);
		rbBlue.addItemListener(this);
		rbBlack.addItemListener(this);
		jcbBold.addItemListener(this);
		jcbItalic.addItemListener(this);
		g.add(rbRed);
		g.add(rbBlue);
		g.add(rbBlack);
		jpFontstyle.add(jlFontstyle);
		jpFontstyle.add(jcbBold);
		jpFontstyle.add(jcbItalic);
		jpColor.add(jlColor);
		jpColor.add(rbRed);
		jpColor.add(rbBlue);
		jpColor.add(rbBlack);
		jpLabel.add(jlExample);
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(3,1));
		cp.add(jpFontstyle);
		cp.add(jpColor);
		cp.add(jpLabel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(rbRed.isSelected()){
			c= Color.red;
		}
		if(rbBlue.isSelected()){
			c=Color.blue;
		}
		if(rbBlack.isSelected()){
			c=Color.BLACK;
		}
		jlExample.setForeground(c);
		Object source = e.getSource();
		if(source==jcbBold){
			style = style^Font.BOLD;
		}
		if(source==jcbItalic){
			style = style^Font.ITALIC;
		jlExample.setFont(f1.deriveFont(style));
		}

	}

	public static void main(String[] args) {
		ButtonTest bt = new ButtonTest();
		bt.setTitle("按钮示例");
		bt.launchButtonTest();
	}

}
