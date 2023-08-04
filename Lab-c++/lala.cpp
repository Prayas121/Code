#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter the value of num:";
    cin>>num;
for(int i=1; i<=8; i++){
   if(num%2==0){
    cout<<num<<"\n";
    num= num/2;
   }
   else {
    cout<<num<<"\n";
    num=3*num+1;
   }
}
return 0;
}
