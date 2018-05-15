public class Chicken{
	public static void main(String []args){
		int x = 0, y, z;
		while(x < 100){
			
			y = 5*x/3-100;
			z = 200 - 8*x/3;
			if(y >= 0&&z>=0)
				System.out.println(x + " " + y + " " + z);
			x +=3;
		}
	}
	
}