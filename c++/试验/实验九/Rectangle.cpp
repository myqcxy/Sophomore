#include"Rectangle.h"//包含类 
#include<iostream>
using namespace std;

#include<iomanip>//控制输出格式 
using std::fixed;

Rectangle::Rectangle(double lg,double we)//构造函数，设置长和宽 
:TwoDShape()//成员初始化器初始化基类 
{
	setLong(lg);//调用设置函数 
	setWide(we);
}
Rectangle::~Rectangle()//析构函数 
{
	
}
void Rectangle::setLong(double lg) 
{
	l = lg > 0 ? lg : 1.0;//当长合法时设置，否则设置为1.0 
}
double Rectangle::getLong()const
{
	return l;//返回矩形的长 
}
double Rectangle::getWide()const
{
	return w;//返回矩形的宽 
}
void Rectangle::setWide(double we)
{
	w = we > 0 ? we : 1.0;//设置矩形的宽，当宽小于或等于 0时设置为1.0 
}
double Rectangle::area()const
{
	return l * w;//重写基类的求面积函数，返回矩形的面积 
}
void Rectangle::print()const//输出矩形的信息 
{
	cout << fixed << setprecision(2);
	TwoDShape::print();
	cout << "rectangle";
	cout << "\nthe long is " << getLong();
	cout << "\nthe wide is " << getWide();
//	cout << "\nthe area is " << area() <<endl;
}
