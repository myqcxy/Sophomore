#include"Rectangle.h"
#include<iostream>
using namespace std;

#include<iomanip>
using std::fixed;

Rectangle::Rectangle(double lg,double we)
:TwoDShape()
{
	setLong(lg);
	setWide(we);
}
Rectangle::~Rectangle()
{
	cout << "Rectangle destructor"<<endl;
}
void Rectangle::setLong(double lg)
{
	l = lg > 0 ? lg : 1.0;
}
double Rectangle::getLong()const
{
	return l;
}
double Rectangle::getWide()const
{
	return w;
}
void Rectangle::setWide(double we)
{
	w = we > 0 ? we : 1.0;
}
double Rectangle::area()const
{
	return l * w;
}
void Rectangle::print()const
{
	cout << fixed << setprecision(2);
	TwoDShape::print();
	cout << "rectangle";
	cout << "\nthe long is " << getLong();
	cout << "\nthe wide is " << getWide();
//	cout << "\nthe area is " << area() <<endl;
}
