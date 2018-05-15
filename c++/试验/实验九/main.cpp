#include <iostream>//包含输出输入流文件 
using namespace std;//使用命名空间 std 

//包含三个类的头文件 
#include"TwoDShape.h" 
#include"Rectangle.h"
#include"Circle.h"

#include<vector>//包含vector文件使用vector 
using std::vector;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	double x, y, r;
	double w, l;
	cout << "please input two real numbers as the heart :\n";
	cin >> x >> y;
	cout << "please input the radius :\n";
	cin >> r;
	Circle  c(x,y,r);//实例化Circle类 
	cout << "please input the long and wide of rectangle:\n";
	cin >> l >> w;
	Rectangle q(l,w);//实例化 Rectangle类 
	vector<TwoDShape *> t(2);//定义两个TwoDShape类型的指针 
	t[0] = &c;//使基类指针指向派生类对象 
	t[1] = &q;
	for(int i = 0; i < 2;i++)//通过基类指针输出派生类对象的信息 
	{
		t[i] -> print();
		cout << "\nthe area is " << t[i]->area() << endl;
	}
	
	
	
	return 0;
}
