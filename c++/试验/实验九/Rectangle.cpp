#include"Rectangle.h"//������ 
#include<iostream>
using namespace std;

#include<iomanip>//���������ʽ 
using std::fixed;

Rectangle::Rectangle(double lg,double we)//���캯�������ó��Ϳ� 
:TwoDShape()//��Ա��ʼ������ʼ������ 
{
	setLong(lg);//�������ú��� 
	setWide(we);
}
Rectangle::~Rectangle()//�������� 
{
	
}
void Rectangle::setLong(double lg) 
{
	l = lg > 0 ? lg : 1.0;//�����Ϸ�ʱ���ã���������Ϊ1.0 
}
double Rectangle::getLong()const
{
	return l;//���ؾ��εĳ� 
}
double Rectangle::getWide()const
{
	return w;//���ؾ��εĿ� 
}
void Rectangle::setWide(double we)
{
	w = we > 0 ? we : 1.0;//���þ��εĿ�����С�ڻ���� 0ʱ����Ϊ1.0 
}
double Rectangle::area()const
{
	return l * w;//��д�������������������ؾ��ε���� 
}
void Rectangle::print()const//������ε���Ϣ 
{
	cout << fixed << setprecision(2);
	TwoDShape::print();
	cout << "rectangle";
	cout << "\nthe long is " << getLong();
	cout << "\nthe wide is " << getWide();
//	cout << "\nthe area is " << area() <<endl;
}
