package test;

import java.awt.event.*;

import javax.swing.*;

public class FirstJFrame extends JFrame {
	private int count = 0;
	public FirstJFrame(){
		setSize(500,1000);
		setLocation(200,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JTextField textField = new JTextField();
		add(textField,"North");
		JButton btn = new JButton("click me");
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				textField.setText("������" + count + "��");
			}
			
		});
		add(btn);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FirstJFrame();
	}

}
