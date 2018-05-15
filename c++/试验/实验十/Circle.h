#ifndef CRICLE_H
#define CRICLE_H
#include"TwoDShape.h"
class Circle : public TwoDShape
{
	public:
		Circle(double=0.0,double=0.0,double=1.0);
		virtual ~Circle();//virtualÎö¹¹º¯Êý 
		void setHeart(double,double);
		void setR(double);
		double getHeart_x()const;
		double getHeart_y()const;
		double get_r()const;
		virtual double area()const;
		virtual void print()const;
	private:
		double x;
		double y;
		double r;
};




#endif
