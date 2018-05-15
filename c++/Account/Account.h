
class Account{
	public:
		Account(int);
		void credit(int);
		int getBalance();
		void debit(int);
	private:
		int balance;
};
