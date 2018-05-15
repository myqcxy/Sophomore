#ifndef TWODSHAPE_H
#define TWODSHAPE_H


class TwoDShape{
	public:
		TwoDShape();//构造函数
		virtual double area()const=0;//计算二维图形的面积
		virtual void print()const;
		virtual ~TwoDShape();//virtual析构函数 
};

#endif
