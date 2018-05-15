package Event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	JButton [][] digits;
	JTextField jt = new JTextField(20);
	String inStr = "";
	double [] digit = new double[20];
	String [] data = new String[20];
	int i =0;
	int j = 0;
	private String str="";
	public Calculator(){
		GridLayout  gl = new GridLayout(4,4);
		Container c = getContentPane();
		JPanel jpup,jpdown;
		jpup = new JPanel();
		jpdown = new JPanel();
		jpdown.setLayout(gl);
		Font g = new Font("ËÎÌå",Font.BOLD,23);
		jt.setText("0");
		jt.setFont(g);
		jpup.add(jt);
		
		c.add(jpup,BorderLayout.NORTH);
		c.add(jpdown,BorderLayout.CENTER);
		digits = new JButton[4][4];
		int t = 1;
		for(int i = 0;i<3;i++){
			for(int j = 0;j<3;j++){
				digits[i][j] = new JButton((new Integer(t++).toString()));
			}
				
		}
		digits[0][3]= new JButton("£«");
		digits[1][3]= new JButton("-");
		digits[2][3]= new JButton("*");
		digits[3][3]= new JButton("/");
		digits[3][0]= new JButton(""+0);
		digits[3][1]= new JButton(".");
		digits[3][2]= new JButton("=");
		for(int i = 0;i<4;i++){
			for(int j = 0;j<4;j++){
				digits[i][j].setFont(g);
				jpdown.add(digits[i][j]);
				digits[i][j].addActionListener(new Lis());
			}
		}
		setTitle("¼ÆËãÆ÷");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setLocation(500,300);
	}
	public class Lis implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object source = e.getSource();
			if(source==digits[3][2]){
				digit[i++] = new Double(jt.getText()).parseDouble(jt.getText());
				jt.setText(calculator(digit,data));
				str = "";
			}
			else{
				if(source==digits[0][3]||source==digits[1][3]||source==digits[2][3]||source==digits[3][3]){
					if( str.endsWith("£«") || str.endsWith("-") || str.endsWith("*") || str.endsWith("/")){						
						data[j-1] = e.getActionCommand();
						
					}	
					else{
						data[j++] = e.getActionCommand();
						digit[i++] = new Double(jt.getText()).parseDouble(jt.getText());
					//	System.out.println(jt.getText());
						str = "";
					}
				}
				else if(source == digits[3][1]){
					if(str.contains(".")){}
					else{
						str += e.getActionCommand();
						jt.setText(str);
					}
				}
				else{
						str += e.getActionCommand();
						jt.setText(str);
					}			
			}
			
		}

		public String calculator(double[] digit, String[] data) {
			for(double s:digit){
				System.out.println(s);
			}
			for(String s:data){
				System.out.println(s);
			}
			return null;
		}
		
	}

	public static void main(String[] args) {
		new Calculator();

	}



}
