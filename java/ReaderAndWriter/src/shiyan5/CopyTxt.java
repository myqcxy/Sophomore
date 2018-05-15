package shiyan5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyTxt {

	public static void main(String[] args) throws IOException {
		CopyTxt ct = new CopyTxt();
		ct.copyTxt("C:\\Users\\MYQ\\Desktop\\shiyan\\src\\shiyan5\\CopyTxt.java","C:\\Users\\MYQ\\Desktop\\shiyan\\src\\shiyan5\\CopyTxt1.java");

	}

	private void copyTxt(String from, String to) throws IOException {
		BufferedReader reader = null;
		PrintWriter writer = null;
		reader = new BufferedReader(new FileReader(from));
		writer = new PrintWriter(new BufferedWriter(new FileWriter(to)));
		int len = 0;
		String s = null;
		while((s = reader.readLine())!=null){
			writer.println(s);
		}
		reader.close();
		writer.close();
		
	}

}
