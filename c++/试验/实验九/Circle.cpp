#include"Circle.h"
#define PI 3.14159//∫Í∂®“Â¶– 

#include<iostream>
using namespace std;

#include<iomanip>
using std::fixed;

Circle::Circle(double heartX,double heartY,double rs)
:TwoDShape()
{
	setHeart(heartX,heartY);
	setR(rs);
}
Circle::~Circle()
{
	
}
void Circle::setHeart(double heartX,double heartY)
{
	x = heartX > 0 ? heartX : 1.0;
	y = heartY > 0 ? heartY : 1.0;
}
void Circle::setR(double rs)
{
	r = rs > 0 ? rs : 1.0;
}
double Circle::getHeart_x()const
{
	return x;
}
double Circle::getHeart_y()const
{
	return y;
}
double Circle::get_r()const
{
	return r;
}
double Circle::area()const
{
	return PI * r * r;
}
void Circle::print()const
{
	cout << fixed << setprecision(2);
	TwoDShape::print();
	cout << "circle";
	cout << "\nthe heart is (" << getHeart_x() << "," << getHeart_y() << ")";
	cout << "\nthe radius is " << get_r();
//	cout << "\nthe area is " << area() << endl;
}
