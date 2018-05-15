#ifndef RECTANGLE_H
#define RECTANGLE_H

#include"TwoDShape.h"//包含需要继承的类 

class Rectangle : public TwoDShape//继承TwoDShape类 
{
	public:
		Rectangle(double=1.0,double=1.0);//构造函数，矩形的长和宽为1.0 
		~Rectangle();//析构函数 
		virtual double area()const;//重写基类的area函数，计算面积并返回 
		virtual void print()const;//重写基类的print函数，输出矩形的信息 
		void setLong(double);//设置矩形的长 
		void setWide(double);//设置矩形的宽 
		double getLong()const;//获取矩形的长 
		double getWide()const;//获取矩形的宽 
		
	private:
		double l;//长 
		double w;//宽 
		
};


#endif

