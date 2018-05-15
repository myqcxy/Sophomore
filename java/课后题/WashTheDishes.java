public class WashTheDishes{
	public static void main(String []args){
		int riceBowl,soupBowl,foodBowl;
		for(riceBowl = 0;riceBowl < 65;riceBowl++)
			for(soupBowl = 0;soupBowl < 65;soupBowl++)
			{
				foodBowl = 65-riceBowl-soupBowl;
				if(2*riceBowl==3*soupBowl&&2*riceBowl==4*foodBowl)
					System.out.println(2*riceBowl);
			}
				
	}
}