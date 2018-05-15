public class Max{
	static int max(int []a){
		int temp = a[0];
		for(int i = 1;i < a.length;i++)
			if(a[i] > temp)
				temp = a[i];
		return temp;
	}
	static double max(double []a){

		double temp = a[0];
		for(int i = 1;i < a.length;i++)
			if(a[i] > temp)
				temp = a[i];
		return temp;
	}
	public static void main(String []args){
		int []a = {1,2,2,3,6};
		System.out.println(max(a));
		
	}
}