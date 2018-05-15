package work;
import java.util.Scanner;
	

public class Main{
	public void sort(int []a,int start,int end){
		if(start < end)
		{
			int t = partion(a,start,end);
			sort(a,start,t-1);
			sort(a,t+1,end);
		}
	}
	public int partion(int []a, int start,int end){
		int i = start;
		int j = end + 1;
		int temp = a[i];
		while(true){
			while(a[++i] < temp&&i < end);
			while(a[--j] > temp);
			if(i >= j) break;
			int s = a[i];
			a[i] = a[j];
			a[j] = s;
		}
		a[start] = a[j];
		a[j] = temp;
		return j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Main t = new Main();
		int n = in.nextInt();
		int [] a = new int[n];
		int [] b =  new int [n];
		for (int i = 0;i<n;i++)
		{
			a[i] = in.nextInt();
			b[i] = a[i];
		}
		
		int m = in.nextInt();
		while(m-- > 0){
			for (int i = 0;i<n;i++)
			{
				b[i] = a[i];
			}
			int p = in.nextInt();
			int r = in.nextInt();
			int k = in.nextInt();
			t.sort(b,p-1,r-1);
			System.out.println(b[r-k]);
		}
	}

}
