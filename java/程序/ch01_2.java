public class ch01_2{
	public static void main(String []args){
		int [] a = {1,2,3,4,5,6,7,8};
		int temp;
		for(int i = 0, j = a.length - 1;i < j;i++,j--)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		for(int i:a)
		{
			System.out.print(" "+i);
		}
	}
}