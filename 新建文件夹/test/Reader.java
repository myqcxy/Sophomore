
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Reader {
		public static void main(String []args) throws IOException{
			InputStream in = null;
			try {
				in = new FileInputStream("C:\\Users\\MYQ\\Desktop\\test\\test.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int i = 0;
			int j = 0;
			byte []a = {0,0,0,0};
			try {
				while((i = in.read(a))!=-1){
					for(int k = 0;k<a.length;k++) 
						System.out.print((char)a[k]);
						System.out.print(i + " " );
					
					
						
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				in.close();
			}
			FileReader reader = null;
	
				try {
					reader = new FileReader("C:\\Users\\MYQ\\Desktop\\test\\test.txt");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int i1 = 0;
				while((i1 = reader.read()) !=-1)
					System.out.print((char)i1);
			
		}
	
}
