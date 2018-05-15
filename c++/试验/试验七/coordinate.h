#ifndef COORDIANTE_H
#define COORDIANTE_H
#include<iostream>
using namespace std;
 
class coordinate{
	friend ostream &operator<<(ostream&,const coordinate&);
	friend istream &operator>>(istream&,coordinate&);
	public:
		coordinate(double=0.0,double=0.0);
		void setdate(double,double);
		double coordinate_x()const;
		double coordinate_y()const;
		void increment();
		coordinate &operator++();
		coordinate operator++(int);
	private:
		double x;
		double y;
};
#endif


