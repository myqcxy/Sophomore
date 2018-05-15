#ifndef TEACHER_H
#define TEACHER_H

#include"person.h"

class teacher : public person
{
	public:
		teacher(string, string,string,int,string,string);
		~teacher();
		void setTitle(string);
		void setDepartment(string);
		string getTitle() const;
		string getDepartment() const;
		void print()const;
	private:
		string title;
		string department;	
};
#endif
