#include <malloc.h> 
#include<stdio.h> 
#include<windows.h>

int xin_guke;	//��ֵΪ��������������ǰ���Խ��븶��״̬������
int guke;		//�˿�������
int shouyin;	//����Ա������
int metex;		//ʵ�ֶ����������Ļ������ 
 
typedef struct LNode	// ���
{
	char name;
	LNode *next;
}*Llist;

typedef struct a	// ����
{
	LNode *front;
	Llist last;
}*linklist;

linklist dengdai;//�ȴ�����
linklist jiuxu; //�������� 

void init(linklist &l)//��ʼ������ l 
{
	l=(linklist)malloc(sizeof(a));
	l->front=l->last=NULL;
}

void enque(linklist &l,char name)	//  ����Ϊ name �Ľ����뵽L ������
{
	Llist p=(Llist)malloc(sizeof(LNode)); 
	p->name=name;
	p->next=l->front;
	l->front=p;
}

char deque(linklist &l)	//ɾ�� l �����еĽ��
{
	char name='0'; 
	if(l->front!=NULL)
	{
		name=l->front->name; 
		l->front=l->front->next;
	}
	return name;
}

void show(linklist &l)	//�������	L ����Ϣ
{
	while (l->front!=NULL)
	{
		printf("%c\n",l->front->name);
		l->front=l->front->next;
	}
}

void p()	//���ź�����ִ��	P ���������ж�������Աʱ������������У�
{//	����ʱ������ȴ�����
	if(metex==1){
	//	printf("�õ�\n");
		metex--;
	}else{
		printf("��ʱxin_guke���ڱ�ʹ�ã���\n");
		return;
	}
	xin_guke--; 
	if(xin_guke>=0)
	{
		if(dengdai->front!=NULL)
		{
			printf(" �˿� %c	���������� \n",dengdai->front->name);
		//	enque(jiuxu,deque(dengdai));	
		}
	}else{	 
		printf(" ����Աæ ,���ȹ˿͵��ȴ�����	~~~\n");
	}
	metex++;
}

void v()
{	
	if(metex==1){
		metex--;
	}else{
		printf("��ʱxin_guke���ڱ�ʹ�ã���\n");
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
			printf(" �˿� %c	��Ǯ��ϣ� ~~\n",jiuxu->front->name);
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
		printf(" ������˿�����	�˿���Ϊ����\n");
		if(scanf("%d",&guke)!=1){
			printf("����������˳�������\n");
			return 0;
		}
		printf(" ����������Ա����	\n");
		if(scanf("%d",&shouyin)!=1){
			printf("����������˳�������\n");
			return 0 ;
		}
	
		if(shouyin>0)
		{
			xin_guke=shouyin;
			/* guke=8;
			shouyin=xin_guke;
			*/
			init(dengdai);	//��ʼ���ȴ�����
			init(jiuxu);	//��ʼ����������
			
			for (int i=guke;i>0;i--)
			{
				enque(dengdai,(char)(i+96));	//���ݹ˿��������˿Ͳ���ȴ�����
			}
		
			while(dengdai->front!=NULL||jiuxu->front!=NULL)
			{
				gk();
			}
		}
		else
		{
			printf(" �Բ��𣬲���û������Ա��	\n");
		}
		getchar();
		
		printf("�Ƿ��������?\t\a����N�˳�\n");
		char choice = 'N';
		scanf("%c",&choice);
		if(choice=='n'||choice=='N'){
			printf("��лʹ�ã����˳�\n");
			 return 0;
		}
		system("cls") ;	
	} 
	
}
