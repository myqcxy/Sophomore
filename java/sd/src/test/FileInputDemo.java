package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*FileInputStream in = new FileInputStream("C:\\Users\\MYQ\\Desktop\\java��ҵ1\\test.txt");

		System.out.println((char)in.read());
		in.close();*/
		FileReader in = new FileReader("C:\\Users\\MYQ\\Desktop\\java��ҵ1\\test.txt");
		int c;
		while((c = in.read() )!= -1){
			System.out.print((char)c);
		}
		
		in.close();
	}

}