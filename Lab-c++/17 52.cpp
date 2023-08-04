#include<iostream>
using namespace std;
int main(){
    int a=1;
    int b=0;
    int c;
for(int i=1; i<15; i++){
    c=a+b;
    cout<<c<<"\n";
    a=b;
    b=c;
}
return 0;
}
