#include <iostream>
using namespace std;

#include "maximum.h"
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int a, b, c;
	cout << "Input three integer vlaue: "  << endl;
	cin >> a >> b >> c;
	cout << maximum(a,b,c)<<endl;
	double d1,d2,d3;
	cout << "Input three double calues: " << endl;
	cin >> d1>>d2>>d3;
	cout <<maximum(d1,d2,d3) << endl;
	
	char c1, c2, c3;
	cin >> c1>>c2>>c3;
	cout << "Input three characters: " <<maximum(c1,c2,c3) << endl;
	
	
	
	
	
	return 0;
}
