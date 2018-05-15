#include<iostream> 
#include<fstream>
#include<string>
using namespace std;

int main()
{
	ofstream f;
	f.open("文件.txt");
	if(!f)
	{
		cout << "文件打开失败！"<<endl;
		exit(0);
	 } 
	f <<"是的发送到" <<" "<< 123 << endl;
	f.close();
	string str;
	ifstream in;
	in.open("文件.txt");
	in >> str;
	cout << str;
	
	return 0;
}
