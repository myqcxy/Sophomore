package hex;
import java.util.Math;
import java.util.Scanner;
public class hex {
	static StringBuffer toejz(char s){
		String c = "0123456789ABCDEF";
		int i = 0;
		for(;i<16;i++)
		{
			if(c.charAt(i) ==  s)
				break;
		}
		StringBuffer str = new StringBuffer();
		int j = 0;
		while(i!=0){
			str.insert(0, i%2);
			j++;
			i/=2;
		}
		for(;j<4;j++)
			str.insert(0, '0');
		return str;
		
	}
	static StringBuffer ejz(StringBuffer s){
		StringBuffer s2 = new StringBuffer();
		for(int i = 0;i < s.length();i++)
		{
			s2.append(toejz(s.charAt(i)));
		}
		return s2;
	}
	static StringBuffer bjz(StringBuffer s){
		StringBuffer s1 = ejz(s);
		s1.insert(0, "00");
		StringBuffer s2 = new StringBuffer();
		int len = s1.length();
		int t = 0, j = len;
		int temp = 0;
		for(;j-3 >= 0;j-=3)
		{			
			temp = tobjz(s1.substring(j-3,j));
			s2.insert(0,temp);
		}
		return s2;
		
	}
	static int tobjz(String s1){
		int len = s1.length();
		int t = 0, j = len;
		int temp = 0;
		for(int i = 0;i < s1.length();i++)
		{
			temp = s1.charAt(--j) - '0';
			t += temp*Math.pow(2, i);
		}

		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("123");
		System.out.println(bjz(s));
		/*
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String []s;
		s = new String[n];
		for(int i = 0;i < n;i++){
			s[i] = in.nextLine(); 
		}
		for(int i = 0;i < n;i++)
		{
			System.out.println(s[i]);
		}*/
		
	}

}
