#include <iostream>
using namespace std;

#include"TwoDShape.h"
#include"Rectangle.h"
#include"Circle.h"

#include<vector>
using std::vector;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	double x, y, r;
	double w, l;
	cout << "please input two real numbers as the heart :\n";
	cin >> x >> y;
	cout << "please input the radius :\n";
	cin >> r;

	cout << "please input the long and wide of rectangle:\n";
	cin >> l >> w;

	vector<TwoDShape *> t(2);
	t[0] = new Circle(x,y,r);//ʹ��new����Circle�����ҽ���ַ��������ָ�� 
	t[1] = new Rectangle(l,w);//ʹ��new����Rectange�����ҽ���ַ��������ָ�� 
	for(int i = 0; i < 2;i++)
	{
		t[i] -> print();
		cout << "\nthe area is " << t[i]->area() << endl;
		delete t[i];//ʹ��delete�ͷ��ڴ� 
	}
	
	return 0;
}
