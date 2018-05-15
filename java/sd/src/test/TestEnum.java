package test;

import java.util.Scanner;

public class TestEnum {
	/*public static Scanner in = new Scanner(System.in);*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input a ");
		
		int a;
		while (true) {
			
			try {
				Scanner in = new Scanner(System.in);
				a = in.nextInt();
				break;
			} catch (Exception e) {
				// TODO Auto-generated catch block
			//	in.nextLine();
				System.out.println("请输入一个整数");
			} 
		}
		System.out.println(a);

		
	}

}
