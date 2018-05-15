#include<iostream>
using namespace std;

#include<cstdlib>
using std::rand;
using std::srand;

#include<ctime>
using std::time;

int rollDice();

int main()
{
	enum Status{
		CONTINUE,WON,LOST
	};	
	Status gameStatus;
	int myPoint;
	srand(time(0));
	int sumOfDice = rollDice();
	
	switch(sumOfDice)
	{
		case 7:
		case 11:
			gameStatus = WON;break;
		case 2:
		case 3:
		case 12:
			gameStatus = LOST;break;
		default:
			gameStatus = CONTINUE;
			myPoint = sumOfDice;
			cout << "point is " << myPoint << endl;break; 
	}
	while(gameStatus == CONTINUE)
	{
		sumOfDice = rollDice();
		if(sumOfDice == myPoint)
		 gameStatus = WON;
		else
			if(sumOfDice == 7)
			gameStatus == LOST;
	}
	if(gameStatus == WON)
		cout << "player is wins"<< endl;
	else 
		cout << "player is loses"<<endl;
	
	return 0;
}
int rollDice()
{
	int die1 = 1 + rand() % 6;
	int die2 = 1 + rand() % 6;
	int sum = die1 + die2;
	cout << "player rolled " << die1 << "+" << die2 << "=" <<sum << endl;
	return sum;
	
	
}



