
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

#define TRUE 1
#define FALSE 0
#define INVALID -1
#define NULL 0
#define total_instruction 320    /* 指令流长 */
#define total_vp 32              /* 虚页长 */
#define clear_period 50          /*清零周期*/
typedef struct{                  /* 页面结构*/
  int pn,pfn,counter,time;
}pl_type;
pl_type pl[total_vp];            /* 页面结构数组*/
struct pfc_struct{               /* 页面控制结构*/
  int pn,pfn;
  struct pfc_struct *next;
};
typedef struct pfc_struct pfc_type;
pfc_type pfc[total_vp],*freepf_head,*busypf_head,*busypf_tail;
int diseffect,  a[total_instruction];
int page[total_instruction],  offset[total_instruction];

void initialize();
void FIFO();

main()
{
  int S,i,j,temp;

  srand(getpid()*10);  /*由于每次运行时进程号不同，故可以用来作为初始化随即数队列的“种子”*/
  S=(float)319*rand()/RAND_MAX+1;
//  printf("s=%d\n",S);
  for(i=0;i<total_instruction;i+=4)  /* 产生指令队列*/
  {
    a[i]=S;                          /*任选一指令访问点*/
    a[i+1]=a[i]+1;                   /* 顺序执行一条指令*/
//    a[i+2]=(float)a[i]*rand()/32767;
    a[i+2]=(float)a[i]*rand()/RAND_MAX;/* 执行前地址指令m'*/
    a[i+3]=a[i+2]+1;                   /* 执行后地址指令*/
    S=(float)rand()*(318-a[i+2])/RAND_MAX+a[i+2]+2;
        
  }
  for(i=0;i<total_instruction;i++)     /* 将指令序列变换成页地址流*/
  {
    page[i]=a[i]/10;
    offset[i]=a[i]%10;

  }
  for(i=4;i<=32;i++)                   /* 用户内存工作区从4个页面到32个页面*/
  {
    printf("%2d page frames",i);
    FIFO(i);
    printf("\n");
  }
}
void FIFO(total_pf)                    /* FIFO算法*/
int total_pf;                          /* 用户进程的内存页面数*/
{
  int i,j;
  pfc_type *p,*t;
  initialize(total_pf);               /* 初始化相关页面控制用数据结构*/
  busypf_head=busypf_tail=NULL;       /* 忙页面队列头，队列尾链接*/
  for(i=0;i<total_instruction;i++)
  {

    if(pl[page[i]].pfn==INVALID)     /*页面失效*/
    {

      diseffect+=1;                  /* 失效次数*/
      if(freepf_head==NULL)          /* 无空闲页面*/
      {
        p=busypf_head->next;
        pl[busypf_head->pn].pfn=INVALID;
        freepf_head=busypf_head;     /*释放忙页面队列中的第一个页面*/
        freepf_head->next=NULL;
        busypf_head=p;
      }
      p=freepf_head->next;          /*按FIFO方式调新页面入内存页面*/
      freepf_head->next=NULL;
      freepf_head->pn=page[i];
      pl[page[i]].pfn=freepf_head->pfn;
      if(busypf_tail==NULL)
            busypf_head=busypf_tail=freepf_head;
      else
      {
        busypf_tail->next=freepf_head;
        busypf_tail=freepf_head;
      }
      freepf_head=p;      
    }
  }
  printf(" FIFO:%6.4f",1-(float)diseffect/320);
}

void initialize(total_pf)         /*初始化相关数据结构*/
  int total_pf;                   /*用户进程的内存页面数*/
{
  int i;
  diseffect=0;
  for(i=0;i<total_vp;i++)
  {
    pl[i].pn=i;pl[i].pfn=INVALID;  /*置页面控制结构中的页号，页面为空*/
    pl[i].counter=0;pl[i].time=-1; /*页面控制结构中的访问次数为0，时间为-1*/
  }
  for(i=1;i<total_pf;i++)
  {
    pfc[i-1].next=&pfc[i];pfc[i-1].pfn=i-1; /*建立pfc[i-1]和pfc[i]之间的链接*/
  }
  pfc[total_pf-1].next=NULL;pfc[total_pf-1].pfn=total_pf-1;
  freepf_head=&pfc[0];             /*空页面队列的头指针为pfc[0]*/
}
