#include <iostream>
#include <string>
int main(){
 char temp[3];

 for(int i = 123;i<=987;i++){
 itoa(i, temp, 10);//ת����string
 if(temp[0] != temp[1] && temp[0] != temp[2] && temp[1] != temp[2]){
 int a = sqrt(i);
 if(a * a == i){
 std::cout << i << std::endl;
 }
 }
 }
 return 0;
} 
