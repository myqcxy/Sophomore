#include<stdio.h>

#include<string.h>

#define N 10000

void LCSLength(int m, int n,char *x,char *y);
void LCS(int i,int j,char *x);

int c[N][N],b[N][N];

int main()
{
	int i = 1, j = 1;
	char x[N];
	char y[N];
	while(x[i++] = getchar(),x[i-1] != '=') ;
	x[--i] = '\0';
	getchar();
	while(y[j++] = getchar(),y[j-1] != '=') ;
	y[--j] = '\0';


	LCSLength(i,j,x,y);
	LCS(i,j,x);
	
	
	
	return 0;
}
void LCS(int i,int j,char *x)
{
	if(i == 0||j == 0) return;
	if(b[i][j] == 1)
	{
		LCS(i-1,j-1,x);
		printf("%c", x[i]);
	}
	else if(b[i][j] == 2)
	{
		LCS(i-1,j,x);
	}
	else LCS(i,j-1,x);
}
void LCSLength(int m, int n,char *x,char *y)
{
	int i, j;
	for(i = 1;i <= m;i++) c[i][0] = 0;
	for(j = 1;j <= n;j++) c[0][i] = 0;
	for(i = 1; i <= m;i++)
		for(j = 1;j <= n;j++){
			if(x[i] == y[j])
			{
				c[i][j] = c[i-1][j-1] + 1;
				b[i][j] = 1;
			}
			else if(c[i-1][j] >= c[i][j-1])
			{
				c[i][j] = c[i-1][j];
				b[i][j] = 2;
			}
			else 
			{
				c[i][j] = c[i][j-1];
				b[i][j] = 3;
			}
		}
}
