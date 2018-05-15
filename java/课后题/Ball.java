public class Ball{
	public static void main(String []args){
		int i = 1;
		double high = 50;
		double d = 100;
		while(i++ < 10)
		{
			d += high * 2.0;
			high /= 2.0;
		}
		System.out.println(d + " " + high);
		
	}
}