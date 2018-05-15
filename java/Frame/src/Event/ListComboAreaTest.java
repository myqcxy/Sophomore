package Event;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ListComboAreaTest extends JFrame implements ActionListener {

	private JLabel jl1, jl2, jl3, jl4;
	private JButton jbAdd, jbRemove, jbok;
	private JList jlist1, jlist2;
	private DefaultListModel dlm1, dlm2;
	private JComboBox jcb;
	private JTextArea jta;
	private JScrollPane jsplist1, jsplist2, jspjta;
	private String[] semester = { "2010-2011-1", "2010-2011-2", "2011-2012-1", "2011-2012-2" };
	private String[] course = { "网页制作", "信息安全概论", "Java程序设计", "组网技术", "专业英语", "MATALAB及应用", "专业英语", "MATALAB及应用",
			"专业英语", "MATALAB及应用" };

	public ListComboAreaTest() {
		jl1 = new JLabel("请选择开课学期:");
		jl2 = new JLabel("可供开设的课程:");
		jl3 = new JLabel("选择的课程为:");
		jl4 = new JLabel("课程设置的结果为:");
		jbAdd = new JButton("添加");
		jbRemove = new JButton("移除");
		jbok = new JButton("确定");
		dlm1 = new DefaultListModel();
		dlm2 = new DefaultListModel();
		jlist1 = new JList(dlm1);
		jlist2 = new JList(dlm2);
		jcb = new JComboBox(semester);
		jta = new JTextArea(6, 20);
		jsplist1 = new JScrollPane(jlist1);
		jsplist2 = new JScrollPane(jlist2);
		jspjta = new JScrollPane(jta);
		jsplist1.setPreferredSize(new Dimension(150, 150));
		jsplist2.setPreferredSize(new Dimension(150, 150));

	}

	private void launchListComboAreaTest() {
		jta.setEditable(false);
		for (int i = 0; i < course.length; i++) {
			dlm1.addElement(course[i]);
		}
		jbAdd.addActionListener(this);
		jbRemove.addActionListener(this);
		jbok.addActionListener(this);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JPanel p[] = new JPanel[6];
		for (int i = 0; i < 6; i++) {
			p[i] = new JPanel();
			p[i].setLayout(new BoxLayout(p[i], BoxLayout.Y_AXIS));
		}
		p[0].add(jl1);
		p[0].add(jcb);
		p[1].add(jl2);
		p[1].add(jsplist1);
		p[2].add(jbAdd);
		p[2].add(jbRemove);
		p[3].add(jl3);
		p[3].add(jsplist2);
		p[4].add(jbok);
		p[5].add(jl4);
		p[5].add(jspjta);
		for (int i = 0; i < 6; i++)
			c.add(p[i]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setLocation(500, 300);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == jbAdd) {
			Object selectedValues[] = jlist1.getSelectedValues();
			for (int i = 0; i < selectedValues.length; i++) {
				dlm2.addElement(selectedValues[i]);
				dlm1.removeElement(selectedValues[i]);
			}
		}
		if (source == jbRemove) {
			Object selectedValues[] = jlist2.getSelectedValues();
			for (int i = 0; i < selectedValues.length; i++) {
				dlm1.addElement(selectedValues[i]);
				dlm2.removeElement(selectedValues[i]);
			}
		}
		if (source == jbok) {
			if (!dlm2.isEmpty()) {
				jta.append(jcb.getSelectedItem() + "学期开设如下课程：\n\t");
				for (int i = 0; i < dlm2.getSize() - 1; i++) {
					jta.append(dlm2.getElementAt(i) + "、");
				}
				jta.append(dlm2.getElementAt(dlm2.getSize() - 1) + "。\n");
				jcb.removeItem(jcb.getSelectedItem());
				dlm2.clear();

			} else {
				JOptionPane.showMessageDialog(null, "您还没有设置课程！", "错误提示!", JOptionPane.YES_NO_CANCEL_OPTION);
			}
			if (dlm1.isEmpty()) {
				if (jcb.getItemCount() != 0) {
					for (int i = 0; i < jcb.getItemCount() - 1; i++) {
						jta.append((String) jcb.getItemAt(i) + "、");
					}
					jta.append((String) jcb.getItemAt(jcb.getItemCount() - 1));
					jta.append("学期：\n\t没有可供开设的选修课程！");
				} else {
					jta.append("所有课程均已安排到不同学期！");
				}
				jbAdd.setEnabled(false);
				jbRemove.setEnabled(false);
				jbok.setEnabled(false);
			}
			if (!dlm1.isEmpty() && jcb.getItemCount() == 0) {
				jta.append("本届学生不再选修以下课程：\n\t");
				for (int i = 0; i < dlm1.getSize() - 1; i++) {
					jta.append((String) dlm1.getElementAt(i) + "、");
				}
				jta.append((String) dlm1.getElementAt(dlm1.getSize() - 1) + "。");
				jbok.setEnabled(false);
				jbAdd.setEnabled(false);
				jbRemove.setEnabled(false);
			}

		}

	}

	public static void main(String[] args) {
		ListComboAreaTest lca = new ListComboAreaTest();
		lca.setTitle("列表、组合框和文本区组件示例");
		lca.launchListComboAreaTest();

	}

}
