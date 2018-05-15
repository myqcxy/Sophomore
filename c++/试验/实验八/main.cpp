#include <iostream>
using namespace std;

#include"student.h"
#include"teacher.h"
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	
	student s("000001","Jack","man",20,"software",85.2);
	teacher t("000002","Jack","man",20,"software","teacher");
	
	s.print();
	cout << "\n\n" ;
	t.print();
	cout << endl;
	
	return 0;
}
