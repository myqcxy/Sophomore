#include<iostream>
using namespace std;
#include<iomanip>
#include"coordinate.h"

int main()
{
	double a, b, x, y;
	cout << "������һ��������꣺" <<endl;
	cin >> a >> b; 
	coordinate s(a,b);
	cout << "��������һ��������꣺" <<endl;
	cin >> x >> y; 
	coordinate t(x,y);
	cout << setiosflags(ios::fixed) << setprecision(2) << "The distance between ("
	<< s.get_x()<<","<<s.get_y()
	<<") and (" << t.get_x() <<"," << t.get_y() << ") is "<<s.distance(t) 
	<< "(ͨ����Ա��������)  "<< friendDistance(t,s) << "(ͨ����Ԫ��������)" <<  endl;
	putchar(10);
	putchar(10);
	return 0;
}

