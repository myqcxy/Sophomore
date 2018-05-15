#ifndef PERSON_H
#define PERSON_H
#include<string>
using std::string;

class person
{
public:
	person(string ,string ,string ,int);
	~person(void);
	void setId(string);
	void setName(string);
	void setSex(string);
	void setAge(int);
	string  getId()const; 
	string  getName()const;
	string  getSex()const;
	int getAge()const;
	void print()const;
private:
	string id;
	string name;
	string sex;
	int age;
};
#endif
