//#include<iostream>
#include"coordinate.h"
#include<math.h>
ostream& operator<<(ostream& output,const coordinate &temp)
{
	output << "(" << temp.coordinate_x() << "," << temp.coordinate_y() << ")";

	return output;
}
istream &operator>>(istream& input,coordinate &temp)
{
	input.ignore(); 
	input >> temp.x;
	input.ignore();
	input >>temp.y;
	input.ignore();
	return input;
}
coordinate::coordinate(double a,double b)
{
	setdate(a,b);
}
void coordinate::setdate(double a, double b)
{
	x = a;
	y = b;
}

double  coordinate::coordinate_x()const
{
	return x;
}
double  coordinate::coordinate_y()const
{
	return y;
}
void coordinate::increment()
{
	x++;
	y++;
}
coordinate& coordinate::operator++()
{
	increment();
	return *this;
}
coordinate coordinate::operator++(int a)
{
	coordinate temp = *this;
	increment();
	return temp;
}

