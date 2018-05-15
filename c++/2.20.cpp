#include<iostream>
using namespace std;
#define PI 3.14159
int main()
{
	int r;
	cout << "Input a integers: " << endl;
	cin >> r;
	cout << "diameter is " << 2 * r << endl;
	cout << "Perimeter is " << 2 * PI * r << endl;
	cout << "area is " << PI * r * r << endl;
	return 0;
}
