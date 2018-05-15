public class NumberOfParts{
	static boolean isTotal(int n){
		if(!((n-2)%4==0))
			return false;
		else if(!((n-3)%7==0))
			return false;
		else if(!((n-5)%9==0))
			return false;
		return true;
	}
	public static void main(String []args){
		for(int i = 100;i < 201;i++)
			if(isTotal(i))
				System.out.println(i);
		
	}
}