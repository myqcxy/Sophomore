package Zip;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class ZipAFile {

	public static void main(String[] args) throws IOException {
		ZipOutputStream out = new ZipOutputStream(
				new BufferedOutputStream(new FileOutputStream("C:\\Users\\MYQ\\Desktop\\test\\test.zip")));
		FileInputStream in = new FileInputStream("C:\\Users\\MYQ\\Desktop\\test\\test.txt");
		/*ZipFile a = new ZipFile("C:\\Users\\MYQ\\Desktop\\Zip\\sdf");
		a.mk*/
		out.putNextEntry(new ZipEntry("test.txt"));
		byte[]b= new byte[1024];
		int num = 0;
		while((num = in.read(b))!=-1){
			out.write(b, 0, num);
			
			
		}
		in.close();
		out.close();
		System.out.print("sdf");
	}

}
