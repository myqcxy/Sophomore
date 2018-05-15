package ReaderAndWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writer writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("C:\\Users\\MYQ\\Desktop\\test\\writer.txt"));
			String a = "123456";
			writer.write(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(writer!=null){
				try {
					writer.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
