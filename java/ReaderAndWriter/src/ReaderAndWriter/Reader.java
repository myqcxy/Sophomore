package ReaderAndWriter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Reader {
		public static void main(String []args){
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new InputStreamReader(System.in));
				int n = 0;
				while((n = reader.read())!=-1){
					System.out.print((char)n);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
		
				e.printStackTrace();
			}finally{
				if(reader==null)
					try {
						reader.close();
					} catch (IOException e) {
					
						e.printStackTrace();
					}
			}
			
	
			
		}
	
}
