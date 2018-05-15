package test;

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
		File f = new File("C:\\Users\\MYQ\\Desktop\\test");
		File f1 = new File("C:\\Users\\MYQ\\Desktop\\test2");
		a.printFile(f,f1);
	}

}
