#ifndef CRICLE_H
#define CRICLE_H
#include"TwoDShape.h"//������Ҫ���̳е��� 
class Circle : public TwoDShape//�̳� 
{
	public:
		Circle(double=0.0,double=0.0,double=1.0);//���캯�� ��Ĭ��Ϊ��λԲ 
		~Circle();//�������� 
		void setHeart(double,double);//����Բ�� 
		void setR(double);//���ð뾶 
		double getHeart_x()const;//��ȡԲ�ĵĺ����� 
		double getHeart_y()const;//��ȡԲ�ĵ������� 
		double get_r()const;//��ȡ�뾶 
		virtual double area()const;//��д������������ 
		virtual void print()const;//���Բ����Ϣ 
	private:
		double x;//������ 
		double y;//������ 
		double r;//�뾶 
};




#endif
