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
	cout << "提款金额超过余额！"  << endl;
	return; 
	balance -= a;
	cout << "取款成功，请拿好您的现金！" << endl;
}
int Account::getBalance()
{
	return balance;
}
