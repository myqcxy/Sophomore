#include <stdio.h>
#include <sys/types.h>
#include <sys/msg.h>
#include <sys/ipc.h>
#define MSGKEY 75 
struct msgform
{ 
  long mtype;  
  char mtext[1030];
}msg;
int msgqid,i;
SERVER()
{
  msgqid=msgget(MSGKEY,0777|IPC_CREAT);  /*由关键字获得消息队列*/
  do
  {
    msgrcv(msgqid,&msg,1030,0,0);   /*从msgid消息队列接收消息msg*/
    printf("(server)received \n");
  }while(msg.mtype!=1);             /*消息类型为1时，释放队列*/
  msgctl(msgqid,IPC_RMID,0);
  exit(0);
}
main()
{
   while((i=fork())==-1);
   if(!i) SERVER();
   wait(0);
}
