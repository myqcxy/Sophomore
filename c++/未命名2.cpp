#include<stdio.h>

#include<string.h>

#define N 10000
void LCSLength(int m, int n,char *x,char *y,int c[][N],int b[][N]);
void LCS(int i,int j,char *x,int b[][N]);



int main()
{ 	
	printf("dsfsd\n");
	int i = 1, j = 1;
	char x[N];
	char y[N];
	while(x[i++] = getchar(),x[i-1]!= '=') ;
	x[--i] = '\0';
	getchar();
	while(y[j++] = getchar(),y[j-1]!= '=') ;
	y[--j] = '\0';
/*	int k;
	int **c = (int **)malloc(sizeof(int*) * (i + 1));  
    int **b = (int **)malloc(sizeof(int*) * (i + 1));  
    for( k = 0; k<= i; k++ )  ////这个等号之前没加，导致内存泄漏  
    {  
        c[k] = (int *)malloc(sizeof(int) * (j + 1));  
        b[k] = (int *)malloc(sizeof(int) * (j + 1));  
    }  */
    int c[N][N],b[N][N];

	LCSLength(i,j,x,y,c,b);
	LCS(i,j,x,b);
	
	
	
	return 0;
}
void LCS(int i,int j,char *x,int b[][N])
{
	if(i == 0||j == 0) return;
	if(b[i][j] == 1)
	{
		LCS(i-1,j-1,x,b);
		printf("%c", x[i]);
	}
	else if(b[i][j] == 2)
	{
		LCS(i-1,j,x,b);
	}
	else LCS(i,j-1,x,b);
}
void LCSLength(int m, int n,char *x,char *y,int c[][N],int b[][N])
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
