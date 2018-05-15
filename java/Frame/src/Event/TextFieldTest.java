package Event;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextFieldTest extends JFrame implements ActionListener {
	private JLabel jlr,jlarea;
	private JButton jbOK,jbCancel;
	private JTextField jtr,jtarea;
	
	
	public TextFieldTest(){
		jlr = new JLabel("������Բ�뾶��");
		jlarea = new JLabel("Բ���Ϊ��");
		jtr = new JTextField();
		jtarea = new JTextField();
		jbOK = new JButton("����");
		jbCancel = new JButton("ȡ��");
		
	}
	
	public static void main(String[] args) {
		TextFieldTest tf = new TextFieldTest();
		tf.setTitle("�ı���ʾ��");
		tf.launchTestFieldTest();
		

	}

	private void launchTestFieldTest() {
		jtarea.setEditable(false);
		jtr.requestDefaultFocus();
		jbOK.addActionListener(this);
		jbCancel.addActionListener(this);
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		c.add(jlr);
		c.add(jtr);
		c.add(jlarea);
		c.add(jtarea);
		c.add(jbOK);
		c.add(jbCancel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		double r = 0.0,area = 0.0;
		if(source==jbOK){
				try {
					r = Double.parseDouble(jtr.getText());
					area = 3.14 *r*r;
					jtarea.setText(Double.toString(area));
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "��������ȷ�����ָ�ʽ","������ʾ!",JOptionPane.ERROR_MESSAGE);
				//	jtr.selectAll();
				}
		}
		if(source==jbCancel){
			jtr.setText("");
			jtarea.setText("");
		}
		jtr.requestFocus();
	}

}
