

#include "student.h"
#include<iostream>
using namespace std;

student::student(string I, string N,string S, int A, string d,double s)
 :person(I,N,S,A)
{
	setDepartment(d);
	setScore(s);
}
void student::setDepartment(string d)
{
	department = d;
}
void student::setScore(double s)
{
	score = s;
}
string student::getDepartment() const
{
	return department;
}
double student::getScore() const
{
	return score;
}
void student::print()const
{	
	person::print();
	cout << " " << getDepartment() << " " << getScore();
}
student::~student()
{
	
}

