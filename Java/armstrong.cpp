#include<iostream>
using namespace std;
int main(){
	int n, originalnum, r,  result=0;
	cout<<"Enter the number:";
	cin>>n;
	originalnum = n;
	
	while(originalnum != 0){
		r = originalnum % 10;
		result += r*r*r;
		originalnum /= 10;
	}
	if(result==n){
		cout<<"It is a armstrong num:";
}
	else{
	cout<<"It is not a armstrong num:";
}
}

