public class shui{
	public static void main(String []args){
		int n = 234;
		int i = n % 10;
		int j = n / 10 %10;
		int k = n / 100;
		System.out.println(i*i*i+j*j*j+k*k*k == n);
	}
}