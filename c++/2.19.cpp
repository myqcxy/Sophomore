#include<iostream> 

using namespace std;
int main()
{
	int a, b, c;
	cout << "Input three different intergers:\n";
	cin >> a >> b >> c;
	cout << "Sum is " << a + b + c << endl;
	cout << "Average is " << (a + b + c) / 3 << endl;
	cout << "Product is " << a * b * c << endl;
	cout << "Smallest is " << (((a < b ? a : b) < c) ? (a < b ? a : b) : c) << endl;
	cout << "Largest is " << (((a > b ? a : b) > c) ? (a > b ? a : b) : c) << endl;
	
	
	
	return 0;
}
