#include"TwoDShape.h" 

#include<iostream>
using namespace std;

TwoDShape::TwoDShape()
{
	
}
TwoDShape::~TwoDShape()
{
	cout << "TwoDShape destructor"<<endl;
}
void TwoDShape::print()const
{
	cout << "\nThis is a TwoDShape of ";
}
