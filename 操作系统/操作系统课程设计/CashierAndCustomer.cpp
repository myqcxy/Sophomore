#include <malloc.h> 
#include<stdio.h> 
#include<windows.h>

int xin_guke;	//初值为收银人数，代表当前可以进入付款状态的人数
int guke;		//顾客总人数
int shouyin;	//收银员总人数
int metex;		//实现对收银人数的互斥访问 
 
typedef struct LNode	// 结点
{
	char name;
	LNode *next;
}*Llist;

typedef struct a	// 链表
{
	LNode *front;
	Llist last;
}*linklist;

linklist dengdai;//等待队列
linklist jiuxu; //就绪队列 

void init(linklist &l)//初始化链表 l 
{
	l=(linklist)malloc(sizeof(a));
	l->front=l->last=NULL;
}

void enque(linklist &l,char name)	//  将名为 name 的结点插入到L 链表中
{
	Llist p=(Llist)malloc(sizeof(LNode)); 
	p->name=name;
	p->next=l->front;
	l->front=p;
}

char deque(linklist &l)	//删除 l 链表中的结点
{
	char name='0'; 
	if(l->front!=NULL)
	{
		name=l->front->name; 
		l->front=l->front->next;
	}
	return name;
}

void show(linklist &l)	//输出链表	L 的信息
{
	while (l->front!=NULL)
	{
		printf("%c\n",l->front->name);
		l->front=l->front->next;
	}
}

void p()	//在信号量上执行	P 操作：当有多余收银员时，进入就绪队列，
{//	当满时，进入等待队列
	if(metex==1){
	//	printf("得到\n");
		metex--;
	}else{
		printf("此时xin_guke正在被使用！！\n");
		return;
	}
	xin_guke--; 
	if(xin_guke>=0)
	{
		if(dengdai->front!=NULL)
		{
			printf(" 顾客 %c	到就绪队列 \n",dengdai->front->name);
		//	enque(jiuxu,deque(dengdai));	
		}
	}else{	 
		printf(" 收银员忙 ,调度顾客到等待队列	~~~\n");
	}
	metex++;
}

void v()
{	
	if(metex==1){
		metex--;
	}else{
		printf("此时xin_guke正在被使用！！\n");
		return;
	}
	xin_guke++;

	metex++;
}

void sy()
{
	for(int j=shouyin;j>0;j--) 
		if(jiuxu->front!=NULL)
		{
			printf(" 顾客 %c	收钱完毕！ ~~\n",jiuxu->front->name);
			deque(jiuxu);
			guke--;
		}
}
void gk()
{
	int j=guke;
	for(int i=j;i>0;i--)
		p();
	sy();
	for(int i=j;i>0;i--)	
		v();
}

int main()
{
	while(1){
		metex = 1; 
		int t = 0;
		printf(" 请输入顾客数：	顾客数为整数\n");
		if(scanf("%d",&guke)!=1){
			printf("输入错误，已退出！！！\n");
			return 0;
		}
		printf(" 请输入收银员数：	\n");
		if(scanf("%d",&shouyin)!=1){
			printf("输入错误，已退出！！！\n");
			return 0 ;
		}
	
		if(shouyin>0)
		{
			xin_guke=shouyin;
			/* guke=8;
			shouyin=xin_guke;
			*/
			init(dengdai);	//初始化等待队列
			init(jiuxu);	//初始化就绪队列
			
			for (int i=guke;i>0;i--)
			{
				enque(dengdai,(char)(i+96));	//根据顾客数，将顾客插入等待队列
			}
		
			while(dengdai->front!=NULL||jiuxu->front!=NULL)
			{
				gk();
			}
		}
		else
		{
			printf(" 对不起，不能没有收银员！	\n");
		}
		getchar();
		
		printf("是否继续测试?\t\a输入N退出\n");
		char choice = 'N';
		scanf("%c",&choice);
		if(choice=='n'||choice=='N'){
			printf("感谢使用！已退出\n");
			 return 0;
		}
		system("cls") ;	
	} 
	
}
