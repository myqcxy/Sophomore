#include <iostream.h>
class Test
{private:
int x,y=20;
public:
Test(int i,int j){x=i,y=j;}
int getx(){return x;}
int gety(){return y;}
};
void main()
{Test mt(10,20);
cout<<mt.getx()<<endl;
cout<<mt.gety()<<endl;
}

