#include <iostream>
using namespace std;
#include"Time.h"
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int i;
	for( i = 0; i < 10 ;i++)
	;
	Time t;
	cout << "The initial universal time is ";
	t.printUniversal();
	cout << "The initial standard Time is ";
	t.printStandard();
	cout << endl;
	t.setTime(100,2,3);
	cout << "The initial universal time is ";
	t.printUniversal();
	cout << "The initial standard Time is ";
	t.printStandard();
	
	
	return 0;
}
