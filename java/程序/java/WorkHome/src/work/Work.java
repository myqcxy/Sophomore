package work;

import java.util.Random;
import java.util.Scanner;


public class Work {

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
		
		
		
		
		// TODO Auto-generated method stub
/*		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("��ʽ��֮������ڸ�ʽ�ǣ�yyyy��MM��dd ,E, HH:mm:ss");
		System.out.println(sdf.format(date));
		Calendar cal = Calendar.getInstance();
		cal.set(2017,3,3);
		System.out.println(cal.getTimeInMillis()/1000/60/60/24/365);
		Random r  = new Random();
		for(int i = 0;i < 20;i++)
			System.out.println(r.nextInt(2));*/
		
	}

}
