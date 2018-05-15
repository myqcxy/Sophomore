#ifndef RECTANGLE_H
#define RECTANGLE_H

#include"TwoDShape.h"

class Rectangle : public TwoDShape
{
	public:
		Rectangle(double=1.0,double=1.0);
		virtual ~Rectangle();//virtualÎö¹¹º¯Êý 
		virtual double area()const;
		virtual void print()const;
		void setLong(double);
		void setWide(double);
		double getLong()const;
		double getWide()const;
		
	private:
		double l;
		double w;
		
};


#endif

