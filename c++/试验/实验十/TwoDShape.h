#ifndef TWODSHAPE_H
#define TWODSHAPE_H


class TwoDShape{
	public:
		TwoDShape();//���캯��
		virtual double area()const=0;//�����άͼ�ε����
		virtual void print()const;
		virtual ~TwoDShape();//virtual�������� 
};

#endif
