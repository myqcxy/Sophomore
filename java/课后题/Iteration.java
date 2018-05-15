import java.lang.Math;
import java.util.*;
public class Iteration{
	static double f(double a){
		double x = a/2.0;
		while(Math.abs(a/2/x-x/2)>1.0e-5){
			x = 1.0/2*(x+a/x);
		}
		return x;
	}
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		System.out.println(f(a));
		
	}
}