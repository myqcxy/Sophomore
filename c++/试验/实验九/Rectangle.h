#ifndef RECTANGLE_H
#define RECTANGLE_H

#include"TwoDShape.h"//������Ҫ�̳е��� 

class Rectangle : public TwoDShape//�̳�TwoDShape�� 
{
	public:
		Rectangle(double=1.0,double=1.0);//���캯�������εĳ��Ϳ�Ϊ1.0 
		~Rectangle();//�������� 
		virtual double area()const;//��д�����area������������������� 
		virtual void print()const;//��д�����print������������ε���Ϣ 
		void setLong(double);//���þ��εĳ� 
		void setWide(double);//���þ��εĿ� 
		double getLong()const;//��ȡ���εĳ� 
		double getWide()const;//��ȡ���εĿ� 
		
	private:
		double l;//�� 
		double w;//�� 
		
};


#endif

