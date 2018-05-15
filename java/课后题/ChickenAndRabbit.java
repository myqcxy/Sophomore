public class ChickenAndRabbit{
	public static void main(String []args){
		int c, r;
		for(c = 0;c <= 35;c++){
			r = 35 - c;
			if(2*c+r*4==94)
				System.out.println(c+" " +r);
		}
			
		
	}
}