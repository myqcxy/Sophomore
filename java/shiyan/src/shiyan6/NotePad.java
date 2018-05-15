package shiyan6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NotePad extends JFrame {
	private JFileChooser jfc;
	private JTextArea text;
	File file;
	static String content;
	public NotePad(){
		Font g = new Font("����",Font.BOLD,20);
		Font g1 = new Font("����",Font.BOLD,20);
		content = new String();
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menuFile = new JMenu("�ļ�");
		JMenu menuEdit = new JMenu("�༭");
		JMenu menuFormat = new JMenu("��ʽ");
		menuFile.setFont(g);
		menuEdit.setFont(g);
		menuFormat.setFont(g);
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		menuBar.add(menuFormat);
		JMenuItem openItem = new JMenuItem("��");
		menuFile.add(openItem);
		JMenuItem creatItem = new JMenuItem("�½�");
		menuFile.add(creatItem);
		JMenuItem saveItem = new JMenuItem("����");
		menuFile.add(saveItem);
		JMenuItem saveToItem = new JMenuItem("���Ϊ");
		menuFile.add(saveToItem);
	//	openItem.addActionListener(new FileOpenListener());
		JMenuItem exitItem = new JMenuItem("�뿪");
		menuFile.add(exitItem);
		JMenuItem past = new JMenuItem("ճ��");
		JMenuItem copy = new JMenuItem("����");
		JMenuItem cut = new JMenuItem("����");
		JMenuItem poppast = new JMenuItem("ճ��");
		JMenuItem popcopy = new JMenuItem("����");
		JMenuItem popcut = new JMenuItem("����");
		menuEdit.add(past);
		menuEdit.add(copy);
		menuEdit.add(cut);
		JCheckBoxMenuItem wrap = new JCheckBoxMenuItem("�Զ�����");
		JMenuItem font = new JMenuItem("����");
		menuFormat.add(wrap);
		menuFormat.add(font);
		text = new JTextArea(3,3);
		text.setFont(g1);
		JScrollPane jsText = new JScrollPane(text);
		
		Container c = getContentPane();
		c.add(jsText, BorderLayout.CENTER);
		jfc = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("txt file", "txt");
		jfc.addChoosableFileFilter(filter);
		creatItem.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(content.equals(text.getText())){
					text.setText("");
				}
				else{
					int value = JOptionPane.showConfirmDialog(NotePad.this, "�Ƿ񱣴��������޸�",
							"��ʾ",JOptionPane.YES_NO_OPTION);
					if(value==JOptionPane.YES_OPTION){
						String t = text.getText();
						try {
							saveFile(file,t);
							text.setText("");
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(NotePad.this, "�ļ�����ʧ�ܣ�ԭ��\n" + e1);
						}
					}
					else{
						if(value==JOptionPane.NO_OPTION){
							text.setText("");
						}
					}
				}
				NotePad.this.setTitle("�½��ĵ�");
				file = null;
			}
			
		});
		openItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				jfc.showOpenDialog(NotePad.this);
				file = jfc.getSelectedFile();
				if(file==null){
					JOptionPane.showMessageDialog(null, "δѡ���ļ�");
					return;
				}
				text.setText("");
				try {
					String content = getFileContent(file);
					text.setText(content);
					NotePad.this.setTitle(file.getName());
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "�ļ���ȡʧ��");
				}
			}
			
		});
		saveItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(file==null){
					jfc.showSaveDialog(NotePad.this);
					file = jfc.getSelectedFile();}
					String t = text.getText();
					try {
						saveFile(file,t);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "�ļ�����ʧ��");
					}
					NotePad.this.setTitle(file.getName());
				
			}
			
		});
		saveToItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				jfc.showDialog(NotePad.this, "���Ϊ");
				file = jfc.getSelectedFile();
				String t= text.getText();
				try {
					saveFile(file,t);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(NotePad.this, "�ļ�����ʧ�ܣ�ԭ��\n" + e);
				}
				NotePad.this.setTitle(file.getName());
			}
			
		});
		exitItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		cut.addActionListener(new CutListener());
		copy.addActionListener(new CopyListener());
		past.addActionListener(new PastListener());
		popcut.addActionListener(new CutListener());
		popcopy.addActionListener(new CopyListener());
		poppast.addActionListener(new PastListener());
		wrap.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(wrap.isSelected()){
					text.setLineWrap(true);
				}
				else{
					text.setLineWrap(false);
				}
			}
			
		});
		font.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String size = JOptionPane.showInputDialog(text,"�����������С��");
				int s = 0;
				try {
					s = Integer.parseInt(size);
					Font g1 = new Font("����",Font.BOLD,s);  
					text.setFont(g1);
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(NotePad.this, "�����������С��������");
				}
				
			}
			
		});
		JPopupMenu popMenu = new JPopupMenu();
		JMenuItem i1 = new JMenuItem("����");
		popMenu.add(poppast);
		popMenu.add(popcopy);
		popMenu.add(popcut);
		text.addMouseListener(new MouseAdapter(){

			@Override
			public void mousePressed(MouseEvent e) {
				popup(e);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				popup(e);
			}

			private void popup(MouseEvent e) {
				if(e.isPopupTrigger()){
					popMenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
		setTitle("�ı��༭��");
		setSize(600,600);
		setLocation(600,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	class CutListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				text.cut();
			}
			
	}
	class CopyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			text.copy();
		}
		
	}
	class PastListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			text.paste();
		}
		
}
	protected String getFileContent(File file) throws IOException {
		content = "";
		BufferedReader r = new BufferedReader(new FileReader(file));
		String line = "";
		while((line=r.readLine())!=null){
			content+=line + "\n";
		}
		r.close();
		return content;
	}
	protected void saveFile(File file, String str) throws IOException {
		content = str;
		FileWriter w = new FileWriter(file);
		w.write(content);
		w.close();
	}
	public static void main(String[] args) {
		new NotePad();
	}

}
