#include<iostream>
using namespace std;
#include<iomanip>
#include"coordinate.h"

int main()
{
	
	double a, b;
	cout << "请输入两个实数：" <<endl;
	cin >> a >> b; 
	coordinate s(a,b);
	cout << setiosflags(ios::fixed) << setprecision(2) << "The distance between ("
	<< s.coordinate_x()<<","<<s.coordinate_y()
	<<") and (0,0) is "<<s.distanceToOrigin() <<endl;
	
	
	return 0;
}
