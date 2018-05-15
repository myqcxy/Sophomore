#include<iostream>
using namespace std;

#include<iomanip>
using std::setprecision;
using std::fixed;

#include "GradeBook.h"
/*
GradeBook::GradeBook( string name , const int gradesArray[])
{
	setCourseName(name);
	
	for(int grade = 0; grade < students; grade++)
	{
		grades[ grade ] = gradesArray[ grade ];
	}
}
void GradeBook::setCourseName( string name)
{
	courseName = name;
}
string GradeBook::getCourseName()
{
	return courseName;
}
void GradeBook::displayMessage()
{
	cout << "Welcome to the grade book for\n" << getCourseName() << "!" << endl;
}
void GradeBook::processGrades()
{
	outputGrades();
	cout << "Class average is " << setprecision(2) << fixed << getAverage() << endl;
	cout << "Lowest grade is" << getMinimum() << "\nHighest grade is" << getMaximum() << endl;
	outputBarChart();
}
int GradeBook::getMinimum()
{
	int lowGrade = 100;
	for( int i = 0; i < students; i++)
	{
		if(grades[ i ] < lowGrade)
		  lowGrade = grades[i];
		return lowGrade;
	}
	
}
int GradeBook::getMaximum()
{
	int highGrade = 0;
	for(int i = 0;i < students; i++)
	if(grades[i] > highGrade)
	highGrade = grades[i];
	return highGrade;
	
}
double GradeBook::getAverage()
{
	int total = 0;
	for(int i = 0; i < students;i++)
	total += grades[i];
	
	return static_cast< double > (total) / students;
}	
void GradeBook::outputBarChart()
{
	cout << "\nGrade distribution:" << endl;
	const int frequencySize = 11;
	int frequency[ frequencySize ] = {0};
	for( int i = 0;i < students;i++)
	frequency[grades[i] / 10]++;
	for(int count = 0; count < frequencySize;count++)
	{
		if(count == 0)
		cout << " 0-9: ";
		else if(count==10)
		cout <<" 100: ";
		else
		cout << count * 10 << "-" << (count * 10 ) + 9 << ": ";
		for(int stars = 0; stars < frequency[ count ]; stars++)
		cout << "*";
		cout << endl;
	}
}
void GradeBook::outputGrades()
{
	cout << "\nThe grades are:\n\n";
	for(int i = 0;i < students; i++)
	cout << "Student " << setw(2) << i + 1 <<": " <<setw(3) << grades[i] << endl; 
}
*/


