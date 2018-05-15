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
CLIENT()
{  int i;
   msgqid=msgget(MSGKEY,0777);
   for (i=10;i>=1;i--)
   {     
     msg.mtype=i;
     printf("(client)sent \n");
     msgsnd(msgqid,&msg,1024,0);  /*发送消息msg入msgid消息队列*/
   }
   exit(0);
}
main()
{
   
   while((i=fork())==-1);
   if(!i) CLIENT();
   wait(0);
}
