#include"person.h"
#include<iostream>
using namespace std;

person::person(string I, string N,string S, int A)
{
	setId(I);
	setName(N);
	setSex(S);
	setAge(A);
}
void person::setId(string I)
{
	id = I;
}
void person::setName(string N)
{
	name = N;
}
void person::setSex(string S)
{
	sex = S;
}
void person::setAge(int A)
{
	age = A;
}
string person::getId() const
{
	return id;
}
string person::getName() const
{
	return name;
}
string person::getSex() const
{
	return sex;
}
int person::getAge() const
{
	return age;
}
void person::print()const
{
	cout << getId() << " "<< getName() << " " << getSex() << " " << getAge() << " years old";
}

person::~person()
{
}


