#include<iostream> 
#include<fstream>
#include<string>
using namespace std;

int main()
{
	ofstream f;
	f.open("�ļ�.txt");
	if(!f)
	{
		cout << "�ļ���ʧ�ܣ�"<<endl;
		exit(0);
	 } 
	f <<"�ǵķ��͵�" <<" "<< 123 << endl;
	f.close();
	string str;
	ifstream in;
	in.open("�ļ�.txt");
	in >> str;
	cout << str;
	
	return 0;
}
