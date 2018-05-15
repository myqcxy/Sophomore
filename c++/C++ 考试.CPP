#include<iostream>
using std::cout;
using std::cin;
using std::endl;

#include<string>
using std::string;

#include<iomanip>
using std::setw;
using std::setfill;

#include<vector>
using std::vector;

int main()
{
	cout << setfill('.') <<setw(5) <<3<< endl;
	string name="123456";
	cout<<name.find("12")<<endl;
	string str("HelloC++");
	cout<<str.substr(0,3);
	vector<int*> v1(4);
//	ector <int>V2(V1);
//	int v1[10];
	vector<int*> v2(v1);
//	v2 = v1;
	cout << *v1 << *v2;
//	protected

	return 0;
}