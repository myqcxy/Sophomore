#include <iostream>
using namespace std;
#include<iomanip> 
using std::setw;

#include<cstdlib>
using std::rand;
using std::srand;

#include<ctime>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	srand(time(0));
	for(int i = 1;i<=20;i++)
	{
		
		cout<<setw(10)<<setprecision(2)<<fixed <<(1.0+rand()%6);
		if(i%5==0)
		cout<<endl;
	}
	
	
	return 0;
}
