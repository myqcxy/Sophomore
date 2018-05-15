#include<stdio.h>
int check(int a, int b,int c);
int main()
{
	int i, j, k, t,m;
	for(i = 11;i < 30;i++)
	for(j = i + 1; j < 31;j++)
	for(k = j + 1; k < 32;k++)
	{
		if(check(i*i,j*j,k*k))
		printf("%d %d %d", i*i,j*j,k*k);
		
	}
	
	return 0;
}
int check(int a, int b,int c)
{
	int  t, m;
	int list[9];
		list[0] = a / 100;
		list[1] = a / 10 % 10;
		list[2] = a % 10;
		list[3] = b / 100;
		list[4] = b / 10 % 10;
		list[5] = b % 10;
		list[6] = c / 100;
		list[7] = c / 10 % 10;
		list[8] = c % 10;
		for(t = 0;t < 9;t++)
		for(m = t+1;m < 9;m++)
			if(list[t] == list[m])
			return 0;
			
		return 1;
}
