#include"coordinate.h"
#include<cmath>
#include <iostream>
using namespace std;

coordinate::coordinate(double a,double b)
{
	cout << "���캯��������" << endl;
	setdate(a,b);
}
coordinate::coordinate(coordinate &t)
{
	x=t.x;
	y=t.y;
	cout << "�������캯��\n";
}
coordinate::~coordinate()
{
	cout << "��������������" << endl;
	
}
void coordinate::setdate(double a, double b)
{
	x = a;
	y = b;
}
double coordinate::distance(coordinate t)
{
	return sqrt(pow(t.get_x() - x,2)+pow(t.get_y() - y,2));
}
double  coordinate::get_x()
{
	return x;
}
double  coordinate::get_y()
{
	return y;
}
double friendDistance(coordinate t, coordinate b)
{
	return sqrt(pow(t.get_x() - b.get_x(),2)+pow(t.get_y() - b.get_y(),2));
}

