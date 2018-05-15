#include<string>
using std::string;
class GradeBook
{
	public:
	GradeBook(string);
	void setCourseName(string) ;
	string getCourseName();
	private:
		string courseName;
	
};
