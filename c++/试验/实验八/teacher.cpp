#include"teacher.h"
#include<iostream>
using namespace std;

teacher::teacher(string I,string N,string S,int A,string T,string D)
:person(I,N,S,A)
{
	setDepartment(D);
	setTitle(T);
}
void teacher::setDepartment(string D) 
{
	department = D;
}
void teacher::setTitle(string T) 
{
	title = T;
}
string teacher::getDepartment() const
{
	return department;
}
string teacher::getTitle() const
{
	return title;
}
void teacher::print()const
{
	person::print();
	cout << " " <<  getTitle()<< " " << getDepartment();
}

teacher::~teacher()
{
	
}
