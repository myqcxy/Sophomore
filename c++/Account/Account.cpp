#include<iostream>
#include"Account.h"
using namespace std;
Account::Account(int a)
{
	credit(a);
}
void Account::credit(int a)
{
	if(a < 0)
	a = 0;
	balance = a;
}
void Account::debit(int a)
{
	if(a > balance)
	cout << "��������"  << endl;
	return; 
	balance -= a;
	cout << "ȡ��ɹ������ú������ֽ�" << endl;
}
int Account::getBalance()
{
	return balance;
}
