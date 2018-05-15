package Zip;

import java.io.*;
import java.util.*;
import java.util.zip.*;


public class UnZip {

	public static void main(String[] args) throws IOException {
		ZipFile zf = new ZipFile("C:\\Users\\MYQ\\Desktop\\test\\writer.zip");
		Enumeration entriesEnum = zf.entries();
		while(entriesEnum.hasMoreElements()){
			ZipEntry entry = (ZipEntry)entriesEnum.nextElement();
			System.out.println(entry.getSize());
			if(entry.isDirectory()) 
				new File(entry.getName()).mkdirs();
			
			else{
				InputStream in = zf.getInputStream(entry);
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\MYQ\\Desktop\\test" + "\\"+entry.getName()));
				
				byte []b = new byte[8*1024];
				int len = 0;
				while((len = in.read(b))!=-1){
					out.write(b,0,len);
				}
				in.close();
				out.close();
			}
		}
		
	}

}
