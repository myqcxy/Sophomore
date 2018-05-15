package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConcoleToFile {
	public void writeToFile(String fileName) throws IOException{
		Scanner reader = new Scanner(System.in);
		BufferedWriter writer = null;
		writer = new BufferedWriter(new FileWriter(fileName));
		int len = 0;
		String c;
		System.out.println("请输入数据：");
		while(reader.hasNext()){
			c = reader.next();
			if(c.equalsIgnoreCase("exit")){
				System.out.println("已结束！");
				break;
			}
				
			writer.write(c + "\n");
			
		}
		
		writer.close();
		reader.close();
	}
	public static void main(String[] args) throws IOException {
		ConcoleToFile w = new ConcoleToFile();
		w.writeToFile("C:\\Users\\MYQ\\Desktop\\test\\shiyan5");
	}

}
