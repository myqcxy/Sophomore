#include <stdio.h>
#include <unistd.h>
main( )
{
int p1,p2;
while((p1=fork( ))==-1);        /*创建子进程p1*/
if (p1==0) { printf("bbbbb\n");  printf("p1=%d\n",p1); printf("pid=%d\n",getpid());
}        
else 
{ 
while((p2=fork( ))==-1);   /*创建子进程p2*/
if(p2==0)  {printf("cccccc\n"); printf("p2=%d\n",p2); printf("pid=%d\n",getpid());}   
else  
{printf("aaaaaaaaa");  printf("p1=%d\n",p1); printf("ppid=%d\n",getppid());  
}
}
}
 
