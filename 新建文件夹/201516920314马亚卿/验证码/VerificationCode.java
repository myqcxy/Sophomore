
import java.util.Random;
import java.util.Scanner;


public class VerificationCode{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random r = new Random();
		StringBuffer str = new StringBuffer();
		for(int i = 0 ;i < 4;i++){
			str.append(chars.charAt(r.nextInt(36)));
		}
		
		while(true){
			System.out.println("��֤��Ϊ��");
			System.out.print(str);
			System.out.print("\n��������֤�룺");	
			System.out.print("\n");
			StringBuffer str1 = new StringBuffer(in.nextLine());
			if(str.toString().equals(str1.toString())){
				System.out.println("��֤����֤�ɹ�������");
				break;
			}
			else{
				System.out.println("����������������룺");
			}
				
		}
		
	}

}
