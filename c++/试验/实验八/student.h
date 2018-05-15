#ifndef STUDENT_H
#define STUDENT_H
#include"person.h"

class student : public person
{
	public:
		student(string,string,string,int,string,double);
		~student();
		void setDepartment(string);
		void setScore(double);
		string getDepartment() const;
		double getScore() const;
		void print() const;
	private:
		string department;
		double score;
};
#endif

