#include <iostream>//��������������ļ� 
using namespace std;//ʹ�������ռ� std 

//�����������ͷ�ļ� 
#include"TwoDShape.h" 
#include"Rectangle.h"
#include"Circle.h"

#include<vector>//����vector�ļ�ʹ��vector 
using std::vector;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	double x, y, r;
	double w, l;
	cout << "please input two real numbers as the heart :\n";
	cin >> x >> y;
	cout << "please input the radius :\n";
	cin >> r;
	Circle  c(x,y,r);//ʵ����Circle�� 
	cout << "please input the long and wide of rectangle:\n";
	cin >> l >> w;
	Rectangle q(l,w);//ʵ���� Rectangle�� 
	vector<TwoDShape *> t(2);//��������TwoDShape���͵�ָ�� 
	t[0] = &c;//ʹ����ָ��ָ����������� 
	t[1] = &q;
	for(int i = 0; i < 2;i++)//ͨ������ָ�����������������Ϣ 
	{
		t[i] -> print();
		cout << "\nthe area is " << t[i]->area() << endl;
	}
	
	
	
	return 0;
}
