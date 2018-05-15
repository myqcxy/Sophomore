#include <stdio.h>  
#include <stdlib.h>  
#include <string.h>  
  
#define EQUAL   1   //EQUAL��ʾc[i][j]����c[i-1][j-1]+1����=====��ʱ������������ͬ���ַ�  
#define UP      2   //UP��ʾc[i][j]����c[i-1][j]����============��ʱ��������û����ͬ���ַ�  
#define LEFT    3   //LEFT��ʾc[i][j]����[ci][j-1]����==========��ʱ��������û����ͬ���ַ�  
  
  
/************************************************************** 
22.������int Lcs_length( char *str1, char *str2, int **c, int **b) 
23.���룺 str1:   ���Ƚ��ַ���1 
24.        str2:   ���Ƚ��ַ���2 
25.        **c:    ������󹫹������г��� 
26.        **b:    ������󹫹������м���·�� 
27. 
28.����ֵ��str1��str2��󹫹������� 
29.ʱ�临�Ӷȣ�O(mn) 
30.�ռ临�Ӷȣ�O(mn) 
31.***************************************************************/  
int Lcs_length( char *str1, char *str2, int **c, int **b)  
{  
    int len1 = strlen(str1),  
       len2 = strlen(str2);  
    int i,j;  
    for( i = 1; i <= len1; i++)  
        c[i][0] = 0;  
    for ( j = 0; j <= len2; j++)  
        c[0][j] = 0;  
    for(  i = 1; i <= len1; i++)  
        for( j = 1; j <= len2; j++)  
        {     
            /******************************* 
            ʹ��i-1��j-1 
46.            �㷨��������д���ǱȽ�str1[i]��str[j]�������㷨�������ϵ����������±�����1��ʼ�� 
47.            ����ʹ��i-1�Լ�j-1������������±��0��ʼ 
48.            ********************************/  
            if( str1[i-1] == str2[j-1] )                                              
            {  
                c[i][j] = c[i-1][j-1] + 1;  
                b[i][j] = EQUAL;   
            }  
            else if (c[i-1][j] >= c[i][j-1])  
                {  
                    c[i][j] = c[i-1][j];  
                    b[i][j] = UP;  
                }  
            else   
                {  
                    c[i][j] = c[i][j-1];  
                    b[i][j] = LEFT;  
                }  
        }  
        return c[len1][len2];  
}  
  
/************************************************************** 
������void Print_Lcs( char *str, int **b, int i, int j 
70.        str:    ���Ƚ��ַ���1 
71.        **b:    ������󹫹������м���·�� 
72.        i:      ���Ƚ��ַ���1�ĳ��� 
73.        j:      ���Ƚ��ַ���2�ĳ��� 
74. 
75.����ֵ���� 
76.��ӡֵ������ַ���1���ַ���2������������� 
77.ʱ�临�Ӷȣ�O(m+n) 
78.�ռ临�Ӷȣ�O(m+n) 
79.***************************************************************/  
void Print_Lcs( char *str, int **b, int i, int j)  
{  
    if( i == 0 || j == 0)  
        return;  
    if( b[i][j] == EQUAL)  
    {  
        Print_Lcs(str, b, i - 1, j - 1);  
        printf("%c", str[i-1]);  
    }  
    else if ( b[i][j] == UP )  
        Print_Lcs(str, b, i - 1, j);  
    else   
        Print_Lcs(str, b, i , j - 1);  
}  
  
/************************************************************** 
96.������void Find_Lcs( char *str1, char *str2) 
97.        str1:   ���Ƚ��ַ���1 
98.        str2:   ���Ƚ��ַ���2 
99.����ֵ���� 
100.��ӡֵ�������󹫹������г����Լ���󹫹������� 
101.ʱ�临�Ӷȣ�O(mn) 
102.�ռ临�Ӷȣ�O(mn) 
103.***************************************************************/  
void Find_Lcs( char *str1, char *str2)  
{  
    int i,j,length;  
    int len1 = strlen(str1),  
        len2 = strlen(str2);  
    //�����ά����  
    int **c = (int **)malloc(sizeof(int*) * (len1 + 1));  
    int **b = (int **)malloc(sizeof(int*) * (len1 + 1));  
    for( i = 0; i<= len1; i++ )  ////����Ⱥ�֮ǰû�ӣ������ڴ�й©  
    {  
        c[i] = (int *)malloc(sizeof(int) * (len2 + 1));  
        b[i] = (int *)malloc(sizeof(int) * (len2 + 1));  
    }  
  
    //��c[len1][len2]��b[len1][len2]��ʼ��Ϊ0  
    for ( i = 0; i<= len1; i++)  
        for( j = 0; j <= len2; j++)  
        {  
            c[i][j] = 0;  
            b[i][j] = 0;  
        }  
      
    //����LCS�ĳ���  
    length = Lcs_length(str1, str2, c, b);  
    printf("The number of the Longest-Common-Subsequence is %d\n", length);  
      
    //��������b����������  
    printf("The Longest-Common-Subsequence is: ");  
    Print_Lcs(str1, b, len1, len2);  
    printf("\n");  
  
    //��̬�ڴ��ͷ�  
    for ( i = 0; i <= len1; i++)  
    {  
        free(c[i]);  
        free(b[i]);  
    }  
    free(c);  
    free(b);  
}  
  #define N 10000
int main()  
{  
int i=0, j=0;
    char x[N];  
    char y[N];  
    while(x[i++] = getchar(),x[i-1]!= '=') ;
	x[--i] = '\0';
	getchar();
	while(y[j++] = getchar(),y[j-1]!= '=') ;
	y[--j] = '\0';
    Find_Lcs(x,y);  
    system("pause");  
}  

