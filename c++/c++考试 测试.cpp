#include<iostream>
using namespace std;
#include<string>
using std::string;

#include<iomanip>
using std::setw;
using std::setfill;

#include<vector>
using std::vector;

int main()
{
	cout << right << setw(10);
	cout << setfill('.') <<setw(5) <<3<< endl;
	string name="123456";
	cout<<name.find("12")<<endl;
	string str("HelloC++");
	cout<<str.substr(0,3) << endl;
//	cin.getline(name);
	cout << name << endl;
	vector<int*> v1(4);
//	ector <int>V2(V1);
	vector<int*> v2(4); 
//	v2 = v1;
	int a = 10;
	cin >> a >> endl;
	cerr << a << endl;
//	cout << v1 << v2;
	cout << right << setw(10);
//	protected
/*	double a = 3.14;
	cout << static_cast<int>(a) << endl;
	cout << right << setw(10);
	cout << a<<endl;
*/
	return 0;
}
