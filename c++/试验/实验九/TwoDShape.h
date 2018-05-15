#ifndef TWODSHAPE_H
#define TWODSHAPE_H

//定义TwoDShape类 
class TwoDShape{
	public:
		TwoDShape();//构造函数
		virtual double area()const;//计算二维图形的面积
		virtual void print()const;//输出信息 
		~TwoDShape();//析构函数 
};
//定义TwoDShape类结束 
#endif
