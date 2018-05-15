#include<iostream>
using namespace std;
#include<iomanip>
#include"coordinate.h"

int main()
{
	double a, b, x, y;
	cout << "请输入一个点的坐标：" <<endl;
	cin >> a >> b; 
	coordinate s(a,b);
	cout << "请输入另一个点的坐标：" <<endl;
	cin >> x >> y; 
	coordinate t(x,y);
	cout << setiosflags(ios::fixed) << setprecision(2) << "The distance between ("
	<< s.get_x()<<","<<s.get_y()
	<<") and (" << t.get_x() <<"," << t.get_y() << ") is "<<s.distance(t) 
	<< "(通过成员函数计算)  "<< friendDistance(t,s) << "(通过友元函数计算)" <<  endl;
	putchar(10);
	putchar(10);
	return 0;
}

