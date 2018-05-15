#include<iostream>
using namespace std;
class math{
	public:
		math(int x, int y)
		{
			setnum(x,y);
		}
		void setnum(int x, int y)
		{
			a = x;
			b = y;
		}
		int add()
		{
			return a + b;
		}
		int sub()
		{
			return a - b;
		}
		int mult()
		{
			return a * b;
		}
		int div()
		{
			return a / b;
		}
		private:
			int a;
			int b;
};

int main()
{
	int a , b;
	cout << "请输入两个整数：\n" <<endl; 
	cin >> a >> b;
	math s(a,b);
	cout << "a + b = " << s.add() << "\n"
	<< "a - b = " << s.sub() << "\n" 
	<< "a * b = " << s.mult() << "\n"
	<< "a / b = " << s.div() << endl;
	a = 1.5;
	
	return 0;
}
