#include<iostream>
#include<string>
using std::string;
using std::cout;
using std::endl;
#include"GradeBook.h" 
int main()
{
	GradeBook myGradeBook1("asdf");
//	GradeBook book2("CS2");
	cout << "book1 created for course: " << myGradeBook1.getCourseName()
	<< "\nbook2 created for course : " << /*book2.getCourseName() <<*/ endl;
	
	
	return 0;
}
