#include"GradeBook.h"
GradeBook::GradeBook(string name)
{
	setCourseName(name);
}
void GradeBook::setCourseName(string name)
{
	courseName = name;
}
string GradeBook::getCourseName()
{
	return courseName;
}
