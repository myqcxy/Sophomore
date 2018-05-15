import java.util.*;
public class Hex{
	static void toOctal(String a){
	
		
	}
	static void toBinary(String a){
		String t = a, s = "";
		n = t.length;
		for(int i=0;i<n;i++)
			switch(t.charAt(i))
			{
				case 'A':s = "1010";break;
				case 'B':s = "1011";break;
				case 'C':s = "1100";break;
				case 'D':s = "1101";break;
				case 'E':s = "1110";break;
				case 'F':s = "1111";break;
				case '9':s = '1001';break;
				case '8':s = '1000';break;
				case '7':s = '0111';break;
				case '6':s = '0110';break;
				case '5':s = '0101';break;
				case '4':s = '0100';break;
				case '3':s = '0011';break;
				case '2':s = '0010';break;
				case '1':s = '0001';break;
				case '0':s = '0000';break;
			}
	}
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		String []s = new String[n];
		in.nextLine();
		for(int i = 0;i < n;i++){
			s[i] = in.nextLine();
			toBinary(s[i]);
			toOctal(s[i]);
		}
		for(String i:s){
			System.out.println(i);
		}
		
	}
}