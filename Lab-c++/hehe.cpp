#include<iostream>
using namespace std;
int main(){
int num;
cout<<"Enter the n:";
cin>>num;
while(num>0){
   int digit = num%10;
   num/ = 10;
   cout<<digit<<"\n The square is:";
   int result = digit*digit;
   cout<<result<<"\n";
}

}

