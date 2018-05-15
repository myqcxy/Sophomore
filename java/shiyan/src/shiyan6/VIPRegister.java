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
		g = new Font("����", Font.BOLD, 30);
		/* jp1 ע����Ϣ�ĸ������� */
		info = new JLabel[4];
		info[0] = new JLabel("�绰", SwingConstants.RIGHT);
		info[1] = new JLabel("�˺�", SwingConstants.RIGHT);
		info[2] = new JLabel("����", SwingConstants.RIGHT);
		info[3] = new JLabel("ȷ������", SwingConstants.RIGHT);
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
		Font g1 = new Font("����", Font.BOLD, 20);
		JCheckBox jcb1 = new JCheckBox("�����Զ�����", true);
		JCheckBox jcb2 = new JCheckBox("����ͻ�����ƻ�", true);
		jrbAccept = new JRadioButton("�ҽ����û�Э��");
		JRadioButton jrbRefuse = new JRadioButton("�Ҿܾ��û�Э��", true);
		jbok = new JButton("�ύ");
		jbok.addActionListener(new lis());
		jbok.setEnabled(false);
		jbcancel = new JButton("����");
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
		setTitle("��ע���Ա��Ϣ");
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
								"������" + info[i].getText() + "��Ϣ��", "������Ϣ",
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
							"��������ȷ�ĵ绰���룡", "������Ϣ", JOptionPane.WARNING_MESSAGE);
					infoText[0].selectAll();
					infoText[0].requestFocus();
				}
				if (infoText[1].getText().length() < 6 
						|| infoText[1].getText().contains(" ")) {
					flag = false;
					JOptionPane.showMessageDialog(getParent(),
							"�˺��ǲ������ո��6λ�������ֻ���ĸ", "������Ϣ",
							JOptionPane.WARNING_MESSAGE);
					infoText[1].selectAll();
				}
				if (infoText[2].getText().length() < 6 
						|| infoText[2].getText().contains(" ")) {
					flag = false;
					JOptionPane.showMessageDialog(getParent(), 
							"�����ǲ������ո��6λ�������ֻ���ĸ", "������Ϣ",
							JOptionPane.WARNING_MESSAGE);
					infoText[2].selectAll();
				}
				if (infoText[2].getText().compareTo(infoText[3].getText()) != 0) {
					flag = false;
					JOptionPane.showMessageDialog(getParent(), 
							"�������벻ͬ�����������룡", "������Ϣ", JOptionPane.WARNING_MESSAGE);
					infoText[2].setText("");
					infoText[3].setText("");
					infoText[2].requestFocus();
				}
				if (flag==true) {
					JDialog jd = new JDialog();
					jd.setTitle("ע����Ϣ");
					jd.setLocationRelativeTo(info[0]);
					jd.setSize(300, 300);
					Container cd = jd.getContentPane();
					JTextArea jta = new JTextArea(4, 1);
					jta.setEditable(false);
					jta.setFont(g);
					cd.setVisible(true);
					cd.setLayout(new FlowLayout());
					cd.add(jta);
					JButton jb = new JButton("ȷ��");
					jb.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							jd.setVisible(false);
						}

					});
					cd.add(jb);
					jta.append("����ע����ϢΪ��\n");
					jta.append("�˺ţ�" + infoText[1].getText() + "\n");
					jta.append("���룺" + infoText[2].getText() + "\n");
					jta.append("���μ�������Ϣ");
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