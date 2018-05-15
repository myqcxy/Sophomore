package test;

import java.io.*;

public class FileListExtFiles2 {

	public static void main(String[] args) {
		showList(new File("F:\\learn\\java\\shiyan\\src"),"py");
	}
	public static void showList(File f,final String suffix)
	{
		if(!f.isDirectory())
			return;
		String[] files = f.list(new FilenameFilter(){
			public boolean accept(File dir,String name)
			{
				if(new File(dir,name).isDirectory())
					return false;
				return name.endsWith(suffix);
			}	
		});
		if(files==null)
			return;
		for(String file:files)
			System.out.println(file);	
	}

}
