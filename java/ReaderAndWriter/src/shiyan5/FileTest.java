package shiyan5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {	
	void printFile(File f,File f1) throws IOException{
		
		if(f.isDirectory()){	
			f1.mkdir();
			try {
				for(File i : f.listFiles()){	
					
					printFile(i,new File(f1+ "\\" + i.getName()));
					
				}
			} catch (Exception e) {
				
			}
			
		}
		else{
			new CopyPhoto().copy(f.getAbsolutePath(), f1.getAbsolutePath());
		}
	}
	public static void main(String[] args) throws IOException {
		FileTest a = new FileTest();
		File f = new File("E:\\地下城与勇士");
		File f1 = new File("E:\\地下城与勇士1");
		a.printFile(f,f1);
		/*FileWriter s = new FileWriter("C:\\Users\\MYQ\\Desktop\\shiyanw\\sdf\\sdf");
		s.write("sdfsdf");
		s.close();*/
		
	}

}
