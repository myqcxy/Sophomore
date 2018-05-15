package shiyan;

import java.io.File;

public class FileTest {
	void printFile(File f,int j){
		for(int i =0;i<j;i++){
			System.out.print("\t");
		}
		if(f.isDirectory()){
			System.out.println("目录" + f + "中的文件和目录为：");		
			f.mkdir();
			try {
				for(File i : f.listFiles()){				
					printFile(i,j+1);
				}
			} catch (Exception e) {

			}		
		}
		else{

			System.out.println(f + " "+ f.length()/1024.0 + "kb");
		}
	}
	public static void main(String[] args) {
		FileTest a = new FileTest();
		File f = new File("C:\\Users\\user\\Desktop\\实验四");
		a.printFile(f,0);
	}

}
