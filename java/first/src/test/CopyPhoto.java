package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPhoto {

	public static void main(String[] args) throws IOException {
		CopyPhoto cp = new CopyPhoto();
		cp.copy("C:\\Users\\user\\Desktop\\ʵ����\\Koala.jpg","C:\\Users\\user\\Desktop\\ʵ����\\Koala(����).jpg");

	}

	public void copy(String from, String to) throws IOException {
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		in = new BufferedInputStream(new FileInputStream(from));
		out = new BufferedOutputStream(new FileOutputStream(to));
		byte [] b = new byte[1024];
		int len = 0;
		while((len = in.read(b))!=-1){
			out.write(b);
		}
		
		in.close();
		out.close();
		
		
	}

}