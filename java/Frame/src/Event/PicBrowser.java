package Event;


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;



public class PicBrowser extends JFrame {
	JLabel imageLabel;
	JLabel statusLabel;
	int index = 0;
	JButton startBtn;
	JButton stopBtn;
	Timer timer;
	private JFileChooser chooser;
	private final String PICTURE_DIR = ".";
	public PicBrowser(){
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		JMenuItem openItem = new JMenuItem("Open");
		menu.add(openItem);
		openItem.addActionListener(new FileOpenListener());
		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		exitItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(timer!=null){
					timer.stop();
				}
				System.exit(0);
			}
			
		});
		imageLabel = new JLabel();
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(new JScrollPane(imageLabel));
		add(initCtrlPanel(),"South");
		chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		setSize(600,600);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	private JPanel initCtrlPanel() {
		startBtn = new JButton("Start timer");
		startBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(timer!=null)
					timer.start();
			}
			
		});
		stopBtn = new JButton("stop timer");
		stopBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(timer!=null){
					timer.stop();
				}
			}
			
		});
		JPanel ctrlPanel = new JPanel();
		ctrlPanel.add(startBtn);
		ctrlPanel.add(stopBtn);
		return ctrlPanel;
	}
	private class FileOpenListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evt) {
			chooser.setCurrentDirectory(new File(PICTURE_DIR));
			int result = chooser.showOpenDialog(PicBrowser.this);
			if(result == JFileChooser.APPROVE_OPTION){
				File pictureDir = chooser.getSelectedFile();
				startBrowser(pictureDir);
			}
		}
		private void startBrowser(File pictureDir) {
			final File[] imageSets = initImageSets(pictureDir);
			final int length = imageSets.length;
			if(length==0) return;
			if(timer!=null) timer.stop();
			timer=null;
			timer = new Timer(200,new ActionListener(){
				int index = 0;
				
				@Override
				public void actionPerformed(ActionEvent e) {
					PicBrowser.this.setTitle(imageSets[index].toString());
					imageLabel.setIcon(new ImageIcon(imageSets[index].toString()));
					resizeIcon(new ImageIcon(imageSets[index].toString()));
					index++;
					index%=length;
				}
				
			});
		//	timer.setCoalesce(true);
			timer.setDelay(3*1000);
			timer.start();
		}
		private File[] initImageSets(File pictureDir) {
			return pictureDir.listFiles(new FilenameFilter(){

				@Override
				public boolean accept(File dir, String name) {
					if(!new File(dir,name).isFile())
						return false;
					String lowserName = name.toLowerCase();
					if(lowserName.endsWith("jpg")||lowserName.endsWith("jpeg")
							||lowserName.endsWith("gif")||lowserName.endsWith("png")){
						return true;
					}
					
						return false;
				}
				
			});
		}
		private void resizeIcon(ImageIcon originalIcon) {
			ImageIcon icon = originalIcon;
			double widthRatio = originalIcon.getIconWidth() * 1.0 /imageLabel.getWidth();
			double heightRatio = originalIcon.getIconHeight() * 1.0 / imageLabel.getHeight();
			if(widthRatio <= 1&& heightRatio<=1){
				imageLabel.setIcon(icon);
				return;
			}
			int width = -1,height = -1;
			if(heightRatio>=widthRatio){
				height = imageLabel.getHeight();
			}else{
				width = imageLabel.getWidth();
			}
			icon = new ImageIcon(originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
			imageLabel.setIcon(icon);
		}
	}
	
	
	

	public static void main(String[] args) {
		new PicBrowser();
	}

}
