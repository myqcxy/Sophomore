#include <iostream>
#include "GradeBook.h"
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int gradesArray[GradeBook::students] = { 87, 68 , 94, 100, 83, 78, 85, 91, 76, 87};
	GradeBook m("CS101 Introduction to C++ Program",gradesArray);
	m.displayMessage();
	m.processGrades();
	
	
	return 0;
}
