import java.util.*;
public class Sort{
	static void quickSort(int []a,int p,int r){
		if(p<r){
			int q = partition(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a,q+1,r);
		}
	}
	static int partition(int []a, int p,int r){
		int i = p, j = r + 1;
		int x = a[p];
		int temp;
		while(true){
			while(a[++i]<x&&i<r);
			while(a[--j]>x);
			if(i>=j)break;
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		a[p] = a[j];
		a[j] = x;
		return j;
	}
	public static void main(String []args){
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int []a = new int[n];
		for(int i = 0;i < n;i++)
			a[i] = input.nextInt();	
		quickSort(a,0,n-1);
		for(int i:a)
			System.out.print(i + " ");
	}
}