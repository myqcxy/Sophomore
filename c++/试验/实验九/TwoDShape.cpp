#include"TwoDShape.h" 

#include<iostream>
using namespace std;

TwoDShape::TwoDShape()//构造函数 
{
	
}
TwoDShape::~TwoDShape()
{
	
}
double TwoDShape::area()const//返回面积 
{
	return -1;//没有信息返回-1； 
}
void TwoDShape::print()const//输出信息 
{
	cout << "\nThis is a TwoDShape of ";
}
