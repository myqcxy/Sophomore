package shiyan6;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.xml.transform.Source;

public class VIPRegister extends JFrame implements ItemListener {
	private JLabel[] info;
	private JTextField[] infoText;
	private JButton jbok;
	private JButton jbcancel;
	private JPanel jp1;
	private JPanel jp2;
	private JPanel jp3;
	private JPanel jp4;
	private JRadioButton jrbAccept;
	private Font g;

	public VIPRegister() {
		g = new Font("宋体", Font.BOLD, 30);
		/* jp1 注册信息的各项种类 */
		info = new JLabel[4];
		info[0] = new JLabel("电话", SwingConstants.RIGHT);
		info[1] = new JLabel("账号", SwingConstants.RIGHT);
		info[2] = new JLabel("密码", SwingConstants.RIGHT);
		info[3] = new JLabel("确认密码", SwingConstants.RIGHT);
		infoText = new JTextField[4];
		jp1 = new JPanel();
		jp1.setLayout(new GridLayout(4, 1, 5, 5));
		jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4, 1, 5, 5));
		for (int i = 0; i < 4; i++) {
			infoText[i] = new JTextField(15);
			infoText[i].setFont(g);
			info[i].setFont(g);
			jp1.add(info[i]);
			jp2.add(infoText[i]);
		}
		jp3 = new JPanel();
		jp3.add(jp1);
		jp3.add(jp2);
		Font g1 = new Font("宋体", Font.BOLD, 20);
		JCheckBox jcb1 = new JCheckBox("到期自动续费", true);
		JCheckBox jcb2 = new JCheckBox("加入客户体验计划", true);
		jrbAccept = new JRadioButton("我接受用户协议");
		JRadioButton jrbRefuse = new JRadioButton("我拒绝用户协议", true);
		jbok = new JButton("提交");
		jbok.addActionListener(new lis());
		jbok.setEnabled(false);
		jbcancel = new JButton("重置");
		jbcancel.addActionListener(new lis());
		jcb1.setFont(g1);
		jcb2.setFont(g1);
		jrbAccept.setFont(g1);
		jrbAccept.addItemListener(this);
		jrbRefuse.setFont(g1);
		jbok.setFont(g);
		jbcancel.setFont(g);
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbAccept);
		bg.add(jrbRefuse);
		jp4 = new JPanel();
		jp4.setLayout(new GridLayout(3, 2, 5, 5));
		jp4.add(jcb1);
		jp4.add(jcb2);
		jp4.add(jrbAccept);
		jp4.add(jrbRefuse);
		jp4.add(jbok);
		jp4.add(jbcancel);

		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1));
		c.add(jp3);
		c.add(jp4);
		setTitle("请注册会员信息");
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500, 300);

	}

	public class lis implements ActionListener {

		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			boolean flag = true;
			if (source == jbok) {
				for (int i = 0; i < 4; i++) {
					if (infoText[i].getText().length() == 0) {
						JOptionPane.showMessageDialog(getParent(), 
								"请输入" + info[i].getText() + "信息！", "错误信息",
								JOptionPane.WARNING_MESSAGE);
						infoText[i].requestFocus();
						flag = false;
						break;
					}
				}
				if (infoText[0].getText().length() != 11 
						|| !infoText[0].getText().matches("1[0-9]{10}")) {
					flag = false;
					JOptionPane.showMessageDialog(getParent(), 
							"请输入正确的电话号码！", "错误信息", JOptionPane.WARNING_MESSAGE);
					infoText[0].selectAll();
					infoText[0].requestFocus();
				}
				if (infoText[1].getText().length() < 6 
						|| infoText[1].getText().contains(" ")) {
					flag = false;
					JOptionPane.showMessageDialog(getParent(),
							"账号是不包含空格的6位以上数字或字母", "错误信息",
							JOptionPane.WARNING_MESSAGE);
					infoText[1].selectAll();
				}
				if (infoText[2].getText().length() < 6 
						|| infoText[2].getText().contains(" ")) {
					flag = false;
					JOptionPane.showMessageDialog(getParent(), 
							"密码是不包含空格的6位以上数字或字母", "错误信息",
							JOptionPane.WARNING_MESSAGE);
					infoText[2].selectAll();
				}
				if (infoText[2].getText().compareTo(infoText[3].getText()) != 0) {
					flag = false;
					JOptionPane.showMessageDialog(getParent(), 
							"两次密码不同，请重新输入！", "错误信息", JOptionPane.WARNING_MESSAGE);
					infoText[2].setText("");
					infoText[3].setText("");
					infoText[2].requestFocus();
				}
				if (flag==true) {
					JDialog jd = new JDialog();
					jd.setTitle("注册信息");
					jd.setLocationRelativeTo(info[0]);
					jd.setSize(300, 300);
					Container cd = jd.getContentPane();
					JTextArea jta = new JTextArea(4, 1);
					jta.setEditable(false);
					jta.setFont(g);
					cd.setVisible(true);
					cd.setLayout(new FlowLayout());
					cd.add(jta);
					JButton jb = new JButton("确定");
					jb.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							jd.setVisible(false);
						}

					});
					cd.add(jb);
					jta.append("您的注册信息为：\n");
					jta.append("账号：" + infoText[1].getText() + "\n");
					jta.append("密码：" + infoText[2].getText() + "\n");
					jta.append("请牢记您的信息");
					jd.show();
				}

			} else {
				for (int i = 0; i < 4; i++) {
					infoText[i].setText("");
				}
				infoText[0].requestFocus();
			}
		}

	}
	public static void main(String[] args) {
		new VIPRegister();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (jrbAccept.isSelected()) {
			jbok.setEnabled(true);
		} else {
			jbok.setEnabled(false);
		}

	}

}