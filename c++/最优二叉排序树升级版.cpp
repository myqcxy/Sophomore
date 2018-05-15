#include<stdio.h> 
#define N 200

double c[N][N];
int r[N][N];
int s[N];
double q[N];
double p[N];
int sum = 0;
void OBST(int n) 
{
	double w[N][N];
	int i, t, k, j, i1, j1;
	for(i = 1; i <= n+1;i++)
	{
		c[i][i-1] = 0;
		w[i][i-1] = q[i-1];
		r[i][i-1] = 0;
	}
	for(t = 0;t < n;t++)
		for(i =1;i<=n-t;i++)
		{
			j=i+t;
			i1 = r[i][j-1] > i ? r[i][j-1] : i;
			j1 = r[i+1][j] > i ? r[i+1][j] : j;
			w[i][j]=w[i][j-1] + p[j]+q[j];
			c[i][j]=c[i][i1-1] + c[i1+1][j];
			r[i][j]=i1;
			for(k=i1+1;k<=j1;k++)
				if(c[i][k-1]+c[k+1][j]<c[i][j])
				{
					c[i][j] = c[i][k-1]+c[k+1][j];
					r[i][j]=k;
				}
			c[i][j]+=w[i][j];
		}
}
void BS(int i,int j)
{
	if(i<=j)
	{
		printf("%d ", s[r[i][j]]);
		BS(i,r[i][j]-1);
		BS(r[i][j]+1,j);
	}
}
void find(int x,int i,int j)
{
	sum++;	
	if(i<=j&&x!=s[r[i][j]])
	{
		if(x > s[r[i][j]])
		find(x,r[i][j]+1,j);
		else
		find(x,i,r[i][j]-1);		
	}
}

int main()
{
	int i, j;
	for(i = 1;i < 124;i++) 
	{
		scanf("%d%*c%d", &s[i], &p[i]);
		q[i] = 0;
	}
	
	q[0] = 0;
	OBST(123);	
	for(i = 1;i < 124;i++)
		find(s[i],1,123);
	printf("\n%d\n", sum);
	BS(1, 123);
	
	return 0;
}
