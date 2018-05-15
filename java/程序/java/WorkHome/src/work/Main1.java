package work;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		long sum = 0L;
		if(n < 3) sum = 1;
		if(n%2 == 0){
			if(n%3!=0)
				sum = n * (n-1) *(n-3);
			else
				sum = (n-1) * (n-2) *(n-3);
		}
		else 
			sum = n * (n-1) *(n-2);
		System.out.println(sum);
	}

}
