#include<iostream>
using namespace std;
int fab(int num) {
int n1 =0;
int temp;
int num3;
cout <<"Enter a num:";
cin>>num3;
for(int i=0; i<num; i++){
    temp = n1+num3;
    n1 = num3;
    num3 = temp;
    cout<<temp<<"\n";
}
}
int main(){
int result = fab(5);
int res = fab(9);
}




