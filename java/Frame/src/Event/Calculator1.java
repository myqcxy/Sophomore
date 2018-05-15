package Event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator1 extends JFrame {
	JButton [][] digits;
	JButton [] operation;
	JTextField jt = new JTextField(20),jt1 = new JTextField(20);
	String inStr = "";
	double [] digit = new double[20];
	String [] data = new String[20];
	int i =0;
	int j = 0;
	private String str="";
	String str1 = "";
	public Calculator1(){
		for(int s = 0;s < 20;s++){
			data[s] = "＋";
		}
		GridLayout  gl = new GridLayout(5,4);
		Container c = getContentPane();
		JPanel jpup,jpdown;
		jpup = new JPanel();
		jpdown = new JPanel();
		jpdown.setLayout(gl);
		Font g = new Font("宋体",Font.BOLD,30);
		jt.setText("0");
		jt.setFont(g);
		jt1.setEditable(false);
		jt1.setFont(g);
		jpup.setLayout(new GridLayout(2,1));
		jpup.add(jt1);
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
		digits[0][3]= new JButton("＋");
		digits[1][3]= new JButton("－");		
		digits[2][3]= new JButton("×");
		digits[3][3]= new JButton("÷");
		digits[3][0]= new JButton(""+0);
		digits[3][1]= new JButton(".");
		digits[3][2]= new JButton("=");
		operation = new JButton[4];
		operation[0] = new JButton("C");
		operation[1] = new JButton("㎡");
		operation[2] = new JButton("m³");
		operation[3] = new JButton("√");
		operation[0].setFont(g);
		operation[1].setFont(g);
		operation[2].setFont(g);
		operation[3].setFont(g);
		for(int i = 0;i < 4 ;i++){
			jpdown.add(operation[i]);
			operation[i].addActionListener(new Lis());
		}
			
		for(int i = 0;i<4;i++){
			for(int j = 0;j<4;j++){
				digits[i][j].setFont(g);
				jpdown.add(digits[i][j]);
				digits[i][j].addActionListener(new Lis());
			}
		}
		setTitle("计算器");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setLocation(500,300);
	}
	public class Lis implements ActionListener{

		public double getDouble(){
			if(jt.getText().contains(".")){
				if(jt.getText().charAt(0)=='-') {
					new Double("-0"+jt.getText().substring(1,jt.getText().length()) + "0");
					return Double.parseDouble("-0"+jt.getText().substring(1,jt.getText().length()) + "0");
				} else{
					new Double(0+jt.getText()+0);
					return Double.parseDouble(0+jt.getText()+0);
				}
			} else {
				new Double(jt.getText());
				return Double.parseDouble(jt.getText());
			}
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object source = e.getSource();
			if(source==digits[3][2]){
				if(jt.getText().contains(".")){
					new Double("0"+jt.getText() + "0");
					digit[i++] = Double.parseDouble("0"+jt.getText() + "0");
				} else {
					new Double(jt.getText());
					digit[i++] = Double.parseDouble(jt.getText());
				}
				if(!(str1.endsWith("㎡")||str1.endsWith("m³"))){
					str1+=jt.getText();
				}
					
					str1+=e.getActionCommand();
				jt.setText(calculator(digit,data));
				jt1.setText(str1);
				str = "";
				str1 = "";
				i =0;
				j=0;
				for(int s = 0;s < 20;s++){
					data[s] = "＋";
					digit[s] = 0.0;
				}
				new Double(jt.getText());
				digit[0] = Double.parseDouble(jt.getText());
			}
			else if(source == operation[0]){
				i = 0;
				j=0;
				str ="";
				str1="";
				jt.setText("0");
				jt1.setText("");
			}
			else if(source == operation[1]){
				double f = getDouble();
				str1 += jt.getText();
				jt.setText(f*f+"");
				
				str = "";
				
				str1 += e.getActionCommand();
			}
			else if(source == operation[2]){
				double f = getDouble();
				str1 += jt.getText();
				jt.setText(f*f*f+"");
				str = "";
				str1 += e.getActionCommand();
			}
			else if(source == operation[3]){
				double f = getDouble();
				//str1+="√"+jt.getText();
				jt.setText(Math.sqrt(f)+"");
				str = "";
			}
			else{
				if(source==digits[0][3]||source==digits[1][3]||source==digits[2][3]||source==digits[3][3]){
					if( str1.endsWith("＋") || str1.endsWith("－") || str1.endsWith("×") || str1.endsWith("÷")){						
						data[j-1] = e.getActionCommand();
						str1 = str1.substring(0, str1.length()-1) + e.getActionCommand();
						jt1.setText(str1);
					}
					else{
						data[j++] = e.getActionCommand();
						digit[i++] = getDouble();
						str = "";
						if(!(str1.endsWith("㎡")||str1.endsWith("m³"))){
							str1+=jt.getText();
						}
						str1+=e.getActionCommand();
						jt1.setText(str1);
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
			int k = 0 , t = 0;
			for(int flag = 0;flag < 20;flag++){
				if(data[flag].equals("×")){
					digit[flag] *= digit[flag+1];
					digit[flag+1] = 0.0;
					data[flag] = "＋";
				}
				else if(data[flag].equals("÷")){
					if(digit[flag+1] == 0.0){
						return "0";
					}
					digit[flag] /= digit[flag+1];
					digit[flag+1] = 0.0;
					data[flag] = "＋";
				}
			}
			double result = digit[k++];
			while(k++<20){
				
				if(data[t].equals("＋")){
					result += digit[k-1];
				}
				else if(data[t].equals("－")){
					result -= digit[k-1];
				}
				t++;
			}
			DecimalFormat df=new DecimalFormat("0.0");
			
			return df.format(result);
		}
		
	}

	public static void main(String[] args) {
		new Calculator1();

	}
}
