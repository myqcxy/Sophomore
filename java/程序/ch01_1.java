import java.util.*;
public class ch01_1{
	static double function(double x){
		if(x < 0)
			return x*x;
		else if (x>=10)
			return 3*x-11;
		else 
			return 2*x-1;
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����Ҫ���������");
		double t = input.nextDouble();
		System.out.println("�����" + function(t));
		
	}
}