#include<iostream>

using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
#include "Account.h"
int main(int argc, char** argv) {
	Account a(-100);
	cout  << a.getBalance();
	a.debit(10);
	cout << a.getBalance();
	return 0;
}
