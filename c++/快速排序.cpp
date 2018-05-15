/*算法实验：请使用递归分治法编写Hoare快速排序算法。再次提醒，
请仔细地阅读红色的注意事项，并按时按质完成，
否则会影响你的成绩。算法的输入如下：
 7.30 7.15 4.27 2.14 6.29 3.99 0.26 9.10 1.89 2.86
 0.44 5.52 4.35 4.39 6.70 9.82 3.55 2.38 9.12 3.54
 1.30 5.20 6.59 9.08 1.79 3.52 4.06 0.43 5.31 7.19
 6.07 7.06 9.92 7.79 3.46 6.16 1.83 2.78 3.20 2.95
 9.20 0.22 7.13 8.28 5.58 0.80 2.63 7.44 3.04 8.58
 9.61 4.52 2.12 1.73 4.16 3.66 2.36 4.08 9.36 8.03
 4.92 4.90 9.59 9.83 7.85 3.99 2.68 2.49 4.69 7.67
 7.56 8.85 3.88 7.74 6.27 5.48 7.29 2.81 3.67 2.52
 1.95 1.82 4.38 4.42 5.54 4.41 1.94 0.31 8.41 5.69
 4.59 */
 #include<stdio.h>
 #include<stdlib.h>
 #include<time.h>
 #define N 91
 void randQuickSort(float a[], int start, int end);
 int randSort(float a[], int start,int end);
 void Swap(float &a, float &b);
 int Partition(float a[], int start, int end);
 int Random(int a, int b);
 
 int main()
 {
 	float a[N] = {7.30,7.15,4.27,2.14,6.29,3.99,0.26,9.10,1.89,2.86
				,0.44,5.52,4.35,4.39,6.70,9.82,3.55,2.38,9.12,3.54
				,1.30,5.20,6.59,9.08,1.79,3.52,4.06,0.43,5.31,7.19
				,6.07,7.06,9.92,7.79,3.46,6.16,1.83,2.78,3.20,2.95
				,9.20,0.22,7.13,8.28,5.58,0.80,2.63,7.44,3.04,8.58
				,9.61,4.52,2.12,1.73,4.16,3.66,2.36,4.08,9.36,8.03
				,4.92,4.90,9.59,9.83,7.85,3.99,2.68,2.49,4.69,7.67
				,7.56,8.85,3.88,7.74,6.27,5.48,7.29,2.81,3.67,2.52
				,1.95,1.82,4.38,4.42,5.54,4.41,1.94,0.31,8.41,5.69
				,4.59};
	randQuickSort(a,0,N-1);
 	for(int i = 0; i < N;i++)
 	printf("%.2f ",a[i]);
 	putchar(10);
 	
 	
 	return 0;
 }
void randQuickSort(float a[], int start, int end)
{
	if(start < end)
	{		
		int q = randSort(a,start,end);
		randQuickSort(a,start,q - 1);
		randQuickSort(a,q+1,end);
	}
}
int randSort(float a[], int start,int end)
{
			
	int i = Random(start,end);
	Swap(a[i],a[start]);
	return Partition(a,start,end);
}
int Random(int a, int b)
{
	srand(time(0));
	return rand() % (b - a) + a;
}
void Swap(float &a, float &b)
{	
	float c;
	c = a;
	a = b;
	b = c;
}
int Partition(float a[], int start, int end)
{

	int i = start, j = end + 1;
	float x = a[start];
	while(1)
	{
		while(a[++i] < x && i < end);
		while(a[--j] > x);
		if(i >= j) break;
		Swap(a[i],a[j]);
	}
	a[start] = a[j];
	a[j] = x;

	return j;		
}








