package RuntimeTEst;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader extends RunTimeTest {

	@Override
	void run() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("data.txt"));
			// char []c = new char[10];
			int len = 0;
			while ((len = in.read()) != -1)
				;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
