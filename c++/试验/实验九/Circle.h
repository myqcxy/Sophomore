#ifndef CRICLE_H
#define CRICLE_H
#include"TwoDShape.h"//包含需要被继承的类 
class Circle : public TwoDShape//继承 
{
	public:
		Circle(double=0.0,double=0.0,double=1.0);//构造函数 ，默认为单位圆 
		~Circle();//析构函数 
		void setHeart(double,double);//设置圆心 
		void setR(double);//设置半径 
		double getHeart_x()const;//获取圆心的横坐标 
		double getHeart_y()const;//获取圆心的纵坐标 
		double get_r()const;//获取半径 
		virtual double area()const;//重写面积并返回面积 
		virtual void print()const;//输出圆的信息 
	private:
		double x;//横坐标 
		double y;//纵坐标 
		double r;//半径 
};




#endif
