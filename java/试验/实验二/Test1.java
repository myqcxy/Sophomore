import java.lang.Math;
public class Test1{
	static double pi(){
		int i = 0;
		double sum = 0;
		double temp;
		do{
			temp = 1.0/(2.0*i+1);
			sum += temp * Math.pow(-1,i);
			i++;
			
		}while(temp > 1.0e-6);
		return 4.0* sum;
	}
	public static void main(String []args){
		System.out.println(pi());
		
	}
}