import java.util.*;
public class SumOfNumbers{
	static int sumOfNumbers(int n){
		int sum = 0;
		while(n>0){
			sum += n%10;
			n /= 10;
		}
	return sum;
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int a = 0;
		while(true)
		{
			try{
				System.out.println("请输入需要计算的整数：");
				a = input.nextInt();
				break;
			}
			catch(InputMismatchException e){
				input.nextLine();
				System.out.println("输入错误，请重新输入：");
			}
		}
		
		
		int sum = sumOfNumbers(a);
		System.out.println("的各位数字之和是："+sum);
		
		
	}
}